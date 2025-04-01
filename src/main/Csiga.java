package main;

public class Csiga {

    private String szin;
    private String abra;
    private int lepes;
    private String szinKod;

    public Csiga(String szin, String szinKod, String abra) {
        this.szin = szin;
        this.szinKod = szinKod;
        this.abra = abra;
    }

    

    public String getSzin() {
        return szin;
    }

    public void setSzin(String szin) {
        this.szin = szin;
    }

    public String getSzinKod() {
        return szinKod;
    }

    public void setSzinKod(String szinKod) {
        this.szinKod = szinKod;
    }

    public String getAbra() {
        return abra;
    }

    public void setAbra(String abra) {
        this.abra = abra;
    }
     public int lepes() {
        return 1; 
    }

    public int gyorsito() {
        return Math.random() < 0.2 ? 2 : 1; 
    }
}
