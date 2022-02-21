class StaticDemo {
 
  public static void main(String[] args) {
 
   A a1 = new A();
 
   A a2 = new A();
 
   A a3 = new A();
 
   System.out.println("Total count of A class objects:"+ A.counter );
 
  }
 
}
 
class A {
 
  static int counter;
  int k;
 
  A() 
  {
     counter++;
  }

  void m1() 
  {
 
  }
 
}
 
