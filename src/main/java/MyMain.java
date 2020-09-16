import java.util.Scanner;

public class MyMain {
    
    public static int binaryToDecimal(String binary) { 
    int input=Integer.parseInt(binary);
    
    int output =0;
    for(double i=0;input>0;i++){
        int mult = (int) Math.pow(2.0,i);
        output=output+((input%10)*(mult));
        input=(input/10);
        
    }
    return output;

    }
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type a number in Binary (1's and 0's)");
        String binNum = scan.nextLine();
        System.out.println("This number in Decimal is " +binaryToDecimal(binNum));
        scan.close();
    }
}
