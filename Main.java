import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

// Import list array to easily get, add, delete, update data
class Main {
    // instantiate the variables ill be using

    private static String command;
    private static String make;
    private static String model;
    private static String color;
    private static int year;
    private static int mileage;
    static boolean exit = false;
    static ArrayList<String> carStrings = new ArrayList<String>();
    static ArrayList<Integer> carInts = new ArrayList<Integer>();
    static Map<String, List> listMap = new HashMap<String, List>();

    public static void main(String[] string) {
        try (Scanner scnr = new Scanner(System.in)) {
            System.out.println(
                    "Welcome to Richies automobile inventory tracker! please see the following list of commands you can use to interact with the inventory.");
            System.out.println(" ");
            System.out.println(" To add a vehicle input: -add");
            System.out.println(" To delete a vehicle input: -del");
            System.out.println(" To update a vehicle input: -upd");
            System.out.println(" To get the vehicles list: -get");
            System.out.println(" To exit the program : -exit");
            command = scnr.nextLine();

            while (true) {
                if (scnr.equals("-exit")) {
                    System.out.println("Thanks for using my programe");
                    System.exit(0);
                }
                switch (command) {
                    case "-add":
                        addVehicle();

                        break;
                    case "-del":
                        deleteVehicle();
                        break;
                    case "-upd":
                        updateVehicle();
                        break;
                    case "-get":
                        getVehicle();
                        break;

                }

            }

        } catch (Exception e) {

            System.out.println(e.getMessage());

        }

    }

    public static String addVehicle() {

        try (Scanner scnr = new Scanner(System.in)) {
            System.out.println("add car make");
            make = scnr.nextLine();
            System.out.println("add model");
            model = scnr.nextLine();
            System.out.println("add color");
            color = scnr.nextLine();
            System.out.println("add year");
            year = scnr.nextInt();
            System.out.println("add mileage");
            mileage = scnr.nextInt();
            carStrings.add(make);
            carStrings.add(model);
            carStrings.add(color);
            carInts.add(year);
            carInts.add(mileage);
            listMap.put("strings", carStrings);
            listMap.put("integers", carInts);

        } catch (Exception e) {

            System.out.print(e.getMessage());

        }
        return "successfully added :" + make + " " + model + " " + color + " " + year + " " + mileage;

    }

    public static void getVehicle() {
        // this method will display all vehivles currently listed in the array
        listMap.get("strings").add("value");
        listMap.get("integers").add(new Integer(10));
    }

    public static void deleteVehicle() {
        // this method will remove vehicles from the array
        System.out.println("del");
    }

    public static void updateVehicle() {
        // this method will update a vehicles data
        System.out.println("update");
    }
}
