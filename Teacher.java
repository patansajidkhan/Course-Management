package Package1;
import java.util.*;
public class Teacher
{
public String name;
public String ID;
public String sub;
public Teacher()
{
name = "Unknown";
ID= "0";
sub = "Not Available";
}
public void setInfo(String name,String ID,String sub)
{
this.name = name;
this.ID = ID;
this.sub= sub;
}
}