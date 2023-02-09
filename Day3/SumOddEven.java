import java.util.*;
public class SumOddEven{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(); 
        if(n<0){
            System.out.println("Invalid array size");
        }
        int[] a = new int[n];

        for(int i=0; i<n; i++){
            a[i] = s.nextInt(); 
            if(a[i]<0){
                  System.out.println("Invalid input");
                  System.exit(0);
            }
        }
        int EvenSum = 0;
        int OddSum = 0;
        for(int i =0; i<n; i++){

                if(a[i]%2==0){
                   EvenSum += a[i];
                }
                else{
                    OddSum += a[i];
                }

                
            }

            if(EvenSum>OddSum){
                      System.out.println(EvenSum);
                }
                else{
                      System.out.println(OddSum);
                }
        }


    }
// }