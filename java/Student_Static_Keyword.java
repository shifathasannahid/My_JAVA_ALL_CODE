public class Student_Static_Keyword
{
    
   static int count=0;

Student_Static_Keyword()
{
    count++;
}

void TotalStudent()
{
    System.out.println("Total Student = "+count);
}


public static void main(String[] args) {

Student_Static_Keyword s1 =new Student_Static_Keyword();
s1.TotalStudent();

Student_Static_Keyword s2 =new Student_Static_Keyword();
s2.TotalStudent();

Student_Static_Keyword s3 =new Student_Static_Keyword();
s3.TotalStudent();


}

}