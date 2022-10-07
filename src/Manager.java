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
        cars.add(new Car(1, Brand.Audi, "XL900", 1900, Color.Black, 900000, "AK9000DK"));

        //(int id, Brand brand, String model,
        // int year, Color color, long prise, String registration)
    }

    public static int intParse(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
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
