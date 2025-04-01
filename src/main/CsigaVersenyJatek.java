package main;



import java.util.Scanner;


public class CsigaVersenyJatek {

    private Csiga[] csigak;
    private int[] megy;
    private int kor;
    private Csiga tippeltCsiga;

    public CsigaVersenyJatek(Csiga[] csigak, int kor) {
        this.csigak = csigak;
        this.kor = kor;
        this.megy = new int[csigak.length];
    }

    public void tippel() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Melyik csigára tippelsz a versenyen? (1 - Kék, 2 - Piros, 3 - Zöld): ");

        int tipp = scanner.nextInt();

        if (tipp == 1) {
            tippeltCsiga = csigak[0];
        } else if (tipp == 2) {
            tippeltCsiga = csigak[1];
        } else if (tipp == 3) {
            tippeltCsiga = csigak[2];
        } else {
            System.out.println("Érvénytelen tipp!");
            tippel();  
        }

        System.out.println("Te a " + tippeltCsiga.getSzin() + " csigára tippeltél!");
    }
    
    
    
    public void verseny() {
        for (int i = 0; i < kor; i++) {

            int gyorsitottCsiga = (int) (Math.random() * csigak.length);
            

            for (int a = 0; a < csigak.length; a++) {
                    int megtettUt = (a == gyorsitottCsiga) ? csigak[a].gyorsito() : csigak[a].getLepes();
            
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
                lep += (a % 2 == 0) ? "-" : "=";
            }

            System.out.printf("\n" + csigak[i].getSzinKod() + csigak[i].getSzin() + " csiga " + "\n" + lep + csigak[i].getAbra());

            if (megy[i] > maxTavolsag) {
                maxTavolsag = megy[i];
                nyertes = csigak[i];
            }
        }

        System.out.println("\n A győztes csiga: " + nyertes.getSzinKod() + nyertes.getSzin() + " " + nyertes.getAbra());
        
        if (nyertes == tippeltCsiga) {
            System.out.println("Gratulálok! Helyesen tippeltél, a " + nyertes.getSzin() + " csiga nyert!");
        } else {
            System.out.println("Sajnálom! Nem nyert a tippelt csigád.");
        }
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
        jatek.tippel();
        jatek.verseny();
        jatek.eredmeny();
       
    }

}