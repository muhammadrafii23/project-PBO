/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salary;

/**
 *
 * @author ACER
 */
public class KonfirmasiPembayaran {

    public static void insertidKonfirm() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    private int idKonfirm;
    private int noPesan;
    private int BankKirim;
    private int Jumlah;
    private int idPembayaran;
    private int TglTransfer;
    private String AtasNama;
    private String ScanFoto;
    private String Berita;
   
   public KonfirmasiPembayaran(){}
    //Construsktor
    public KonfirmasiPembayaran(int idKonfirm, int noPesan, int BankKirim, int Jumlah, int idPembayaran, 
            int TglPembayaran, int TglTransfer, String AtasNama, String ScanFoto, String Berita){
        this.idPembayaran = idPembayaran;
        this.noPesan = noPesan;
        this.BankKirim = BankKirim;
        this.Jumlah = Jumlah;
        this.idPembayaran = idPembayaran;
        this.TglTransfer = TglTransfer;
        this.AtasNama = AtasNama;
        this.ScanFoto = ScanFoto;
        this.Berita = Berita;
    }
    
     //Getter  dan Setter
    public int getidKonfirm(){
        return idKonfirm;
    }
    
    public void setidKonfirm(int idKonfirm){
        this.idKonfirm = idKonfirm;
    }
   
    public int getnoPesan(){
        return noPesan;
    }
    
    public void setnoPesan(int noPesan){
        this.noPesan = noPesan;
    }

    public int getBankKirim(){
        return BankKirim;
    }
    
    public void setBankKirim(int BankKirim){
        this.BankKirim = BankKirim;
    }
    
    public int getJumlah(){
        return Jumlah;
    }
    
    public void setJumlah(int Jumlah){
        this.Jumlah = Jumlah;
    }
    
    public int getidPembayaran(){
        return idPembayaran;
    }
    
    public void setidPembayaran(int idPembayaran){
        this.idPembayaran = idPembayaran;
    }
    
    public int getTgltransfer(){
        return TglTransfer;
    }
    
    public void setTglTransfer(int TglTransfer){
        this.TglTransfer = TglTransfer;
    }
    
    public String getAtasNama(){
        return AtasNama;
    }
    
    public void setAtasNama(String AtasNama){
        this.AtasNama = AtasNama;
    }
    
    public String getScanFoto(){
        return ScanFoto;
    }
    
    public void setScanFoto(String ScanFoto){
        this.ScanFoto = ScanFoto;
    }
    
    public String getBerita(){
        return Berita;
    }
    
    public void setBerita(String Berita){
        this.Berita = Berita;
    }
    
     //Method
    public void tampilkanInfoKonfirmasiPembayaran(){
        System.out.println("Id Konfirm : " + idKonfirm);
        System.out.println("No Pesan : " + noPesan);
        System.out.println("Bank Kirim : " + BankKirim);
        System.out.println("Jumlah : " + Jumlah);
        System.out.println("Id Pembayaran : " + idPembayaran);
        System.out.println("Tgl Transfer: " + TglTransfer);
        System.out.println("Atas Nama : " + AtasNama);
        System.out.println("Scan Foto : " + ScanFoto);
        System.out.println("Berita : " + Berita);
    }
    
}
