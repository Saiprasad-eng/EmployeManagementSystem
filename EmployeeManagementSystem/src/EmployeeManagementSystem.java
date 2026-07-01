
import java.util.*;
public class EmployeeManagementSystem{
 static ArrayList<Employee> employees=new ArrayList<>();
 static HashMap<String,Employee> map=new HashMap<>();
 static Scanner sc=new Scanner(System.in);
 static final String FILE="employees.dat";
 static void rebuild(){map.clear();for(Employee e:employees)map.put(e.getId(),e);}
 public static void main(String[]args){
  try{employees=EmployeeFileHandler.load(FILE);rebuild();}catch(Exception e){}
  while(true){
   System.out.println("1.Add 2.View 3.Search 4.Delete 5.Report 6.Save 7.Exit");
   int c=sc.nextInt();sc.nextLine();
   switch(c){
    case 1:add();break; case 2:view();break; case 3:search();break;
    case 4:delete();break; case 5:EmployeeReportGenerator.salaryReport(employees);break;
    case 6:save();break; case 7:save();return;
   }
  }
 }
 static void add(){
  System.out.print("ID:");String id=sc.nextLine();
  if(map.containsKey(id)){System.out.println("Exists");return;}
  System.out.print("Name:");String n=sc.nextLine();
  System.out.print("Dept:");String d=sc.nextLine();
  System.out.print("Position:");String p=sc.nextLine();
  System.out.print("Salary:");double s=sc.nextDouble();sc.nextLine();
  Employee e=new Employee(id,n,d,p,s);employees.add(e);map.put(id,e);
 }
 static void view(){for(Employee e:employees)System.out.println(e);}
 static void search(){System.out.print("ID:");Employee e=map.get(sc.nextLine());System.out.println(e==null?"Not found":e);}
 static void delete(){System.out.print("ID:");String id=sc.nextLine();Employee e=map.remove(id);if(e!=null)employees.remove(e);}
 static void save(){try{EmployeeFileHandler.save(employees,FILE);}catch(Exception ex){System.out.println(ex.getMessage());}}
}