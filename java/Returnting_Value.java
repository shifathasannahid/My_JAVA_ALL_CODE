public class Returnting_Value
{
    int square(int value)
    {
        return value*value;
    }

    public static void main(String[] args) {

        Returnting_Value ob1 = new Returnting_Value();
        System.out.println("Square of 5 = "+ob1.square(5));
       

        Returnting_Value ob2 = new Returnting_Value();
        System.out.println("Square of 8 = "+ob1.square(8));
        
    }

}