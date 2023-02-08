import java.util.*;
public class SumOddDigits{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        Integer n = s.nextInt();
        
        if(n<0 ){
            System.out.println("Invalid Input");
        }
        
         else if(n>32767){
            System.out.println("Number too large");
        }
        
        else{


              String str = n.toString();

    //convert String to char array
    char[] chAr = str.toCharArray();        
    int sum = 0;
    for(int i=0;i<chAr.length;i++){


    //convert char array to integer inorder to verify 'if it is a odd number or not?'
    int a = Integer.parseInt(String.valueOf(chAr[i]));

    //if a is odd, then add 'a' to sum
    if(a%2==1) {
        sum = sum + a;
    }

    }

    System.out.println(sum);

            // int sum = 0;
            //         int i = 1;

            // while(n!=0){
            //     if(i%2 != 0){
            //         sum += i;
            //     }
            //     i++;
              
                
            // }
            //        System.out.println(sum);
            }
          
        }
}