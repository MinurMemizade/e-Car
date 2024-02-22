public class CarInfo implements Interface {
    private String brand;
    private String model;
    private String color;
    private String year;
    private String gearBox;
    private String type;
    private int price;

    public CarInfo(String brand, String model, String color, String year, String gearBox, String type, int price) {
        this.brand=brand;
        this.model=model;
        this.color=color;
        this.year=year;
        this.gearBox=gearBox;
        this.type=type;
        this.price=price;
    }


    public String getBrand() {

        return brand;
    }

    public void setBrand(String brand) {

        this.brand = brand;
    }

    public String getModel() {

        return model;
    }

    public void setModel(String model) {

        this.model = model;
    }

    public String getColor() {

        return color;
    }

    public void setColor(String color) {

        this.color = color;
    }

    public String getYear() {

        return year;
    }

    public void setYear(String year) {

        this.year = year;
    }

    public String getGearBox() {

        return gearBox;
    }

    public void setGearBox(String gearBox) {

        this.gearBox = gearBox;
    }

    public String getType() {

        return type;
    }

    public void setType(String type) {

        this.type = type;
    }

    public int getPrice() {

        return price;
    }

    public void setPrice(int price) {

        this.price = price;
    }

    public void displayInfo()
    {
        System.out.println("Brand:"+brand);
        System.out.println("Model:"+model);
        System.out.println("Color:"+color);
        System.out.println("Year:"+year);
        System.out.println("GearBox:"+gearBox);
        System.out.println("Type:"+type);
        System.out.println("Price:$"+price);
    }
}