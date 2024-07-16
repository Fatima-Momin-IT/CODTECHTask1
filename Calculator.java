import java.util.*;
public class Calculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float n1,n2;
        System.out.println("enter number 1:");
        n1=sc.nextFloat();
        System.out.println("enter number 2:");
        n2=sc.nextFloat();
        String operator;
        System.out.println("enter any operator:");
        operator=sc.next();
        switch(operator){
            case "+":
                System.out.println(n1+n2);
                break;
            case "-":
                System.out.println(n1-n2);
                break;
            case "*":
                System.out.println(n1*n2);
                break;
            case "/":
                System.out.println(n1/n2);
                if(n2==0){
                    System.out.println("can't divide by zero");
                }
                break;
            case "^":
                System.out.println(Math.pow(n1,2)); 
                System.out.println(Math.pow(n2,3));  
            case "%":
                System.out.println(n1%n2);     
            default:
                System.out.println("please enter valid opertor");




        }
        
    }
}
