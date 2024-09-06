import Package1.Admin;
import Package1.student;
import Package1.Teacher;
import java.util.*;
import java.io.*;
interface Statement
{
public String Print();
}
class Main
{
public static void main(String args[])
{
System.out.println("\t \t COURSE MANAGEMENT SYSTEM");
System.out.println("");
System.out.println("\t --------------------------------");
System.out.println("Here u can take a look at the courses
and students can enroll and new new teachers join our
academy");
Scanner sc = new Scanner(System.in);
System.out.println("1.Show course details");
System.out.println("2.Do u want to enter student details");
System.out.println("3.Do want to enter teacher details");
try
{
boolean op=true;
while(op)

Home Assignment

20AI&DS3304 − Java Programming Page No.

{
System.out.println("Enter ur choice");
int choice = sc.nextInt();
switch(choice)
{
case 1:
{
//Admin a=new Admin();
System.out.println("Enter File 1
name:");
String file1=sc.next();
new Admin(file1,1);
break;
}
case 2:
{
student s[] = new student[3];
String details;
System.out.println("Enter the Student
details by using ; to distinguish each
student details");
details = sc.next();
String stu_details[] =
details.split(";");
Statement s1= ()->{
return "student details enetred
successfully";
};
System.out.println(s1.Print());
String path="D:\\student.txt";
File file= new File("student.txt");
FileWriter fr = new FileWriter(file,
true);
BufferedWriter br = new
BufferedWriter(fr);
br.write("\n"+details);
br.close();
fr.close();
//(count)->count+1;
String sd[];
for(int i=0;i<stu_details.length;i++)
{
s[i] = new student();
sd =stu_details[i].split(",");
s[i].setInfo(sd[0],sd[1],sd[2]);
System.out.println("Student name
"+s[i].name);

Home Assignment

20AI&DS3304 − Java Programming Page No.
System.out.println("Student ID
"+s[i].ID);
System.out.println("Student branch
"+s[i].Branch);
System.out.println("");
}
break;
}
case 3:
{
Teacher T[] = new Teacher[3];
String detailsofTeacher;
System.out.println("Enter the teacher
details by using ; to distinguish each
student details");
detailsofTeacher = sc.next();
File file= new File("teacher.txt");
FileWriter fr = new FileWriter(file,
true);
BufferedWriter br = new
BufferedWriter(fr);
br.write("\n"+detailsofTeacher);
br.close();
fr.close();
String Tea_details[]=
detailsofTeacher.split(";");
String sd1[];
for(int i=0;i<Tea_details.length;i++)
{
T[i] = new Teacher();
sd1= Tea_details[i].split(",");
Tea_details[i].split(",");
T[i].setInfo(sd1[0],sd1[1],sd1[2]);
System.out.println("teacher name
"+T[i].name);
System.out.println("teacher ID
"+T[i].ID);
System.out.println("teacher sub
"+T[i].sub);
System.out.println("");
}
break;
}
default:
{
System.out.println("enter valid
choice");
break;

Home Assignment

20AI&DS3304 − Java Programming Page No.

}
}
System.out.println("do u want to continue");
op=sc.nextBoolean();
}
}
catch(IOException e)
{
System.out.println("File not found");
}

}
}