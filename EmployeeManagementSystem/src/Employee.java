import java.io.Serializable;
import java.util.Date;
public class Employee implements Serializable{
 private String id,name,department,position;
 private double salary;
 private Date joinDate;
 public Employee(String id,String name,String dept,String pos,double salary){
  this.id=id;this.name=name;this.department=dept;this.position=pos;this.salary=salary;this.joinDate=new Date();
 }
 public String getId(){return id;} public String getName(){return name;}
 public String getDepartment(){return department;} public String getPosition(){return position;}
 public double getSalary(){return salary;} public Date getJoinDate(){return joinDate;}
 public void setName(String n){name=n;} public void setDepartment(String d){department=d;}
 public void setPosition(String p){position=p;} public void setSalary(double s){salary=s;}
 public String toString(){return id+","+name+","+department+","+position+","+salary+","+joinDate;}
}