
import com.sun.org.apache.xalan.internal.lib.ExsltDatetime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Puv0
 */
public class Test {
        

    
       public static void main(String[] args) {
        Date date = new Date() ; 
           ArrayList<String> takım = new ArrayList<String>();
           DoublyLinkedList liste = new DoublyLinkedList();
           takım.add("Fener") ; 
           Bilgi bilgi= new Bilgi("Serdar Gurler", date, takım) ;
           
           Bilgi bilgi1= new Bilgi("Serdar Aziz", date, takım) ;
           Bilgi bilgi2= new Bilgi("Fernando Muslera", date, takım) ;
           Bilgi bilgi3= new Bilgi("Ricardo Quaresma", date, takım) ;
           Bilgi bilgi4= new Bilgi("Dogukan Inci", date, takım) ;
           Bilgi bilgi8 = new Bilgi("Trabza", date, takım);
          
           
           
      liste.addOrder(bilgi);
      
      liste.addOrder(bilgi1);
      
      liste.addOrder(bilgi2);
     
      liste.addOrder(bilgi3);
      
      liste.addOrder(bilgi4);
      liste.addOrder(bilgi8);
      liste.delete("Fernando Muslera");
      liste.printList();
      
           
       } 


       }

