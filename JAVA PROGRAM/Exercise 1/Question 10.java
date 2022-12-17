import java.util.*;


public class Solutions {

   public static void main(String args[]) {

       Scanner sc = new Scanner(System.in);
       System.out.print("Enter Number Of Terms:");
        int n = sc.nextInt();
       int a = 0, b = 1;

       if(n==1)
       System.out.print(a+" ");
       else if(n==2)
       System.out.print(a+" "+b+" ");
       else if(n>2){
               System.out.print(a+" "+b+" ");
               for(int i=3; i<=n; i++){
               int c = a+b;
               System.out.print(c+" ");
               a=b;
               b=c;
           }
       }

   }  

}