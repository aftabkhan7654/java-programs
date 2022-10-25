import java.util.*;  
class Demo
{  
void Age(){
     Stack<Integer> I = new Stack<>();  

     I.push(10);  
     I.push(20); 
     I.push(23);
     I.push(24);
     I.push(25);
     I.push(50); 
   
      System.out.println("Elements in Stack: " + I);
      //System.out.println("Pop Element"+" "+I.pop());
      //System.out.println("After pop Element:"+" "+I);
     int X = I.size();
     System.out.println("Size of satck:"+" "+X);
    Iterator G = I.iterator();
    while (G.hasNext()){
               Object value = G.next();
       System.out.println(value);
     }
}  
void it(){
      Stack<String> IT = new Stack<>();
      IT.push("R15");
      IT.push("KTM");
      IT.push("BMW RR");
      IT.push("H2");
      IT.push("Zx10r");
     
    Iterator G = IT.iterator(); 
    while(G.hasNext()){
               Object value = G.next();
     System.out.println(value);
     }
} 

     
void Name(){
    Stack<String> S = new Stack<>();
    
    S.push("Aftab");
    S.push("Ritesh");
    S.push("Sumit");
    S.push("Ankit");
    S.push("Sorav");
    S.push("Anuj");
          System.out.println("Name in Stack"+" "+S);
   int  search = S.search("Ankit");
   System.out.println("Search Element:"+" "+search);
  } 

public static void main(String[] args){
     Demo obj = new Demo();
     Scanner sc = new Scanner(System.in);
    
     System.out.println("Enter 1 to see the Name List");
     System.out.println("Enter 2 to see the Age List");
     System.out.println("Enter 3 to see the Bike List");
     
     int In = sc.nextInt();
     if (In == 1){
         obj.Name();
         }
    else if (In==2){
          obj.Age();
         }
    else if(In==3) {
          obj.it();
     }



}  
} 