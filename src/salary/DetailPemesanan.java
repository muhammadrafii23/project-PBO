/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salary;

/**
 *
 * @author ACER
 */
public class DetailPemesanan {
    private int idPesan;
    private String noPesan;
    private String kdKendaraan;
    private String TglBooking;
    private String JamBooking;
    private String Sopir;
    private String Tujuan;
    private String AlamatPenjemputan;
    private String JumlahJam;
    private String StatusMobil;
    private String TglSelesai;
    private String JamSelesai;
    
    public DetailPemesanan(){}
    //Construsktor
    public DetailPemesanan(int idPesan, String noPesan, String kdKendaraan, String TglBooking, String JamBooking, String Sopir,
            String Tujuan, String AlamatPenjemputan, String JumlahJam, String StatusMobil, String TglSelesai, String JamSelesai){
        this.idPesan = idPesan;
        this.noPesan = noPesan;
        this.kdKendaraan = kdKendaraan;
        this.TglBooking = TglBooking;
        this.JamBooking = JamBooking;
        this.Sopir = Sopir;
        this.Tujuan = Tujuan;
        this.AlamatPenjemputan = AlamatPenjemputan;
        this.JumlahJam = JumlahJam;
        this.StatusMobil = StatusMobil;
        this.TglSelesai = TglSelesai;
        this.JamSelesai = JamSelesai;
    }
    
    //Getter  dan Setter
    public int getidPesan(){
        return idPesan;
    }
    
    public void setidPesan(int idPesan){
        this.idPesan = idPesan;
    }
    
    public String getnoPesan(){
        return noPesan;
    }
    
    public void setnoPesan(String noPesan){
        this.noPesan = noPesan;
    }
    
     public String getkdKendaraan(){
        return kdKendaraan;
    }
    
    public void setkdKendaraan(String kdKendaraan){
        this.kdKendaraan = kdKendaraan;
    }
    
     public String getTglBooking(){
        return TglBooking;
    }
    
    public void setTglBooking(String TglBooking){
        this.TglBooking = TglBooking;
    }
    
    public String getJamBooking(){
        return JamBooking;
    }
    
    public void setJamBooking(String JamBooking){
        this.JamBooking = JamBooking;
    }
    
    public String getSopir(){
        return Sopir;
    }
    
    public void setSopir(String Sopir){
        this.Sopir = Sopir;
    }
    
    public String getTujuan(){
        return Tujuan;
    }
    
    public void setTujuan(String Tujuan){
        this.Tujuan = Tujuan;
    }
    
    public String getAlamatPenjemputan(){
        return AlamatPenjemputan;
    }
    
    public void setAlamatPenjemputan(String AlamatPenjemputan){
        this.AlamatPenjemputan = AlamatPenjemputan;
    }
    
    public String getJumlahJam(){
        return JumlahJam;
    }
    
    public void setJumlahJam(String JumlahJam){
        this.JumlahJam = JumlahJam;
    }
    
     public String getStatusMobil(){
        return StatusMobil;
    }
    
    public void setStatusMobil(String StatusMobil){
        this.StatusMobil = StatusMobil;
    }
    
     public String getTglSelesai(){
        return TglSelesai;
    }
    
    public void setTglSelesai(String TglSelesai){
        this.TglSelesai = TglSelesai;
    }
    
    public String getJamSelesai(){
        return JamSelesai;
    }
    
    public void setJamSelesai(String JamSelesai){
        this.JamSelesai = JamSelesai;
    }
    
    //Method
    public void tampilkanInfoDetailPemesanan(){
        System.out.println("Id Pesan : " + idPesan);
        System.out.println("No Pesan : " + noPesan);
        System.out.println("Kd Kendaraan : " + kdKendaraan);
        System.out.println("Tgl Booking : " + TglBooking);
        System.out.println("Jam Booking : " + JamBooking);
        System.out.println("Sopir : " + Sopir);
        System.out.println("Tujuan : " + Tujuan);
        System.out.println("Alamat Penjemputan : " + AlamatPenjemputan);
        System.out.println("Jumlah Jam : " + JumlahJam);
        System.out.println("Status Mobil : " + StatusMobil);
        System.out.println("Tgl Selesai : " + TglSelesai);
        System.out.println("Jam Selesai : " + JamSelesai);
        
    }
            
}
