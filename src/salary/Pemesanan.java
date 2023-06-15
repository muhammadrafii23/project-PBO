/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salary;

/**
 *
 * @author ACER
 */
public class Pemesanan {
    private int noPesan;
    private int Tanggal;
    private String uname;
    private String JatuhTempo;
    private String StatusBayar;
    private String TotalBayar;
    
    public Pemesanan(){}
    //Construsktor
    public Pemesanan(int noPesan, int Tanggal, String uname, String JatuhTempo, String StatusBayar, String TotalBayar){
        this.noPesan = noPesan;
        this.Tanggal = Tanggal;
        this.uname = uname;
        this.JatuhTempo = JatuhTempo;
        this.StatusBayar = StatusBayar;
        this.TotalBayar = TotalBayar;
    }
    
    //Getter  dan Setter
    public int getnoPesan(){
        return noPesan;
    }
    
    public void setnoPesan(int noPesan){
        this.noPesan = noPesan;
    }
   
    public int getTanggal(){
        return Tanggal;
    }
    
    public void setTanggal(int Tanggal){
        this.Tanggal = Tanggal;
    }
    
    public String getuname(){
        return uname;
    }
    
    public void setuname(String uname){
        this.uname = uname;
    }
    
    public String getJatuhTempo(){
        return JatuhTempo;
    }
    
    public void setJatuhTempo(String JatuhTempo){
        this.JatuhTempo = JatuhTempo;
    }
    
    public String getStatusBayar(){
        return StatusBayar;
    }
    
    public void setStatusBayar(String StatusBayar){
        this.StatusBayar = StatusBayar;
    }
    
    public String getTotalBayar(){
        return TotalBayar;
    }
    
    public void setTotalBayar(String TotalBayar){
        this.TotalBayar = TotalBayar;
    }
    
    //Method
    public void tampilkanInfoPemesanan(){
        System.out.println("No Pesan : " + noPesan);
        System.out.println("Tanggal : " + Tanggal);
        System.out.println("Uname : " + uname);
        System.out.println("JatuhTempo : " + JatuhTempo);
        System.out.println("Status Bayar : " + StatusBayar);
        System.out.println("Total Bayar : " + TotalBayar);
    }
}

