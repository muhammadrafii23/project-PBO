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
public class datasetPerpanjangan {
    
    private ArrayList<String> idPerpanjangan;
    private ArrayList<String> JenisJam;
    private ArrayList<Integer> noPesan;
    
    public datasetPerpanjangan (){
        idPerpanjangan = new ArrayList<String>();
        JenisJam = new ArrayList<String>();
        noPesan = new ArrayList<Integer>();
    }
    
    public void insertidPerpanjangan(String isi){
        this.idPerpanjangan.add(isi);
    }
    public ArrayList<String> getRecordidPerpanjangan (){
        return this.idPerpanjangan;
    }
    
    public void insertJenisJam(String isi){
        this.JenisJam.add(isi);
    }
    public ArrayList<String> getRecordJenisJam (){
        return this.JenisJam;
    }
    
     public void insertnoPesan(int isi){
        this.noPesan.add(isi);
    }
    public ArrayList<Integer> getRecordnoPesan (){
        return this.noPesan;
    }
    
    public void insertPerpanjangan(String idPerpanjangan, String JenisJam, int noPesan){
        this.idPerpanjangan.add(idPerpanjangan);
        this.JenisJam.add(JenisJam);
        this.noPesan.add(noPesan);
    }
}
