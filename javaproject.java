import Package1.course;
import java.io.*;
class javaproject
{
public static void main(String args[])
{
System.out.println("\t \t Welcome to UNIEDUCATION");
System.out.println("\t -------------------------------------

-----------");

System.out.println("");
course j=new course();
try
{
j.create();
j.ncourses();
}
catch(IOException e)
{
System.out.println("file not found");
}
}
}