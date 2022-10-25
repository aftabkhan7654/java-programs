import java.util.*;  
class Queue{  
void QInt(){  

       PriorityQueue<Integer> A=new PriorityQueue<Integer>();  
       A.add(10);  
       A.add(20);  
       A.add(30);  
       A.add(40);  
      A.add(50);  

           System.out.println(A);  
       int H = A.element();
             System.out.println("Head"+" "+H);
      int R = A.remove();
             System.out.println("Remove Element"+" "+R);
     
     Iterator<Integer> A1 = A.iterator();  
     while(A1.hasNext()){  
       System.out.println(A1.next()); 
     } 
}
void QString(){
     
     PriorityQueue<String> B = new PriorityQueue<String>();
     B.add("Aftab");
     B.add("Aman");
    B.add("Ankit");
    B.add("Anuj");
        
     String H = B.element();
             System.out.println("Head"+" "+H);
     String R = B.remove();
             System.out.println("Remove Element"+" "+R);
     System.out.println(B);
     Iterator<String> B1 = B.iterator();  
     while(B1.hasNext()){  
    System.out.println(B1.next());  
   }
}

     
public static void main(String args[]){
      Queue obj = new Queue();
      
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter 1 to Integer");
     System.out.println("Enter 2 to String");
     int I = sc.nextInt();
     if (I == 1){
           obj.QInt();
      }
     else if (I == 2){
           obj.QString();
         }
      
    }  
}  