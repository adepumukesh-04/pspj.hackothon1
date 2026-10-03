import java.util.Scanner;
public class waterBill {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter water consumption in liters:");
        double water = sc.nextDouble();
        int bill;
        if(water <= 500){
            bill = 100;
        }else{
            bill = 200;
        }

        System.out.println("Water Consumption:" + water + "liters");
        System.out.println("Water Bill: Rs."+ bill);

        sc.close();

    }
    
}
