  /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataset;
import java.util.ArrayList;
/**
 *
 * @author ACER
 */
public class datasetDetailPemesanan {
    private ArrayList<String> Sopir;
    private ArrayList<String> Tujuan;
    private ArrayList<String> AlamatPenjemputan;
    private ArrayList<String> StatusMobil;
    private ArrayList<Integer> idPesan;
    private ArrayList<Integer> noPesan;
    private ArrayList<Integer> kdKendaraan;
    private ArrayList<Integer> TglBooking;
    private ArrayList<Integer> JamBooking;
    private ArrayList<String> JumlahJam;
    private ArrayList<Integer> TglSelesai;
    private ArrayList<Integer> JamSelesai;
    
    
    public datasetDetailPemesanan (){
        Sopir = new ArrayList<String>();
        Tujuan = new ArrayList<String>();
        AlamatPenjemputan = new ArrayList<String>();
        StatusMobil = new ArrayList<String>();
        idPesan = new ArrayList<Integer>();
        noPesan = new ArrayList<Integer>();
        kdKendaraan = new ArrayList<Integer>();
        TglBooking = new ArrayList<Integer>();
        JamBooking = new ArrayList<Integer>();
        JumlahJam = new ArrayList<String>();
        TglSelesai = new ArrayList<Integer>();
        JamSelesai = new ArrayList<Integer>();
    }
    
    public void insertSopir(String isi){
        this.Sopir.add(isi);
    }
    public ArrayList<String> getRecordSopir (){
        return this.Sopir;
    }
    
    public void insertTujuan(String isi){
        this.Tujuan.add(isi);
    }
    public ArrayList<String> getRecordTujuan (){
        return this.Tujuan;
    }
    
    public void insertAlamatPenjemputan(String isi){
        this.AlamatPenjemputan.add(isi);
    }
    public ArrayList<String> getRecordAlamatPenjemputan (){
        return this.AlamatPenjemputan;
    }
    
    public void insertStatusMobil(String isi){
        this.StatusMobil.add(isi);
    }
    public ArrayList<String> getRecordStatusMobil (){
        return this.StatusMobil;
    }
    
    public void insertidPesan(int isi){
        this.idPesan.add(isi);
    }
    public ArrayList<Integer> getRecordidPesan (){
        return this.idPesan;
    }
    
    public void insertnoPesan(int isi){
        this.noPesan.add(isi);
    }
    public ArrayList<Integer> getRecordnoPesan (){
        return this.noPesan;
    }
    
    public void insertkdKendaraan(int isi){
        this.kdKendaraan.add(isi);
    }
    public ArrayList<Integer> getRecordkdKendaraan (){
        return this.kdKendaraan;
    }
    
    public void insertTglBooking(int isi){
        this.TglBooking.add(isi);
    }
    public ArrayList<Integer> getRecordTglBooking (){
        return this.TglBooking;
    }
    
    public void insertJamBooking(int isi){
        this.JamBooking.add(isi);
    }
    public ArrayList<Integer> getRecordJamBooking (){
        return this.JamBooking;
    }
    
    public void insertJumlahJam(String isi){
        this.JumlahJam.add(isi);
    }
    public ArrayList<String> getRecordJumlahJam (){
        return this.JumlahJam;
    }
    
    public void insertTglSelesai(int isi){
        this.TglSelesai.add(isi);
    }
    public ArrayList<Integer> getRecordTglSelesai (){
        return this.TglSelesai;
    }
    
    public void insertJamSelesai(int isi){
        this.JamSelesai.add(isi);
    }
    public ArrayList<Integer> getRecordJamSelesai (){
        return this.JamSelesai;
    }
    
    public void insertDetailPemesanan(String Sopir, String Tujuan, String AlamatPenjemputan, String StatusMobil, 
            int idPesan, int noPesan, int kdKendaraan, int TglBooking, int JamBooking, String JumlahJam, 
            int TglSelesai, int JamSelesai){
        this.Sopir.add(Sopir);
        this.Tujuan.add( Tujuan);
        this.AlamatPenjemputan.add(AlamatPenjemputan);
        this.StatusMobil.add(StatusMobil);
        this.idPesan.add(idPesan);
        this.noPesan.add(idPesan);   
        this.kdKendaraan.add(kdKendaraan);  
        this.TglBooking.add(TglBooking);
        this.JamBooking.add(JamBooking);
        this.JumlahJam.add(JumlahJam);   
        this.TglSelesai.add(TglSelesai);  
        this.JamSelesai.add(JamSelesai);
    }

    public void insertuname(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void insertJatuhTempo(String duajam) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
 
}
