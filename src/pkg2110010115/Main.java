 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2110010115;


import salary.*;
import dataset.*;
import forms.*;

/**import salary.DetailPemesanan;
import salary.Kendaraan;
import salary.KonfirmasiPembayaran;
import salary.Member;
import salary.Pemesanan;
import salary.Perpanjangan;*/

/**
 *
 * @author ACER
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*DetailPemesanan DetailPemesanan = new DetailPemesanan();
        Kendaraan Kendaraan = new Kendaraan();
        KonfirmasiPembayaran KonfirmasiPembayaran = new KonfirmasiPembayaran();
        Member Member = new Member();
        Pemesanan Pemesanan = new Pemesanan();
        Perpanjangan Perpanjangan = new Perpanjangan();
        
        //set
        Member.setkdMember(1);
        Pemesanan.setnoPesan(3);
        
        //get
        System.out.println("Kd Member : " + Member.getkdMember());
        System.out.println("No Pesan : " + Pemesanan.getnoPesan());
        
        
        //Memasukkan Array List kedalam Objek
        datasetDetailPemesanan DetailPemesanan = new datasetDetailPemesanan();
        datasetKendaraan Kendaraan = new datasetKendaraan();
        datasetKonfirmasiPembayaran KonfirmasiPembayaran = new datasetKonfirmasiPembayaran();
        datasetMember Member = new datasetMember();
        datasetPemesanan Pemesanan = new datasetPemesanan();
        datasetPerpanjangan Perpanjangan = new datasetPerpanjangan();
        
        //Menginput data ArrayList pada masing-masing tabel
       DetailPemesanan.insertidPesan(001);
       DetailPemesanan.insertnoPesan(01);
       DetailPemesanan.insertkdKendaraan(1);
       DetailPemesanan.insertTglBooking(23052023);
       DetailPemesanan.insertJamBooking(01);
       DetailPemesanan.insertSopir("rafi");
       DetailPemesanan.insertTujuan("pulangPisau");
       DetailPemesanan.insertAlamatPenjemputan("banjarmasin");
       DetailPemesanan.insertJumlahJam(24);
       DetailPemesanan.insertStatusMobil("manual");
       DetailPemesanan.insertTglSelesai(25052023);
       DetailPemesanan.insertJamSelesai(17-00);
       DetailPemesanan.insertDetailPemesanan("rafi", "Banjarmasin", "Banjarbaru", "Manual", 02, 03, 36, 12052023, 02, 24, 15052023, 02);
       
       Kendaraan.insertkdKendaraan(001);
       Kendaraan.insertnmKendaraan("Pajero");
       Kendaraan.insertSpesifikasi("Lengkap");
       Kendaraan.insertHarga12Jam(50000);
       Kendaraan.insertHarga24Jam(100000);
       Kendaraan.insertSopirDalam("idak");
       Kendaraan.insertSopirLuar("iwan");
       Kendaraan.insertGambar("AAG");
       Kendaraan.insertKendaraan("Avanza", "-", "Fery", "-", "-", 001, 50000, 0);
      
       
       
       KonfirmasiPembayaran.insertidKonfirm(11);
       KonfirmasiPembayaran.insertnoPesan(01);
       KonfirmasiPembayaran.insertBankKirim(00030101);
       KonfirmasiPembayaran.insertAtasNama("Dian");
       KonfirmasiPembayaran.insertidPembayaran(10);
       KonfirmasiPembayaran.insertTglTransfer(20052023);
       KonfirmasiPembayaran.insertJumlah(50000);
       KonfirmasiPembayaran.insertScanFoto("AAA");
       KonfirmasiPembayaran.insertBerita("AMAN");
       KonfirmasiPembayaran.insertKonfirmasiPembayaran("Irwan", "BBB", "AMAN", 003, 00013700, 87, 56, 100000, 12042023);
       
       
       Member.insertkdMember(1);
       Member.insertuneme("Rudi");
       Member.insertPassword("A123");
       Member.insertNama("Rudi Arifin");
       Member.insertAlamat("Handil Bakti");
       Member.insertKota("Barito Kuala");
       Member.insertTlp(8);
       Member.insertEmail("ddhduhdhddd");
       Member.insertPekerjaan("Pedagang");
       Member.insertKunci1("1Kunci");
       Member.insertKunci2("2Kunci");
       Member.insertMember("Revan", "B123", "Revan Alifin", "Banjarmasin Utara", "Banjarmasin", "revan@gmail.com", "Pedagang", "1Kunci", "", 5, 1);
       
       
       Pemesanan.insertnoPesan(001);
       Pemesanan.insertuname("irwan");
       Pemesanan.insertTanggal(19052023);
       Pemesanan.insertJatuhTempo(24052023);
       Pemesanan.insertStatusBayar("Lunas");
       Pemesanan.insertTotalBayar(100000);
       Pemesanan.insertPemesanan("andre", 24052023, "Lunas", 100000, 23052023, 7);
       
       
       Perpanjangan.insertidPerpanjangan("AB");
       Perpanjangan.insertidnoPesan(001);
       Perpanjangan.insertidJenisJam("Dua Jam");
       Perpanjangan.insertPerpanjangan("BB", "Dua Jam", 002);
       
       //Menampilkan data ArrayList
       System.out.println("=====Detail Pemesanan=====");
       System.out.println(DetailPemesanan.getRecordidPesan());
       System.out.println(DetailPemesanan.getRecordnoPesan());
       System.out.println(DetailPemesanan.getRecordkdKendaraan());
       System.out.println(DetailPemesanan.getRecordTglBooking());
       System.out.println(DetailPemesanan.getRecordJamBooking());
       System.out.println(DetailPemesanan.getRecordSopir());
       System.out.println(DetailPemesanan.getRecordTujuan());
       System.out.println(DetailPemesanan.getRecordAlamatPenjemputan());
       System.out.println(DetailPemesanan.getRecordJumlahJam());
       System.out.println(DetailPemesanan.getRecordStatusMobil());
       System.out.println(DetailPemesanan.getRecordTglSelesai());
       System.out.println(DetailPemesanan.getRecordJamSelesai());
       
       System.out.println("\t");
       System.out.println("=====Kendaraan=====");
       System.out.println(Kendaraan.getRecordkdKendaraan());
       System.out.println(Kendaraan.getRecordnmKendaraan());
       System.out.println(Kendaraan.getRecordSpesifikasi());
       System.out.println(Kendaraan.getRecordHarga12Jam());
       System.out.println(Kendaraan.getRecordHarga24Jam());
       System.out.println(Kendaraan.getRecordSopirDalam());
       System.out.println(Kendaraan.getRecordSopirLuar());
       System.out.println(Kendaraan.getRecordGambar());
       
       System.out.println("\t");
       System.out.println("=====Konfirmasi Pembayaran=====");
       System.out.println(KonfirmasiPembayaran.getRecordidKonfirm());
       System.out.println(KonfirmasiPembayaran.getRecordnoPesan());
       System.out.println(KonfirmasiPembayaran.getRecordBankKirim());
       System.out.println(KonfirmasiPembayaran.getRecordAtasNama());
       System.out.println(KonfirmasiPembayaran.getRecordidPembayaran());
       System.out.println(KonfirmasiPembayaran.getRecordTglTransfer());
       System.out.println(KonfirmasiPembayaran.getRecordJumlah());
       System.out.println(KonfirmasiPembayaran.getRecordScanFoto());
       System.out.println(KonfirmasiPembayaran.getRecordBerita());
       
       System.out.println("\t");
       System.out.println("=====Member=====");
       System.out.println(Member.getRecordkdMember());
       System.out.println(Member.getRecorduname());
       System.out.println(Member.getRecordPassword());
       System.out.println(Member.getRecordNama());
       System.out.println(Member.getRecordAlamat());
       System.out.println(Member.getRecordKota());
       System.out.println(Member.getRecordTlp());
       System.out.println(Member.getRecordEmail());
       System.out.println(Member.getRecordPekerjaan());
       System.out.println(Member.getRecordKunci1());
       System.out.println(Member.getRecordKunci2());
       
       System.out.println("\t");
       System.out.println("=====Pemesanan=====");
       System.out.println(Pemesanan.getRecorduname());
       System.out.println(Pemesanan.getRecordnoPesan());
       System.out.println(Pemesanan.getRecordTanggal());
       System.out.println(Pemesanan.getRecordJatuhTempo());
       System.out.println(Pemesanan.getRecordStatusBayar());
       System.out.println(Pemesanan.getRecordTotalBayar());
       
       System.out.println("\t");
       System.out.println("=====Perpanjangan=====");
       System.out.println(Perpanjangan.getRecordidPerpanjangan());
       System.out.println(Perpanjangan.getRecordnoPesan());
       System.out.println(Perpanjangan.getRecordJenisJam());*/
       
       new frameUtama().setVisible(true);
       
       
   
        
    }
        
        
}
