
public class TeacherOrginalClass{
    String name,Gender;
    int phone;

    void DisplayInforfation()
    {
        System.out.println("Name :"+name);
        System.out.println("Gender :"+Gender);
        System.out.println("phone :"+phone);
        System.out.println();

    }

    public static void main(String[] args)
    {
     
    TeacherOrginalClass teacher1 = new TeacherOrginalClass();//object create
     teacher1.name ="Shifat Hasan";
     teacher1.Gender ="Male";
     teacher1.phone =1938627609;
     teacher1.DisplayInforfation();
   

    


    TeacherOrginalClass teacher2= new TeacherOrginalClass();//object create
       teacher2.name ="Hasan Jamil";
       teacher2.Gender ="Male";
       teacher2.phone =193865709;
       teacher2.DisplayInforfation();
       
       
       
    }
    
}
