import java.util.Scanner;
public class houseHold {
    public static int calculateTotal(int morningUsage , int eveningUsage){
        return morningUsage + eveningUsage;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter evening water Usage:");
        int eveningUsage = sc.nextInt();
        int total = calculateTotal(morningUsage,eveningUsage);

        System.out.println("Total Water consumption:" + total +"liters");

        sc.close();
    }
}
