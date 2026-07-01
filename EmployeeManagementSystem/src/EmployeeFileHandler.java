import java.io.*;import java.util.*;
public class EmployeeFileHandler{
 public static void save(ArrayList<Employee> list,String file)throws IOException{
  ObjectOutputStream o=new ObjectOutputStream(new FileOutputStream(file));o.writeObject(list);o.close();
 }
 @SuppressWarnings("unchecked")
 public static ArrayList<Employee> load(String file)throws Exception{
  File f=new File(file); if(!f.exists()) return new ArrayList<>();
  ObjectInputStream i=new ObjectInputStream(new FileInputStream(f));
  ArrayList<Employee> l=(ArrayList<Employee>)i.readObject(); i.close(); return l;
 }
}