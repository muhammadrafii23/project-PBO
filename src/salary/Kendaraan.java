/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salary;

/**
 *
 * @author ACER
 */
public class Kendaraan {
    private int kdKendaraan;
    private String nmKendaraan;
    private String Spesifikasi;
    private String Harga12Jam;
    private String Harga24Jam;
    private String SopirDalam;
    private String SopirLuar;
    private String Gambar;
    
    public Kendaraan(){}
    //Construsktor
    public Kendaraan(int kdKendaraan, String nmKendaraan, String Spesifikasi, String Harga12Jam, String Harga24Jam,
            String SopirDalam, String SopirLuar, String Gambar){
        this.kdKendaraan = kdKendaraan;
        this.nmKendaraan = nmKendaraan;
        this.Spesifikasi = Spesifikasi;
        this.Harga12Jam = Harga12Jam;
        this.Harga24Jam = Harga24Jam;
        this.SopirDalam = SopirDalam;
        this.SopirLuar = SopirLuar;
        this.Gambar = Gambar;
    }
    
    //Getter  dan Setter
    public int getkdKendaraan(){
        return kdKendaraan;
    }
    
    public void setkdKendaraan(int kdKendaraan){
        this.kdKendaraan = kdKendaraan;
    }
    
    public String getnmKendaraan(){
        return nmKendaraan;
    }
    
    public void setnmKendaraan(String nmKendaraan){
        this.nmKendaraan = nmKendaraan;
    }
    
    public String getSpesifikasi(){
        return Spesifikasi;
    }
    
    public void setSpesifikasi(String Spesifikasi){
        this.Spesifikasi = Spesifikasi;
    }
    
     public String getHarga12Jam(){
        return Harga12Jam;
    }
    
    public void setHarga12Jam(String Harga12Jam){
        this.Harga12Jam = Harga12Jam;
    }

     public String getHarga24Jam(){
        return Harga24Jam;
    }
    
    public void setHarga24Jam(String Harga24Jam){
        this.Harga24Jam = Harga24Jam;
    }
    
    public String getSopirDalam(){
        return SopirDalam;
    }
    
    public void setSopirDalam(String SopirDalam){
        this.SopirDalam = SopirDalam;
    }
    
     public String getSopirLuar(){
        return SopirLuar;
    }
    
    public void setSopirLuar(String SopirLuar){
        this.SopirLuar = SopirLuar;
    }
    
    public String getGambar(){
        return Gambar;
    }
    
    public void setGambar(String Gambar){
        this.Gambar = Gambar;
    }
    
    //Method
    public void tampilkanInfoKendaraan(){
        System.out.println("Kd Kendaraan: " + kdKendaraan);
        System.out.println("Nm Kendaraan : " + nmKendaraan);
        System.out.println("Spesifikasi : " + Spesifikasi);
        System.out.println("Harga 12 Jam : " + Harga12Jam);
        System.out.println("Harga 24 jam : " + Harga24Jam);
        System.out.println("Sopir Dalam : " + SopirDalam);
        System.out.println("Sopir Luar : " + SopirLuar);
        System.out.println("Gambar : " + Gambar);
    }
}

   

