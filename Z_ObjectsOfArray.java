class student
{
    int roll;
    String name;
    int marks;
}
public class Z_ObjectsOfArray {
    public static void main(String[] args) {
        student s1=new student();
        s1.roll=1;
        s1.name="namin";
        s1.marks=80;

        student s2=new student();
        s2.roll=2;
        s2.name="Harish";
        s2.marks=70;

        student s3=new student();
        s3.roll=3;
        s3.name="Bhola";
        s3.marks=40;


        student students[]=new student[3];
        students[0]=s1;
        students[1]=s2;
        students[2]=s3;

        for (int i = 0; i < students.length; i++) {
        System.out.println(students[i].roll+" "+students[i].name+ ":" + students[i].marks);
        }
    }
}
