package main;

public class Csiga {

    private String szin;
    private String abra;
    private boolean gyorsitas;
    private String szinKod;

    public Csiga(String szin, String szinKod, String abra) {
        this.szin = szin;
        this.szinKod = szinKod;
        this.gyorsitas = false;
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

    public boolean getGyorsitas() {
        return gyorsitas;
    }

    public void setGyorsitas(boolean gyorsitas) {
        this.gyorsitas = gyorsitas;
    }

    public String getAbra() {
        return abra;
    }

    public void setAbra(String abra) {
        this.abra = abra;
    }
    public int gyosito() {
        if (Math.random() < 0.2) {
            gyorsitas = true;
        }
        return gyorsitas ? 2 : 1;
    }
}
