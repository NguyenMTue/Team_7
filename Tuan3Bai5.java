import java.util.Scanner;
public class Tuan3Bai5 
{
	public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);    
        System.out.print("Nhap vao canh a la\n: ");
        double a= sc.nextDouble();       
        System.out.print("Nhap vao canh b la\n: ");
        double b= sc.nextDouble();      
        System.out.print("Nhap vao canh c la\n: ");
        double c= sc.nextDouble(); 
        if(a+b > c && a+c > b && b+c > a) {
            System.out.println("3 canh tao thanh tam giac");            
            if (a == b && b == c) 
                System.out.println("Tam giac deu.");
             else if(a == b || a == c || b == c) 
                System.out.println("Tam giac can.");
             else if(a*a == b*b + c*c || b*b == a*a + c*c || c*c == a*a + b*b) 
                System.out.println("Tam giac vuong");
             else 
                System.out.println("Tam giac thuong");
            }
        else 
            System.out.println("3 canh khong tao thanh tam giac");        
    }
}

