import java.io.*;
class Employee{
        private String name;
        private int id ;
        private int Salary;
         
        public void setName(String N){
              name = N;
               }
        public void setId(int ID){
                id = ID;
               }
        public void setSalary(int S){
                    Salary = S;
                      }
        public String getName() {
                             return name;
                    }
       public int getId(){
                       return id;
                     }
       public int getSalary(){
                return Salary;
                      }
       void M1(){ 
           double DA=4;
           double HR = 10;
            double sum1 = 4*Salary/(100);
           double sum2 = 10*Salary/(100);
           System.out.println("HR = "+" "+sum1);
           System.out.println("DA = "+" "+sum2);
          }
       
 }
class Test {
      public static void main(String [] args){
            Employee obj = new Employee();
           obj.setName("Aftab");
           obj.setId(12);
            obj.setSalary(100000);
             
           System.out.println("Employee Name="+" "+obj.getName());
            System.out.println("Employee Id ="+" "+obj.getId());
           System.out.println("Salary ="+" "+obj.getSalary());
           obj.M1(); 
           
          
         }
}
        