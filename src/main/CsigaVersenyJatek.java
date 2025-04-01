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
            int gyorsitottCsigaIndex = (int) (Math.random() * csigak.length);
            boolean gyorsitott = Math.random() < 0.2;

            for (int a = 0; a < csigak.length; a++) {
                int megtettUt;
                String lep = "";
                if (gyorsitott && a == gyorsitottCsigaIndex) {
                    megtettUt = 2;
                   
                    for (int j = 0; j < megtettUt; j++) {
                        lep += "=";
                    }
                } else {
                    megtettUt = 1;
                   
                    lep += "-";
                }
                megy[a] += megtettUt;

               
                System.out.printf("\n" + csigak[a].getSzinKod() + csigak[a].getSzin() + " csiga " + csigak[a].getSzinKod() + lep + csigak[a].getAbra() + "\u001B[0m");
            }
        }
    }

    public void eredmeny() {
        int maxTavolsag = megy[0];
        Csiga nyertes = csigak[0];

        for (int i = 0; i < csigak.length; i++) {
            String lep = "";
            for (int a = 0; a < megy[i]; a++) {
                lep += (a % 2 == 0) ? "-" : "=";
            }

            System.out.printf("\n" + csigak[i].getSzinKod() + csigak[i].getSzin() + " csiga " + "\n" + lep + csigak[i].getAbra());

            if (megy[i] > maxTavolsag) {
                maxTavolsag = megy[i];
                nyertes = csigak[i];
            }
        }

        System.out.println("\n A győztes csiga: " + nyertes.getSzinKod() + nyertes.getSzin() + " " + nyertes.getAbra());
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
        Csiga kek = new Csiga("Kék", "\u001B[34m", "🐌");
        Csiga piros = new Csiga("Piros", "\u001B[31m", "🐌");
        Csiga zold = new Csiga("Zöld", "\u001B[32m", "🐌");

        Csiga[] csigak1 = {kek, piros, zold};
        CsigaVersenyJatek jatek = new CsigaVersenyJatek(csigak1, 10);
        jatek.verseny();
        jatek.eredmeny();

    }

}