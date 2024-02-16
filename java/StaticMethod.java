public class StaticMethod {

    void display1()//non static method
    {
        display2();
        System.out.println("I am non static method");
    }

  static void display2()//static method
    {
        
        System.out.println("I am static method");
    }

    public static void main(String[] args) {
        StaticMethod ob1 = new StaticMethod();
        ob1.display1();

        StaticMethod.display2();//ata static method tai er kunu object create kora lage nai
    }
}