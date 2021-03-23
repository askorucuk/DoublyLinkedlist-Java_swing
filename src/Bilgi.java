
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Puv0
 */
public class Bilgi {
    
    private  String adSoyad ;
    private  Date birtDate ; 
    private ArrayList<String> takımList ; 
 
    
    public Bilgi(String adSoyad, Date birtDate,ArrayList<String> takımList) {
        this.adSoyad = adSoyad;
        this.birtDate = birtDate;
        this.takımList = takımList ; 
    }
    public Bilgi(){
    
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public Date getBirtDate() {
        return birtDate;
    }

    public void setBirtDate(Date birtDate) {
        this.birtDate = birtDate;
    }
public void setTakımList(ArrayList<String> takımList){
        this.takımList = takımList ; 

}
    @Override
    public String toString() {
        return  getAdSoyad() + ", " +  birtDate.toString()+", " + takımList.toString(); 
    }
}
