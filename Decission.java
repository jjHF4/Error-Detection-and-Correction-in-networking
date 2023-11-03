public class Decission {
    public static void main(String[] args){

    int num=12345;
    String rev= " ";
    int rem,cos=num;
    while(cos>0){
        rem=cos%10;
        cos=cos/10;
        rev=rev+rem;
    }
    System.out.println("The reverse of "+num+" is "+rev);

    }
}
