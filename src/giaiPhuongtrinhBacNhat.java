import java.util.Scanner;

public class giaiPhuongtrinhBacNhat {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double a;
        double b;
        double c;
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a * x + b = c', please enter constants:");
        System.out.print("a= ");
        a=sc.nextDouble();
        System.out.print("b= ");
        b=sc.nextDouble();
        System.out.print("c= ");
        c=sc.nextDouble();
        if(a!=0){
        double solution= (c-b)/a;
            System.out.printf("the solution is: "+solution);
        }else{
            if(b==0){
                System.out.println("the solution is all x ");
            }else{
                System.out.println("No solution");
            }
        }

    }
}
