/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salary;

/**
 *
 * @author ACER
 */
public class Member {
    private int kdMember;
    private int Tlp;
    private String uname;
    private String Password;
    private String Nama;
    private String Alamat;
    private String Kota;
    private String Email;
    private String Pekerjaan;
    private String Kunci1;
    private String Kunci2;
    
    public Member(){}
    //Construsktor
    public Member(int kdMember, int Tlp, String uname, String Password, String Nama, String Alamat, String Kota,
            String Email, String Pekerjaan, String Kunci1, String Kunci2){
        this.kdMember = kdMember;
        this.Tlp = Tlp;
        this.uname = uname;
        this.Password = Password;
        this.Nama = Nama;
        this.Alamat = Alamat;
        this.Kota = Kota;
        this.Email = Email;
        this.Pekerjaan = Pekerjaan;
        this.Kunci1 = Kunci1;
        this.Kunci2 = Kunci2;
    }
      
    //Getter  dan Setter
    public int getkdMember(){
        return kdMember;
    }
    
    public void setkdMember(int kdMember){
        this.kdMember = kdMember;
    }
   
    public int getTlp(){
        return Tlp;
    }
    
    public void setTlp(int Tlp){
        this.Tlp = Tlp;
    }
    
    public String getuname(){
        return uname;
    }
    
    public void setuname(String uname){
        this.uname = uname;
    }
    
    public String getPassword(){
        return Password;
    }
    
    public void setPassword(String Password){
        this.Password = Password;
    }
    
    public String getNama(){
        return Nama;
    }
    
    public void setNama (String Nama){
        this.Nama = Nama;
    }
    
    public String Alamat(){
        return Alamat;
    }
    
    public void setAlamat(String Alamat){
        this.Alamat = Alamat;
    }
    
    public String getKota(){
        return Nama;
    }
    
    public void setKota (String Kota){
        this.Kota = Kota;
    }
    
    public String getEmail(){
        return Email;
    }
    
    public void setEmail (String Email){
        this.Email= Email;
    }
    
    public String getPekerjaan(){
        return Pekerjaan;
    }
    
    public void setPekerjaan (String Pekerjaan){
        this.Pekerjaan= Pekerjaan;
    }
    
    public String getKunci1(){
        return Kunci1;
    }
    
    public void setKunci1 (String Kunci1){
        this.Kunci1 = Kunci1;
    }
    
    public String getKunci2(){
        return Kunci2;
    }
    
    public void setKunci2 (String Kunci2){
        this.Kunci2 = Kunci2;
    }
    
    //Method
    public void tampilkanInfoMember(){
        System.out.println("Kd Member : " + kdMember);
        System.out.println("Tlp : " + Tlp);
        System.out.println("Uname : " + uname);
        System.out.println("Password : " + Password);
        System.out.println("Nama : " + Nama);
        System.out.println("Alamat : " + Alamat);
         System.out.println("Kota : " + Kota);
        System.out.println("Email : " + Email);
        System.out.println("Pekerjaan : " + Pekerjaan);
        System.out.println("Kunci1 : " + Kunci1);
        System.out.println("Kunci2: " + Kunci2);
    }
}
