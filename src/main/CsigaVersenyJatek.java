
package main;


public class CsigaVersenyJatek {
    
    private Csiga[] csigak;
    private int[] megy;
    private int kor;
    
    public CsigaVersenyJatek(Csiga[] csigak, int kor){
        this.csigak=csigak;
        this.kor=kor;
        this.megy=new int[csigak.length];
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
    
    public void verseny(){
        
    }
    
    public static void main(String[] args) {
        
    }
    
}
