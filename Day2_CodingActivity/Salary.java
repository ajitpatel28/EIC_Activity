import java.util.*;
public class Salary{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int salary = s.nextInt();
        
        if(salary<=0){
            System.out.println("Salary too small");
        }
        
         else if(salary>8000){
         
            System.out.println("Salary too large");


        }

        else{
            int shifts = s.nextInt();

                if(shifts<=0){
                    System.out.println("Shifts too small");

                }
                else{
                    double extra = 0.02*salary*shifts;
                double  savings = salary - 0.2*salary - 0.3*salary + extra;
                    System.out.println(savings);

                }
        
        }
    }
}