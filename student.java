package Package1;
import java.util.Scanner;
public class student
{
public String name;
public String ID;
public String Branch;
public student()
{
name = "Unknown";
ID= "0";
Branch = "Not Available";
}
public void setInfo(String name,String ID,String Branch)
{
this.name = name;
this.ID = ID;
this.Branch= Branch;
}

}