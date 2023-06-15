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
public class datasetKonfirmasiPembayaran {
    private ArrayList<String> AtasNama;
    private ArrayList<String> ScanFoto;
    private ArrayList<String> Berita;
    private ArrayList<Integer> noPesan;
    private ArrayList<String> BankKirim;
    private ArrayList<Integer> idPembayaran;
    private ArrayList<Integer> idKonfirm;
    private ArrayList<Integer> Jumlah;
    private ArrayList<Integer> TglTransfer;
    
    public datasetKonfirmasiPembayaran (){
        AtasNama = new ArrayList<String>();
        ScanFoto = new ArrayList<String>();
        Berita = new ArrayList<String>();
        noPesan = new ArrayList<Integer>();
        BankKirim = new ArrayList<String>();
        idPembayaran = new ArrayList<Integer>();
        idKonfirm = new ArrayList<Integer>();
        Jumlah = new ArrayList<Integer>();
        TglTransfer = new ArrayList<Integer>();
    }
    
    public void insertAtasNama(String isi){
        this.AtasNama.add(isi);
    }
    public ArrayList<String> getRecordAtasNama (){
        return this.AtasNama;
    }
    
    public void insertScanFoto(String isi){
        this.ScanFoto.add(isi);
    }
    public ArrayList<String> getRecordScanFoto (){
        return this.ScanFoto;
    }
    
    public void insertBerita(String isi){
        this.Berita.add(isi);
    }
    public ArrayList<String> getRecordBerita (){
        return this.Berita;
    }
    
    public void insertnoPesan(int isi){
        this.noPesan.add(isi);
    }
    public ArrayList<Integer> getRecordnoPesan (){
        return this.noPesan;
    }
    
    public void insertBankKirim(String isi){
        this.BankKirim.add(isi);
    }
    public ArrayList<String> getRecordBankKirim (){
        return this.BankKirim;
    }
    
    public void insertidPembayaran(int isi){
        this.idPembayaran.add(isi);
    }
    public ArrayList<Integer> getRecordidPembayaran (){
        return this.idPembayaran;
    }
    
    public void insertidKonfirm(int isi){
        this.idKonfirm.add(isi);
    }
    public ArrayList<Integer> getRecordidKonfirm (){
        return this.idKonfirm;
    }
    
    public void insertJumlah(int isi){
        this.Jumlah.add(isi);
    }
    public ArrayList<Integer> getRecordJumlah (){
        return this.Jumlah;
    }
    
    public void insertTglTransfer(int isi){
        this.TglTransfer.add(isi);
    }
    public ArrayList<Integer> getRecordTglTransfer (){
        return this.TglTransfer;
    }
    
    public void insertKonfirmasiPembayaran (String AtasNama, String ScanFoto, String Berita, int noPesan, String BankKirim, 
            int idPembayaran, int idKonfirm, int Jumlah, int TglTransfer){
        this.AtasNama.add(AtasNama);
        this.ScanFoto.add( ScanFoto);
        this.Berita.add(Berita);
        this.noPesan.add(noPesan);
        this.BankKirim.add(BankKirim);
        this.idPembayaran.add(idPembayaran);   
        this.idKonfirm.add(idKonfirm);  
        this.Jumlah.add(Jumlah);  
        this.TglTransfer.add(TglTransfer);   
    }
      
}
