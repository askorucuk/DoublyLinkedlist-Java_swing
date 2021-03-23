/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Puv0
 */
public class Date {
   
    private int day ; 
    private int year ; 
    private int month ; 
    
    public Date(){
    
        day = 0 ;
        year = 0 ;
        month = 0 ;
    }

    public Date(int day, int month, int year ) {
        
        if(controlDate(day, year,month)) {
            this.day = day;
            this.year = year;
            this.month = month;
        }
    }

    public int getDay() {
        return day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

   
    
    public boolean controlDate(int day,int year, int month) {
    
        if(day>0 && 32>day) {
        
            return true ;
        }
        else if(month<13 && month>0){
            return true ; 
        }
        else{
                return false ;
                }       
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    @Override
    public String toString() {
        String day = String.valueOf(getDay()) ; 
        String month = String.valueOf(getMonth()) ; 
        String year = String.valueOf(getYear()) ; 
        
        return day+"/"+month+"/"+year; 
    }

    
    
    
}
