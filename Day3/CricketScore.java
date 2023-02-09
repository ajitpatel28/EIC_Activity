import java.util.*;
public class CricketScore{
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
         int score = s.nextInt(); 
        if(score<0){
            System.out.println("Invalid Score");
            System.exit(0);
      
        for(int i =1; i<n;){
     
                if(a[i]> score){
                        System.out.println(a[i-1]); 
                  }
                i += 2;
                
            }

             }


    }
