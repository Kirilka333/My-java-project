import java.util.Scanner;
public class Year {
    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);

        int year = scanner.nextInt();

        String result = ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
        ?"The year is leap"
        :"Tke year isn't leap";
System.out.println(result);


    }

}