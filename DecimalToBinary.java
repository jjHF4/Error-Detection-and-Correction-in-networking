import java.util.Scanner;
public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the decimal number is:");
        int num = sc.nextInt();
        int t=num;
        String b = "";
        int r;
        while (t>0){
            r=t%2;
            t=t/2;
            b=r+b;
        }
        System.out.println("The binary equivalent of "+num+" is "+b);

    }
}
