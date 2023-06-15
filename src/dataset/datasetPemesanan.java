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
public class datasetPemesanan {
    
    private ArrayList<String> uname;
    private ArrayList<Integer> JatuhTempo;
    private ArrayList<String> StatusBayar;
    private ArrayList<Integer> TotalBayar;
    private ArrayList<Integer> Tanggal;
    private ArrayList<Integer> noPesan;
    
    public datasetPemesanan (){
        uname = new ArrayList<String>();
        JatuhTempo = new ArrayList<Integer>();
        StatusBayar = new ArrayList<String>();
        TotalBayar = new ArrayList<Integer>();
        Tanggal = new ArrayList<Integer>();
        noPesan = new ArrayList<Integer>();
    }
    
    public void insertuname(String isi){
        this.uname.add(isi);
    }
    public ArrayList<String> getRecorduname (){
        return this.uname;
    }
    
    public void insertJatuhTempo(int isi){
        this.JatuhTempo.add(isi);
    }
    public ArrayList<Integer> getRecordJatuhTempo (){
        return this.JatuhTempo;
    }
    
    public void insertStatusBayar(String isi){
        this.StatusBayar.add(isi);
    }
    public ArrayList<String> getRecordStatusBayar (){
        return this.StatusBayar;
    }
    
    public void insertTotalBayar(int isi){
        this.TotalBayar.add(isi);
    }
    public ArrayList<Integer> getRecordTotalBayar (){
        return this.TotalBayar;
    }
    
    public void insertTanggal(int isi){
        this.Tanggal.add(isi);
    }
    public ArrayList<Integer> getRecordTanggal (){
        return this.Tanggal;
    }
    
    public void insertnoPesan(int isi){
        this.noPesan.add(isi);
    }
    public ArrayList<Integer> getRecordnoPesan (){
        return this.noPesan;
    }
    
    public void insertPemesanan(String uname, int JatuhTempo, String StatusBayar, int TotalBayar, 
            int Tanggal, int noPesan){
        this.uname.add(uname);
        this.JatuhTempo.add(JatuhTempo);
        this.StatusBayar.add(StatusBayar);
        this.TotalBayar.add(TotalBayar);
        this.noPesan.add(noPesan);
        this.Tanggal.add(Tanggal);
    }
}
