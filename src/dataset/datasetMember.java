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
public class datasetMember {
    private ArrayList<String> uname;
    private ArrayList<String> Password;
    private ArrayList<String> Nama;
    private ArrayList<String> Alamat;
    private ArrayList<String> Kota;
    private ArrayList<String> Email;
    private ArrayList<String> Pekerjaan;
    private ArrayList<String> Kunci1;
    private ArrayList<String> Kunci2;
    private ArrayList<Integer> kdMember;
    private ArrayList<Integer> Tlp;
    
    public datasetMember (){
        uname = new ArrayList<String>();
        Password = new ArrayList<String>();
        Nama = new ArrayList<String>();
        Alamat = new ArrayList<String>();
        Kota = new ArrayList<String>();
        Email = new ArrayList<String>();
        Pekerjaan = new ArrayList<String>();
        Kunci1 = new ArrayList<String>();
        Kunci2 = new ArrayList<String>();
        kdMember = new ArrayList<Integer>();
        Tlp = new ArrayList<Integer>();
    }
    
    public void insertuneme(String isi){
        this.uname.add(isi);
    }
    public ArrayList<String> getRecorduname (){
        return this.uname;
    }
    
    public void insertPassword(String isi){
        this.Password.add(isi);
    }
    public ArrayList<String> getRecordPassword (){
        return this.Password;
    }
    
    public void insertNama(String isi){
        this.Nama.add(isi);
    }
    public ArrayList<String> getRecordNama (){
        return this.Nama;
    }
    
    public void insertAlamat(String isi){
        this.Alamat.add(isi);
    }
    public ArrayList<String> getRecordAlamat (){
        return this.Alamat;
    }
    
    public void insertKota(String isi){
        this.Kota.add(isi);
    }
    public ArrayList<String> getRecordKota (){
        return this.Kota;
    }
    
    public void insertEmail(String isi){
        this.Email.add(isi);
    }
    public ArrayList<String> getRecordEmail (){
        return this.Email;
    }
    
    public void insertPekerjaan(String isi){
        this.Pekerjaan.add(isi);
    }
    public ArrayList<String> getRecordPekerjaan (){
        return this.Pekerjaan;
    }
    
    public void insertKunci1(String isi){
        this.Kunci1.add(isi);
    }
    public ArrayList<String> getRecordKunci1 (){
        return this.Kunci1;
    }
    
     public void insertKunci2(String isi){
        this.Kunci2.add(isi);
    }
    public ArrayList<String> getRecordKunci2 (){
        return this.Kunci2;
    }
    
    public void insertkdMember(int isi){
        this.kdMember.add(isi);
    }
    public ArrayList<Integer> getRecordkdMember (){
        return this.kdMember;
    }
    
    public void insertTlp (int isi){
        this.Tlp.add(isi);
    }
    public ArrayList<Integer> getRecordTlp (){
        return this.Tlp;
    }
    
    public void insertMember(String uname, String Password, String Nama, String Alamat, String Kota, 
            String Email, String Pekerjaan, String Kunci1, String Kunci2, int kdMember, int Tlp){
        this.uname.add(uname);
        this.Password.add(Password);
        this.Nama.add(Nama);
        this.Alamat.add(Alamat);
        this.Kota.add(Kota);
        this.Email.add(Email);   
        this.Pekerjaan.add(Pekerjaan);  
        this.Kunci1.add(Kunci1);  
        this.Kunci2.add(Kunci2);  
        this.kdMember.add(kdMember);  
        this.Tlp.add(Tlp);  
        
    }
    
    
}
