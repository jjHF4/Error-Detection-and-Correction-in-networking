import java.util.Scanner;
public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the binary number is:");
        int num = sc.nextInt();
        int i=0;
        int t=num;
        int d=0;
        int r;
        while (t>0) {
            r=t%10;
            t=t/10;
            d= d+r *(int)Math.pow(2,i++);
        }
        System.out.println("The equivalent of "+num+" is "+d);

    }
}


