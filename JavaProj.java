import java.util.*;


public class JavaProj {
    
    public static void main(String[] args) {
        System.out.println("The New Change is Here !!!");
      Scanner sc =new Scanner(System.in);
        System.out.println("The New Project");
        System.out.println("Enter the Number :-");
        int a=sc.nextInt();
        
        if(a%2==0){
            System.out.println("Even Number!!!");
        }
        else{
            System.out.println("Odd NUmber");
        }
        sc.close();
    }
}
