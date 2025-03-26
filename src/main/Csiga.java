
package main;


public class Csiga {
     private String szin;
     private String abra;
     private boolean gyorsitas;
     private String szinKod;
     
     
     
     
     public Csiga(String szin,String szinKod,String abra){
         this.szin=szin;
         this.szinKod=szinKod;
         this.gyorsitas=false;
         this.abra=abra;
     }
     
     
     
     
     public int megy(){
         if(Math.random()<0.2){
             gyorsitas=true;
         }
         return gyorsitas ? 2:1;
     }
}
