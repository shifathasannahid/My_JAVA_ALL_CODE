
public class TeacherOrginalClass{
    String name,Gender;
    int phone;

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
     
    TeacherOrginalClass teacher1 = new TeacherOrginalClass("Shifat Hasan","Male",1938627609);//object create
     teacher1.DisplayInforfation();



    TeacherOrginalClass teacher2= new TeacherOrginalClass("Hasan Jamil","Male",193865709);//object create
       
       teacher2.DisplayInforfation();
       
       
       
    }
    
}
