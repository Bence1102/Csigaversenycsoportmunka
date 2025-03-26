package main;

public class CsigaVersenyJatek {

    private Csiga[] csigak;
    private int[] megy;
    private int kor;

    public CsigaVersenyJatek(Csiga[] csigak, int kor) {
        this.csigak = csigak;
        this.kor = kor;
        this.megy = new int[csigak.length];
    }

    public void verseny() {
        for (int i = 0; i < kor; i++) {
            for (int a = 0; a < csigak.length; a++) {
                int megtettUt = csigak[a].gyorsito();
                megy[a] += megtettUt;
            }
        }
    }

   public void eredmeny() {
    int maxTavolsag = megy[0];
    Csiga nyertes = csigak[0];

    

    for (int i = 0; i < csigak.length; i++) {
        String lep = "";
        for (int a = 0; a < megy[i]; a++) {
            lep += "-";
        }

        
        System.out.printf("\n" +csigak[i].getSzinKod() + csigak[i].getSzin() + " csiga " + "\n" + lep);

        if (megy[i] > maxTavolsag) {
            maxTavolsag = megy[i];
            nyertes = csigak[i];
        }
    }

    System.out.println("\n A győztes csiga: " + nyertes.getSzinKod() + nyertes.getSzin());
}


    public Csiga[] getCsigak() {
        return csigak;
    }

    public void setCsigak(Csiga[] csigak) {
        this.csigak = csigak;
    }

    public int[] getMegy() {
        return megy;
    }

    public void setMegy(int[] megy) {
        this.megy = megy;
    }

    public int getKor() {
        return kor;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public static void main(String[] args) {
        Csiga kek = new Csiga("kék", "\u001B[34m", "🐌");
        Csiga piros = new Csiga("Piros", "\u001B[31m", "🐌");
        Csiga zold = new Csiga("Zöld", "\u001B[32m", "🐌");

        Csiga[] csigak1 = {kek, piros, zold};
        CsigaVersenyJatek jatek = new CsigaVersenyJatek(csigak1, 10);
        jatek.verseny();
        jatek.eredmeny();

    }

}
