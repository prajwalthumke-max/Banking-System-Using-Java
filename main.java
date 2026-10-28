import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int num = scanner.nextInt();

        double totalSalary = 0;
        double highestSalary = 0;
        String highestEmployee = "";

        for (int i = 1; i <= num; i++) {

            System.out.println("\nEmployee " + i);

            System.out.print("Enter Employee ID: ");
            int empID = scanner.nextInt();

            scanner.nextLine();

            System.out.print("Enter Employee Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter Basic Salary: ");
            double salary = scanner.nextDouble();

            double hra = salary * 0.20;
            double da = salary * 0.10;
            double tax = salary * 0.05;
            double netSalary = salary + hra + da - tax;

            totalSalary += netSalary;

            if (netSalary > highestSalary) {
                highestSalary = netSalary;
                highestEmployee = name;
            }

            System.out.println("\n----- Employee Details -----");
            System.out.println("Employee ID: " + empID);
            System.out.println("Employee Name: " + name);
            System.out.println("Basic Salary: " + salary);
            System.out.println("HRA: " + hra);
            System.out.println("DA: " + da);
            System.out.println("Tax: " + tax);
            System.out.println("Net Salary: " + netSalary);
        }

        double averageSalary = totalSalary / num;

        System.out.println("\n========== SUMMARY ==========");
        System.out.println("Average Salary: " + averageSalary);
        System.out.println("Highest Salary: " + highestSalary);
        System.out.println("Highest Paid Employee: " + highestEmployee);

        scanner.close();
    }
}