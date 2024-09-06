package Package1;
import java.util.*;
import java.io.*;
public class Admin implements Runnable

{

//need to display all the courses using packages
String name;
int n;
Thread t;
public Admin(String fname,int i)
{
n=i;
name=fname;
t=new Thread(this,"Thread"+n);
t.start();
}
public void run()
{
try
{
Reader r=new FileReader(name);
BufferedReader br=new BufferedReader(r);
String s=br.readLine();
while(s!=null)
{
System.out.println("Thread "+n+":"+s);
s=br.readLine();
Thread.sleep(1000);
}
}
catch (Exception e)
{
System.out.println(e);
}
}

}