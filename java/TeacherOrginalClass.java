
public class TeacherOrginalClass{
    String name,Gender;
    int phone;

    TeacherOrginalClass()//Default Constractor
    {
        System.out.println("No Value");
    }

    TeacherOrginalClass(String n,String g,int ph)//Ata ke perameterized Constractor bole
    {
        name = n;
        Gender = g;
        phone = ph;

    }

    void DisplayInforfation()//method bole atake
    {
        System.out.println("Name :"+name);
        System.out.println("Gender :"+Gender);
        System.out.println("phone :"+phone);
        System.out.println();

    }

    public static void main(String[] args)
    {
     
    TeacherOrginalClass teacher1 = new TeacherOrginalClass("Shifat Hasan","Male",1938627609);//object create and constractor call hoice
     teacher1.DisplayInforfation();



    TeacherOrginalClass teacher2= new TeacherOrginalClass("Hasan Jamil","Male",193865709);//object create and constractor call hoice
       
    teacher2.DisplayInforfation();

    TeacherOrginalClass teacher3 =new TeacherOrginalClass();
    teacher3.DisplayInforfation();
       
       
       
    }
    
}
