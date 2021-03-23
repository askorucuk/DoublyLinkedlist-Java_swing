/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Puv0
 */
import java.util.ArrayList;
import java.util.List;
import javax.swing.text.Position;
import java.util.NoSuchElementException ;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Puv0
 */
public class DoublyLinkedList {
        
    private static int count = 0 ;
        
        public int getCount(){
        
                return count ;
        }

 

    
        private class TwoWayNode{
        
            private Bilgi data ;
            private TwoWayNode next ;
            private TwoWayNode previous ; 
        
            public TwoWayNode(){
                next = null ;
                previous = null; 
                data = null ;
            
            }
            public TwoWayNode(Bilgi data,TwoWayNode previous, TwoWayNode next){
                this.data = data ;
                this.next= next ;
                this.previous = previous;
                
            
            }
            public TwoWayNode(Bilgi data){
                this.data = data ;
               }
        @Override
        public String toString() {
            return data.toString();
        }
    }
                    public class DoublyIterator {
                    
                         TwoWayNode location  ; 

                    public DoublyIterator(){
                            
                        location = head ; 
                    }
            
                    public void restart(){
                        location =head ;
                    } 
                    public Bilgi current(){
                    
                        if(!hasNext()){
                            throw new NoSuchElementException() ;
                        }
                        return location.data ; 
                    }
                    public Bilgi next(){
                    
                        if(!hasNext()){
                            
                           System.out.println("There is no next node in this list");
                            throw new NoSuchElementException() ;
                        }else{
                        Bilgi newData = location.data ;   
                        location = location.next; 
                        return newData ; 
                    } 
                    }
                    
                    public Bilgi whatIsNext(){
                        
                        if(!hasNext()){
                            return null ;
                        }
                        location = location.next ;
                        return location.data ;
                    }
                   
                    public boolean hasNext(){
                       return (location != null) ;
                    }
                   
                    public void insertAfter(Bilgi newData){

                           
                            TwoWayNode insertData = new TwoWayNode(newData, location, location.next) ;

                                location.next.previous = insertData ;
                                location.next = insertData ;
                                if(location.next.next == null){
                                    tail = location.next ;
                                    }
                                
                    
                    }
                    public void insertBefore(Bilgi newData){
                        
                       TwoWayNode insertData = new TwoWayNode(newData, location.previous, location);
                            
                            location.previous.next = insertData ;
                            location.previous = insertData ;

                    
                   
                    }
                    
                    }
                    public DoublyIterator iterator(){
                        return new DoublyIterator() ;
                    }
                    
    public boolean isEmpty(){
    
           return (head == null) ; 
     }
    
    private TwoWayNode head   ;
    private TwoWayNode tail   ;
   
    public DoublyLinkedList(){
    
        head = null ;
        tail = null ;
   
    }
    public void addFirst(Bilgi addData){
        TwoWayNode newHead = new TwoWayNode(addData,null,head) ;
        count++ ;
        if(isEmpty()){
                    
                    head = newHead ; 
                    tail = newHead ; 
        }else{
            head.previous = newHead ;
            head = newHead; 
            
            }
            
    }
    
    public void addLast(Bilgi addData){
   TwoWayNode newHead = new TwoWayNode(addData, tail, null) ; 
        count ++ ;  
   if(isEmpty()){
        head = newHead; 
        tail = newHead ; 
    }else{
        tail.next = newHead ;
        tail = newHead ; 
   }
    }
    
    public void addOrder(Bilgi addData) {
        String a = null ;
                String b = null ;
                String c = null ;
                boolean flag = true ;
                if(isEmpty()){
             addFirst(addData);

         }
                
                else{
            DoublyIterator i = new DoublyIterator();

                    TwoWayNode temp = new TwoWayNode(addData);
             a = temp.data.getAdSoyad() ;
             b = i.next().getAdSoyad() ;
               
             if(a.compareTo(b) < 0){
                     addFirst(addData);
                 }
                 else if (a.compareTo(b) > 0){

                     while(i.hasNext()){
                         c =i.current().getAdSoyad() ;
                         
                                if(a.compareTo(c) < 0){
                                    i.insertBefore(addData);
                                    flag = false ;
                                    break ;
                                }
                                i.next() ;
                     }
                     
                     if(flag){
                         addLast(addData);
                         i.restart();
                     }
                 }
             

         }
    }
    
    public void delete(String deleteData){
         TwoWayNode position = null ;
        if(deleteData.equals(head.data.getAdSoyad())){
            TwoWayNode temp ;
            temp = head.next ;
            head = null ;
            head = temp ;
            head.previous = null ;
        }  else if(deleteData.equals(tail.data.getAdSoyad())) {
           TwoWayNode temp ;
            temp = tail.previous ;
            tail=null ;
            tail = temp ;
            tail.next = null ;

        }
        else{
                position = head ;
                while(position.next != null){
                if(deleteData.equals(position.data.getAdSoyad())){
                    position.previous.next = position.next ;
                    position.next.previous =position.previous.next ;
                    position = null ;
                    break;
                }
                    position = position.next;
                }
                 
                
        }
    }
    
    public void printList(){

            TwoWayNode location = head ;
            while(location != null){

                System.out.println(location.data);
                location = location.next ;
            
        }
    }
    
    public void printListZ(){
        TwoWayNode location = tail ;
        while(location!=null){
            System.out.println(location.data);
            location = location.previous ; 
        }
    
}

        public ArrayList<String> getDataList(){
            ArrayList<String> array = new ArrayList<>() ;
            TwoWayNode location = head ;
            
            while(location != null){
                array.add(location.data.toString()) ;
                location = location.next ;
                
        }
                return array ;
        }


}