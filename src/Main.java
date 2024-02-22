import java.io.*;
import java.util.Scanner;

public class Main {
   private static final String FOLDER_PATH="/Users/Minur Memizade/Documents/Cars";
    private static final String FILE_PATH=FOLDER_PATH+File.separator+"cars.txt";

    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        Methods methods =new Methods();
        System.out.println("Welcome!");
        while (true)
        {
            System.out.println("Please Enter Your Choice:");
            System.out.println("1.Add Car.");
            System.out.println("2.Remove Car.");
            System.out.println("3.Display All Cars.");
            System.out.println("4.Load Cars from File");
            System.out.println("5.Exit.");
            System.out.println("Waiting for your choice...");
            int choice=sc.nextInt();
            switch (choice)
            {
                case 1:
                    System.out.println("Enter Brand:");
                    String brand= sc.next();
                    System.out.println("Enter Model:");
                    String model=sc.next();
                    System.out.println("Enter Color:");
                    String color=sc.next();
                    System.out.println("Enter Year:");
                    String year=sc.next();
                    System.out.println("Enter GearBox:");
                    String gearBox= sc.next();
                    System.out.println("Enter Type:");
                    String type=sc.next();
                    System.out.println("Enter Price:");
                    int price= sc.nextInt();
                    CarInfo newCarInfo =new CarInfo(brand,model,color,year,gearBox,type,price);
                    methods.addCar(newCarInfo);
                    System.out.println("Car added succesfully.");

                    File f=new File(FOLDER_PATH);
                    if (!f.exists()){
                        f.mkdir();
                    }
                    FileWriter fw=new FileWriter(FILE_PATH,true); //fayli yaradir ve yazmaq ucun acir
                    BufferedWriter bw=new BufferedWriter(fw); //fayla melumat yazmaq ucun
                    bw.write(newCarInfo.getBrand()+"-"+ newCarInfo.getModel()+"-"+ newCarInfo.getColor()+"-"+ newCarInfo.getYear()+"-"+ newCarInfo.getType()+"-"+ newCarInfo.getGearBox()+"-"+ newCarInfo.getPrice());
                    bw.newLine();
                    bw.close();
                    fw.close();
                    break;

                case 2:
                    if (methods.size() > 0) {
                        methods.displayAllCars();
                        System.out.println("Enter the index of the car to remove:");
                        int index = sc.nextInt()-1;
                        if (index >= 0 && index < methods.size()) {
                            CarInfo carInfoToRemove = methods.getCar(index);
                            methods.removeCar(index);
                            FileWriter fileWriter = new FileWriter(FILE_PATH);
                            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

                            for (CarInfo carInfo : methods.getAllCars()) {
                                bufferedWriter.write(carInfo.getBrand() + "," + carInfo.getModel() + "," + carInfo.getColor() + ","
                                        + carInfo.getYear() + "," + carInfo.getGearBox() + "," + carInfo.getType() + "," + carInfo.getPrice());
                                bufferedWriter.newLine();
                            }

                            bufferedWriter.close();
                            System.out.println("Car removed successfully.");
                        } else {
                            System.out.println("Invalid index.");
                        }
                    } else {
                        System.out.println("No cars to remove.");
                    }
                    break;
                case 3:
                        methods.displayAllCars();
                        break;


                case 4:
                    System.out.println("All Cars Saved on File:");
                    BufferedReader br=new BufferedReader(new FileReader(FILE_PATH));
                    {
                        String data;
                        while ((data=br.readLine())!=null) {
                            System.out.println(data);
                        }
                    }
                    break;


                case 5:
                    System.out.println("Exiting the program....");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice.");
            }
        }

    }
}
