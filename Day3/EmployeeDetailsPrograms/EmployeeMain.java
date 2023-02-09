
import java.util.*;




public class EmployeeMain{
 public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        Employee emp = new Employee();
        System.out.println("Enter the name:");
        emp.setName(s.nextLine());
        System.out.println("Enter Address:");
        emp.setAddress(s.nextLine());
        System.out.println("Enter Mobile:");
        emp.setMobile(s.nextLine());

         System.out.println("Employee Details");
         System.out.println("Name:"+ emp.getName());
         System.out.println("Address:"+ emp.getAddress());
         System.out.println("Mobile:"+ emp.getMobile());
         
 }

}