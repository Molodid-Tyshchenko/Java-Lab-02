import java.io.Console;
import java.nio.channels.NotYetConnectedException;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Manager {
    ArrayList<Car> cars;
    int currentYear;

    public Manager() {
        cars = new ArrayList<Car>();
        currentYear = 2022;

        //(int id, Brand brand, String model,
        // int year, Color color, long prise, String registration)
    }

    public void testCase() {
        cars.add(new Car(1, Brand.Audi, "XL900", 1900, Color.Black, 9_000000, "AK9000DK"));
        cars.add(new Car(2, Brand.BMV, "XX800", 1900, Color.Black, 10_000000, "AK9000DK"));
        cars.add(new Car(3, Brand.Mercedes, "XL900", 1900, Color.Black, 11_000000, "AK9000DK"));
        cars.add(new Car(4, Brand.Mercedes, "XL900", 1900, Color.Black, 6_000000, "AK9000DK"));
        cars.add(new Car(5, Brand.Audi, "XL900", 1900, Color.Black, 15_000000, "AK9000DK"));
    }

    public static int intParse(){
        try{
            Scanner scanner = new Scanner(System.in);
            return scanner.nextInt();
        }
        catch(NullPointerException exception){
            System.out.println(exception.getMessage());
            throw exception;
        }
    }

    public static void displayByBrand(){
        //brand

    }
    public static void displayByModel(){
        //model
        // > n years

    }
    public static void displayByYear(){
        //year
        // > prise
    }
}
