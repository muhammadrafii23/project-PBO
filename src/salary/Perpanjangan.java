/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salary;

/**
 *
 * @author ACER
 */
public class Perpanjangan {
    private int idPerpanjangan;
    private int noPesan;
    private int JenisJam;
    
     public Perpanjangan(){}
    //Construsktor
    public Perpanjangan(int idPerpanjangan, int noPesan, int JenisJam){
        this.idPerpanjangan = idPerpanjangan;
        this.noPesan = noPesan;
        this.JenisJam = JenisJam;
    }
    
    //Getter  dan Setter
    public int getidPerpanjangan(){
        return idPerpanjangan;
    }
    
    public void setidPerpanjangan(int idPerpanjangan){
        this.idPerpanjangan = idPerpanjangan;
    }
    
    public int getnoPesan(){
        return noPesan;
    }
    
    public void setnoPesan(int noPesan){
        this.noPesan = noPesan;
    }
    
    public int getjenisJam(){
        return JenisJam;
    }
    
    public void JenisJam(int JenisJam){
        this.JenisJam = JenisJam;
    }
    
    //Method
    public void tampilkanInfoPerpanjangan(){
        System.out.println("Id Perpanjangan : " + idPerpanjangan);
        System.out.println("No Pesan : " + noPesan);
        System.out.println("Jenis Jam : " + JenisJam);
      
    }
}
