import java.io.*;
class Student{
        private String studentname;
        private int rollnumber;
        private int id;

       public void setName(String  N){
                   studentname = N;
                   }
       public void setRollnumber(int R){
                        rollnumber = R;
                     }
        public void setId(int A){
                      id = A; 
                        }
    
        public String getName(){
                            return studentname;
                     }
        public int  getRollnumber(){
                            return rollnumber;
                     }
        public int getId(){
                            return id;
                     }
}

class Test{
     public static void main(String[] args){
         Student obj = new Student();
         obj.setName("Aftab Khan");
         obj.setRollnumber(1);
         obj.setId(18);

        System.out.println("Name of the Student = "+" "+obj.getName());
        System.out.println("Roll number of the Student = "+" "+obj.getRollnumber());
        System.out.println("Id of the Student = "+" "+obj.getId());
    }
}