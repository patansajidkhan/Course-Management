package Package1;
import java.util.*;
import java.io.*;
interface No_courses
{
void ncourses();
}
public class course
{
int i;
static boolean check(String x,char y)
{
if(x.equals(y))
{
return true;
}
else
{
return false;
}
}
public void ncourses()
{
System.out.println("No.of courses added by you are"+i);
}
public void create() throws IOException
{

Scanner input = new Scanner(System.in);

boolean op=true;
while(op)
{

String path="D:\\Courses.txt";
System.out.println("Creating a new course");
System.out.println("enter course datails to be
added");
String courseName=input.next();
System.out.println("enter course duration");
String duration=input.next();
File file = new File("courses.txt");
FileInputStream ob2=new FileInputStream(file);
int j=ob2.read();
while(j!=-1)
{

if(check(courseName,(char)j))
{
System.out.println("course already
exists");
}
j=ob2.read();

}
ob2.close();
FileWriter fr = new FileWriter(file, true);
BufferedWriter br = new BufferedWriter(fr);
br.write(courseName+"\t"+duration+"\n");
i=i+1;
ncourses();
br.close();
fr.close();
System.out.println("Course added successfully");
System.out.println("Do u want to continue");
op=input.nextBoolean();

}
}
}