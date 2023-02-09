import java.util.*;
public class SumOddDigits{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        Integer n = s.nextInt();
        
        if(n<0 ){
            System.out.println("Invalid Input");
        }
        
         else if(n>32767){
            System.out.println("Invalid Input");
        }
        
        else{


              String str = n.toString();

    
    char[] chAr = str.toCharArray();        
    int sum = 0;
    for(int i=0;i<chAr.length;i++){



    int a = Integer.parseInt(String.valueOf(chAr[i]));

    
    if(a%2==1) {
        sum = sum + a;
    }

    }

    System.out.println(sum);
            }
          
        }
}