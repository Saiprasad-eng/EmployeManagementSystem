import java.util.*;
public class EmployeeReportGenerator{
 public static void salaryReport(ArrayList<Employee> list){
  if(list.isEmpty()){System.out.println("No employees");return;}
  double total=0,max=-1,min=Double.MAX_VALUE;
  for(Employee e:list){double s=e.getSalary();total+=s;max=Math.max(max,s);min=Math.min(min,s);}
  System.out.println("Employees: "+list.size());
  System.out.println("Total Salary: "+total);
  System.out.println("Average Salary: "+(total/list.size()));
  System.out.println("Highest Salary: "+max);
  System.out.println("Lowest Salary: "+min);
 }
}