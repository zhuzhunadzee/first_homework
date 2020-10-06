import java.util.Scanner;

public class c {
    public static void main(String[] args) {
       int a,b,c, sum=0;
      Scanner input= new Scanner(System.in);
    //   int start_number = numbers.nextInt();
      
      
      a=input.nextInt();
      b=input.nextInt();
      c=input.nextInt();
      
      int return_a=last_number(a);
      
      int return_c=first_number(c);
      int c_sum=sum_c(c, sum);
      int two_three=two_and_three(return_a, return_c);
      System.out.println("2 და 3 მეთოდის ნამრავლი" + two_three);
      
      System.out.println("a ბოლო არის " + return_a);
      System.out.println("ც ჯამი " + c_sum);
      System.out.println("c  პირველი არის " + return_c);
      
        
    }

    public static int last_number(int a){
        

        return a%10;
    }

    public static int first_number(int c){
        while(c > 9){
            c/=10;
        }
        return c;
    }

    public static int sum_c(int c, int sum){
        while(c!=0){
            sum +=(c%10);
            c/=10;
        }
        return sum;
    }

    private static int two_and_three(int last_number, int first_number){
        return last_number*first_number;
    }
    
}


