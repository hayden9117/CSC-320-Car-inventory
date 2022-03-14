import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;

// Import list array to easily get, add, delete, update data
class Main {
    // instantiate the variables ill be using
    static Scanner scnr = new Scanner(System.in);
    static String userInput;

    public static void main(String[] string) {
        final String exit = "-exit";
        final String command = "-add, -del, -get, -upt, -exit";
        final int elements = 10;
        ArrayList<String> make = new ArrayList<String>(elements);
        ArrayList<String> model = new ArrayList<String>(elements);
        ArrayList<String> color = new ArrayList<String>(elements);
        ArrayList<String> year = new ArrayList<String>(elements);
        ArrayList<String> mileage = new ArrayList<String>(elements);
        System.out.println(
                "Welcome to Richies automobile inventory tracker! please see the following list of commands you can use to interact with the inventory.");
        System.out.println(" ");
        System.out.println(" To add a vehicle input: -add");
        System.out.println(" To delete a vehicle input: -del");
        System.out.println(" To update a vehicle input: -upd");
        System.out.println(" To get the vehicles list: -get");
        System.out.println(" To exit the program : -exit");

        userInput = getInput(command);
        while (userInput != exit) {
            if (userInput.equals("-add")) {

                addVehicle(make, model, color, year, mileage);

            } else if (userInput.equals("-del")) {
                deleteVehicle(make, model, color, year, mileage);

            } else if (userInput.equals("-get")) {
                getVehicle(make, model, color, year, mileage);

            } else if (userInput.equals("-upt")) {
                updateVehicle(make, model, color, year, mileage);

            } else if (userInput.equals("-exit")) {
                exit(make, model, color, year, mileage);
            }
            userInput = getInput(command);
        }

    }

    public static void addVehicle(
            ArrayList<String> make,
            ArrayList<String> model,
            ArrayList<String> color,
            ArrayList<String> year,
            ArrayList<String> mileage) {
        String addMake;
        String addModel;
        String addColor;
        String addYear;
        String addMileage;

        System.out.println("\nEnter the make of the vehicle: ");
        addMake = scnr.nextLine();
        System.out.println("Enter the model: ");
        addModel = scnr.nextLine();
        System.out.println("Enter the color: ");
        addColor = scnr.nextLine();
        System.out.println("Enter the year: ");
        addYear = scnr.nextLine();
        System.out.println("Enter the mileage: ");
        addMileage = scnr.nextLine();

        make.add(addMake);
        model.add(addModel);
        color.add(addColor);
        year.add(addYear);
        mileage.add(addMileage);

        System.out.println("vehicles information has been added.");
    }

    public static void getVehicle(ArrayList<String> make,
            ArrayList<String> model,
            ArrayList<String> color,
            ArrayList<String> year,
            ArrayList<String> mileage) {
        int length;
        int i;

        length = make.size();
        if (length > 0) {
            System.out.println();
            for (i = 0; i < length; ++i) {
                System.out.println(i + ") Make: " + make.get(i) +
                        ",\tModel: " + model.get(i) +
                        ",\tColor: " + color.get(i) +
                        ",\tYear: " + year.get(i) +
                        ",\tMileage: " + mileage.get(i));

            }
        } else {
            System.out.println("\nNo vehicles in inventory.");
        }

    }

    public static void deleteVehicle(ArrayList<String> make,
            ArrayList<String> model,
            ArrayList<String> color,
            ArrayList<String> year,
            ArrayList<String> mileage) {
        // this method will remove vehicles from the array
        int length;
        int index;
        int i;

        length = make.size();

        if (length > 0) {
            System.out.println();
            for (i = 0; i < length; ++i) {
                System.out.println("\n input the index to delete the element." +
                        i + ") Make: " + make.get(i) +
                        ",\tModel: " + model.get(i) +
                        ",\tColor: " + color.get(i) +
                        ",\tYear: " + year.get(i) +
                        ",\tMileage: " + mileage.get(i));

            }
        } else {
            System.out.println("\nNo vehicles in inventory to delete.");
        }

        index = scnr.nextInt();

        System.out.println();

        make.remove(index);
        model.remove(index);
        color.remove(index);
        year.remove(index);
        mileage.remove(index);

    }

    public static void updateVehicle(ArrayList<String> make,
            ArrayList<String> model,
            ArrayList<String> color,
            ArrayList<String> year,
            ArrayList<String> mileage) {
        String setMake;
        String setModel;
        String setColor;
        String setYear;
        String setMileage;
        int length;
        int index;
        int i;

        length = make.size();

        if (length > 0) {
            System.out.println();
            for (i = 0; i < length; ++i) {
                System.out.println(
                        i + ") Make: " + make.get(i) +
                                ",\tModel: " + model.get(i) +
                                ",\tColor: " + color.get(i) +
                                ",\tYear: " + year.get(i) +
                                ",\tMileage: " + mileage.get(i));

            }
        } else {
            System.out.println("\nNo vehicles in inventory to delete.");
        }

        System.out.println("Enter the index of the vehicle that you want to update: ");
        index = scnr.nextInt();
        System.out.println("\n");
        scnr.nextLine();
        System.out.println("Enter the make of the vehicle that you want to update: ");
        setMake = scnr.nextLine();
        System.out.println("Enter the model: ");
        setModel = scnr.nextLine();
        System.out.println("Enter the color: ");
        setColor = scnr.nextLine();
        System.out.println("Enter the year: ");
        setYear = scnr.nextLine();
        System.out.println("Enter the mileage: ");
        setMileage = scnr.nextLine();

        if (length > 0) {
            System.out.println();
            for (i = 0; i < length; ++i) {
                make.set(index, setMake);
                model.set(index, setModel);
                color.set(index, setColor);
                year.set(index, setYear);
                mileage.set(index, setMileage);

            }
        }
    }

    public static String getInput(String prompt) {
        String answer;

        System.out.println();
        System.out.println(prompt);
        answer = scnr.nextLine();

        return answer;
    }

    public static void exit(ArrayList<String> make,
            ArrayList<String> model,
            ArrayList<String> color,
            ArrayList<String> year,
            ArrayList<String> mileage) {
        String input;
        int length;
        int i;
        length = make.size();
        System.out.println("would you like to print inventory added to a tect document? (y/n)");
        input = scnr.nextLine();

        switch (input) {
            case "y":
                try {
                    File myObj = new File("/Users/richie/portfolio-project/inventory/inventory.txt");
                    if (myObj.createNewFile()) {
                        try (FileWriter myWriter = new FileWriter(
                                "/Users/richie/portfolio-project/inventory/inventory.txt")) {
                            for (i = 0; i < length; ++i) {
                                myWriter.write(
                                        i + ") Make: " + make.get(i) +
                                                ",\nModel: " + model.get(i) +
                                                ",\nColor: " + color.get(i) +
                                                ",\nYear: " + year.get(i) +
                                                ",\nMileage: " + mileage.get(i));

                            }
                        }
                        System.out.println("File created: " + myObj.getName());

                        // /Users/richie/portfolio-project/inventory

                    } else {
                        System.out.println("File already exists.");
                    }
                } catch (IOException e) {
                    System.out.println("An error occurred.");
                    e.printStackTrace();
                }
                break;
            case "n":
                System.exit(0);
                break;
        }

    }

}
