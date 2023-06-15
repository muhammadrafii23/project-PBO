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
public class datasetKendaraan {
    private ArrayList<String> nmKendaraan;
    private ArrayList<String> Spesifikasi;
    private ArrayList<String> SopirDalam;
    private ArrayList<String> SopirLuar;
    private ArrayList<String> Gambar;
    private ArrayList<Integer> kdKendaraan;
    private ArrayList<Integer> Harga12Jam;
    private ArrayList<Integer> Harga24Jam;
    
    
     public datasetKendaraan (){
        nmKendaraan = new ArrayList<String>();
        Spesifikasi = new ArrayList<String>();
        SopirDalam = new ArrayList<String>();
        SopirLuar = new ArrayList<String>();
        Gambar = new ArrayList<String>();
        kdKendaraan = new ArrayList<Integer>();
        Harga12Jam = new ArrayList<Integer>();
        Harga24Jam = new ArrayList<Integer>();
    }
     
    public void insertnmKendaraan(String isi){
        this.nmKendaraan.add(isi);
    }
    public ArrayList<String> getRecordnmKendaraan (){
        return this.nmKendaraan;
    }
    
    public void insertSpesifikasi(String isi){
        this.Spesifikasi.add(isi);
    }
    public ArrayList<String> getRecordSpesifikasi (){
        return this.Spesifikasi;
    }
    
    public void insertSopirDalam(String isi){
        this.SopirDalam.add(isi);
    }
    public ArrayList<String> getRecordSopirDalam (){
        return this.SopirDalam;
    }
    
    public void insertSopirLuar(String isi){
        this.SopirLuar.add(isi);
    }
    public ArrayList<String> getRecordSopirLuar (){
        return this.SopirLuar;
    }
    
    public void insertGambar(String isi){
        this.Gambar.add(isi);
    }
    public ArrayList<String> getRecordGambar (){
        return this.Gambar;
    }
    
    public void insertkdKendaraan(int isi){
        this.kdKendaraan.add(isi);
    }
    public ArrayList<Integer> getRecordkdKendaraan (){
        return this.kdKendaraan;
    }
    
    public void insertHarga12Jam(int isi){
        this.Harga12Jam.add(isi);
    }
    public ArrayList<Integer> getRecordHarga12Jam (){
        return this.Harga12Jam;
    }
    
    public void insertHarga24Jam(int isi){
        this.Harga24Jam.add(isi);
    }
    public ArrayList<Integer> getRecordHarga24Jam (){
        return this.Harga24Jam;
    }
    
    public void insertKendaraan(String nmKendaraan, String Spesifikasi, String SopirDalam, String SopirLuar, 
            String Gambar, int kdKendaraan, int Harga12Jam, int Harga24Jam){
        this.nmKendaraan.add(nmKendaraan);
        this.Spesifikasi.add( Spesifikasi);
        this.SopirDalam.add(SopirDalam);
        this.SopirLuar.add(SopirLuar);
        this.Gambar.add(Gambar);
        this.kdKendaraan.add(kdKendaraan);   
        this.Harga12Jam.add(Harga12Jam);  
        this.Harga24Jam.add(Harga24Jam);  
    }
}
