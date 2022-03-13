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

    public static void main(String[] string) {
        try (Scanner scnr = new Scanner(System.in)) {
            System.out.println(
                    "Welcome to Richies automobile inventory tracker! please see the following list of commands you can use to interact with the inventory.");
            System.out.println(" ");
            System.out.println(" To add a vehicle input: -add");
            System.out.println(" To delete a vehicle input: -del");
            System.out.println(" To update a vehicle input: -upd");
            command = scnr.nextLine();
            switch (command) {
                case "-add":
                    addVehicle();
                    System.out.print(addVehicle());
                    break;
                case "-del":
                    deleteVehicle();
                    break;
                case "-upd":
                    updateVehicle();
                    break;

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

        } catch (Exception e) {

            System.out.print(e.getMessage());

        }
        return "successfully added" + make + model + color + year + mileage;

    }

    public void getVehicle() {
        // this method will display all vehivles currently listed in the array
        System.out.println("add");
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
