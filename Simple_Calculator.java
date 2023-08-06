import java.util.*;

public class Simple_Calculator {
     public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        System.out.println("java calculator!!");

       double a=sc.nextDouble();
        char button=sc.next().charAt(0);
       double b=sc.nextDouble();
       
        System.out.print("Result: ");

        switch (button) {
            case '+':
               double sum=a+b;
                System.out.println(a+"+"+b+"="+sum);
                break;
            case '-':
               double sub=a-b;
                System.out.println(a+"-"+b+"="+sub);
                break;
            case '*':
               double mul=a*b;
                System.out.println(a+"*"+b+"="+mul);
                break;
            case '/':
               if(b==0){
                System.out.println("Invalid division");
               }else{
                double div=a/b;
                System.out.println(a+"/"+b+"="+div);
               }
               
                break;
            case '%':
                if(b==0){
                    System.out.println("Invalid division");
                }else{
                    double rem=a%b;
                System.out.println(a+"%"+b+"="+rem);
                }
               
                break;
            

                
            default:
                System.out.println("Invalid operator");
                break;
        }


        
    }
    
}
