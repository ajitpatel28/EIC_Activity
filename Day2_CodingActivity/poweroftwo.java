import java.util.*;
public class poweroftwo{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
        if(n<0){
            System.out.println("Number too small");
        }
        
         else if(n>32767){
         
            System.out.println("Number too large");
        }
        else{
            while(n%2==0){
                n=n/2;
            }
            if(n==1){
                System.out.println("Yes");
            }
            else{
                 System.out.println("No");
            }
            }
        }
}