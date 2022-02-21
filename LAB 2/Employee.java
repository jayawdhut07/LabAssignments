class Employee {
 
   int empno;
   String name;
   double salary;
 
   Employee(int eno, String ename,double esal) {
      empno = eno;
      name = ename;
      salary = esal;
   }   
 
   Employee() {
 

   }   
 
   void setEmployee(int eno,String ename,double esal) {
     empno = eno;
     name = ename;
     salary = esal;
   }
 
  void displayEmp() {
 
     System.out.println("Empno:"+empno);
     System.out.println("Name:"+name);
     System.out.println("Salary:"+salary);
  }
 
}
 
class EmployeeMain {
 
   public static void main(String[] args) {

   Employee emp1 = new Employee(111,"raj",80000);  
 
   emp1.displayEmp();
 
   Employee emp2 = new Employee(222,"sameer",70000);  
 
   emp2.displayEmp();
 
   Employee emp3 = new Employee();
   emp3.displayEmp();  
 
 }
 
} 