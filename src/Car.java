enum Brand {
    VOLVO,
    MERCEDES,
    AUDI,
    TOYOTA,
    VOLKSWAGEN,
    BMV,
    RENAULT,
    CITROEN,
    SKODA
}

enum Color{
    Red,
    Black,
    White,
    Brown,
    Green
}

public class Car {
    private int id;
    private Brand brand;
    private String model;
    private int year;
    private Color color;
    private long prise;
    private String registration;

    public Car(int id, Brand brand, String model,
               int year, Color color, long prise, String registration){
        this.id = id;
        this.brand = brand;
        this.color = color;
        this.year = year;
        this.model = model;
        this.prise = prise;
        this.registration = registration;
    }

    public int getId(){
        return id;
    }

    public Brand getBrand(){
        return brand;
    }

    public String getModel(){
        return model;
    }

    public Color getColor(){
        return color;
    }

    public int getYear(){
        return year;
    }

    public long getPrise(){
        return prise;
    }

    public String getRegistration(){
        return registration;
    }

    public void DisplayInfo(){
        System.out.println("ID:" + this.id);
        System.out.println("Brand:" + this.brand);
        System.out.println("Color:" + this.color);
        System.out.println("Model:" + this.model);
        System.out.println("Year:" + this.year);
        System.out.println("Prise:" + this.prise);
        System.out.println("Registration number:" + this.registration);
        System.out.println();
    }
}
