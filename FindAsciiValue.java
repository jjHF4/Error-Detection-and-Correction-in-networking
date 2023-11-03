import java.util.Scanner;
public class FindAsciiValue {
    public static void main(String[] aditya){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter character : ");
        char ch = sc.next().charAt(0);
        System.out.print(ch);
        int i = (int)ch;
        System.out.println(" character of ascii value is : "+i);
    }
}
