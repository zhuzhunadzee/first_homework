import java.util.Scanner;

import org.w3c.dom.Text;
  class a {
    String hey;
    
    int i;
    
    a(){
        hey="hello";
        
    }
    public static void main(String[] args) {
        a obj=new a();
        System.out.println(obj.hey);
        Scanner x=new Scanner(System.in);
        int i=input(x);
        System.out.println("შეყვანილი რიცხვი არის "+ i );
        int a=sum_12(i);
        even_or_odd(i);
        System.out.println(i);
        obj.inp();
        
        
    }

    public static int input(Scanner x){
        
        return x.nextInt();
    }
    
    public static int sum_12(int i){
        System.out.println(i+12);
        return i+12;
        
    }

    public static int even_or_odd(int i){
        if (i%2==0){
            System.out.println("ლუწია");
        }
        else{
            System.out.println("კენტია");
        }
        return i;
    }
}

class b extends a{
    
    
    Scanner y=new Scanner(System.in);
    

     
    public static int inp(Scanner y){
        System.out.println(y.nextInt());
        return y.nextInt();
    }

    public static int sm(int x,int y){
        return x+y;
    }

   
    
}


