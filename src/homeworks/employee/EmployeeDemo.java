package homeworks.employee;

import java.util.Scanner;

public class EmployeeDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeStorage storage = new EmployeeStorage();

        boolean run = true;
        while (run) {
            System.out.println("""
                    Please input command:
                    0 - Exit
                    1 - Add employee
                    2 - Print all employees
                    3 - Search employee by ID
                    4 - Search employee by company name
                    """);

            String command = scanner.nextLine();

            switch (command) {
                case "0" -> run = false;

                case "1" -> {
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter surname: ");
                    String surname = scanner.nextLine();
                    System.out.print("Enter employee ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Enter salary: ");
                    double salary = Double.parseDouble(scanner.nextLine());
                    System.out.print("Enter company: ");
                    String company = scanner.nextLine();
                    System.out.print("Enter position: ");
                    String position = scanner.nextLine();

                    Employee employee = new Employee(name, surname, id, salary, company, position);
                    storage.add(employee);
                    System.out.println("Employee added successfully!");
                }

                case "2" -> storage.printAll();

                case "3" -> {
                    System.out.print("Enter employee ID: ");
                    String id = scanner.nextLine();
                    Employee emp = storage.getByID(id);
                    if (emp != null) {
                        System.out.println(emp);
                    } else {
                        System.out.println("Employee not found!");
                    }
                }

                case "4" -> {
                    System.out.print("Enter company name: ");
                    String companyName = scanner.nextLine();
                    storage.searchByCompany(companyName);
                }

                default -> System.out.println("Invalid command!");
            }
        }

        System.out.println("Program exited.");
    }
}

