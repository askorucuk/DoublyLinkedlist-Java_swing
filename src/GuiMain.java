
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Puv0
 */
public class GuiMain {
     static DoublyLinkedList list ; 
    
     public static void write(){
         DoublyLinkedList.DoublyIterator i = list.iterator() ;
         try{    
           FileWriter fw=new FileWriter("sporcu.txt");    
           
           while(i.hasNext()){
               fw.write(i.current().toString()+"\n");
               i.next() ;
           }
               
           fw.close();    
          }catch(Exception e){System.out.println(e);}    
     }
   
     public static ArrayList<String> showMethod(){
            
        return list.getDataList();
        
    }
     
     public static  DoublyLinkedList getList(){
         return list ;
     }

    public static void main(String[] args){
        LinkedList<Bilgi> sporcu = new LinkedList<>() ;
        Scanner file = null ;
        list = new DoublyLinkedList() ;
        DoublyLinkedList.DoublyIterator i = list.iterator() ;

        try {
             file = new Scanner(new FileInputStream("sporcu.txt"));
             
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GuiMain.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        while(file.hasNext()){
               ArrayList<String> takımlar = new ArrayList<String>() ;
               Date date = new Date() ;
                String name  ;
                String[] tempArray = new String [2] ;  
                StringTokenizer token = new StringTokenizer(file.nextLine()) ; 
                        int tempCount = 0  ;    
                        
                        while(token.hasMoreTokens()){
                            if(tempCount == 0 ){
                                     tempArray[0] = token.nextToken(",") ;
                                     name = tempArray[0]; 
                                     tempCount ++ ;
                                 }
                                 else if (tempCount ==1 ){                                     
                                         String temp = token.nextToken(",") ;
                                          String x = temp.replace(" ", "");
                                         String[] split = x.split("/");
                                         date.setDay(Integer.parseInt(split[0]));
                                         date.setMonth(Integer.parseInt(split[1]));
                                         date.setYear(Integer.parseInt(split[2]));
                                          tempCount ++ ; 
                                         
                                     }
                                 
                                 else{
                                     takımlar.add(token.nextToken(",")) ; 
                                 } 
            }
                            
                           
                           
                      Bilgi bilgi = new Bilgi(tempArray[0], date, takımlar) ;
                      list.addOrder(bilgi) ;   
            }

        new Menu().setVisible(true);
      
    }
}
