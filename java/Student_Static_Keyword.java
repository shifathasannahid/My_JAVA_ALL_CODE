public class Student_Static_Keyword
{
    String name;
    int id;
    static String universityName ="BUBT";

Student_Static_Keyword(String n,int i)
{

    name = n;
    id = i;
}
void DisplayInforfation()//method bole atake
{
    System.out.println("Name :"+name);
    System.out.println("id :"+id);
    System.out.println("University Name : "+universityName);
    System.err.println();
}

public static void main(String[] args) {
    Student_Static_Keyword s1 = new Student_Static_Keyword("Shifat",393);
    Student_Static_Keyword s2 = new Student_Static_Keyword("Jamil",700);
    s1.DisplayInforfation();
    s2.DisplayInforfation();

}

}