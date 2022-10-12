import java.util.ArrayList;
import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;
import java.time.LocalDate;
public class Manager {
    ArrayList<Car> cars;
    int currentYear;

    public Manager() {
        cars = new ArrayList<Car>();
        currentYear = LocalDate.now().getYear();
        testCase();
    }

    public void testCase() {
        cars.add(new Car(1, Brand.AUDI, "XL900", 1900, Color.Black, 9_000_000, "AK9000DK"));
        cars.add(new Car(2, Brand.BMV, "XX800", 1900, Color.Black, 10_000_000, "AA4586DB"));
        cars.add(new Car(3, Brand.MERCEDES, "XL901", 2002, Color.Black, 11_000_000, "AK2031KD"));
        cars.add(new Car(4, Brand.MERCEDES, "XL920", 2000, Color.Black, 6_000_000, "BK9785DH"));
        cars.add(new Car(5, Brand.AUDI, "XL700", 1980, Color.Black, 15_000_000, "AK2479DK"));
    }

    public void start() {
        System.out.println("Select item:\n" +
                "1. Show cars by brand\n" +
                "2. Show cars by model that are operated more than n years: \n" +
                "3. Show cars by year that costed more than $$$\n" +
                "4. Exit");

        int item = intParse();
        switch(item) {
            case 1:
                displayByBrand();
                start();
                break;
            case 2:
                displayByModel();
                start();
                break;
            case 3:
                displayByYear();
                start();
                break;
            case 4:
                break;
            default:
                System.out.println("The value is incorrect!");
                start();
        }
    }


    public static int intParse(){
        try{
            Scanner scanner = new Scanner(System.in);
            return scanner.nextInt();
        }
        catch(Exception exception){
            System.out.println("The value is incorrect!");
            return intParse();
        }
    }

    public static Brand brandParse() {
        try{
            Scanner scanner = new Scanner(System.in);
            return Brand.valueOf(scanner.nextLine().toUpperCase(Locale.ROOT));
        }
        catch(Exception exception) {
            System.out.println("The value is incorrect!");
            return brandParse();
        }
    }
    public static String modelParse() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine().toUpperCase(Locale.ROOT);
    }

    public void displayByBrand(){
        //brand
        boolean displayed = false;
        System.out.println("Enter brand: ");
        Brand brand = brandParse();
        System.out.println("Cars of the brand of " + brand + ":");
        for (var item: cars) {
            if(item.getBrand() == brand) {
                item.DisplayInfo();
                displayed = true;
            }
        }
        if(!displayed) {
            System.out.println("No cars was found with the current filter");
        }

    }
    public void displayByModel(){
        //model
        // > n years
        boolean displayed = false;
        System.out.println("Show cars by model");
        System.out.println("Enter model: ");
        String model = modelParse();
        System.out.println("Enter the number years of operation: ");
        int yearsCounter = intParse();
        int yearsDifference = 0;
        System.out.println("Cars of the model of " + model + " that are operated more than " + yearsCounter + "years:");
        for (var item: cars) {
            if(Objects.equals(item.getModel(), model)) {
                yearsDifference = currentYear - item.getYear();
                if(yearsDifference > yearsCounter) {
                    item.DisplayInfo();
                    displayed = true;
                }
            }
        }
        if(!displayed) {
            System.out.println("No cars was found with the current filter");
        }
    }

    public void displayByYear(){
        boolean displayed = false;
        System.out.println("Show cars by year");
        System.out.println("Enter year: ");
        int year = intParse();
        System.out.println("Enter prise: ");
        int prise = intParse();
        System.out.println("Cars made in year "+ year+ " that costed more than " + prise + ":");
        for (var item: cars) {
            if(item.getYear() == year && item.getPrise() > prise){
                item.DisplayInfo();
                displayed = true;
            }
        }
        if(!displayed) {
            System.out.println("No cars was found with the current filter");
        }
    }
}
