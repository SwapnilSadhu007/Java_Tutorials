import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int empID = sc.nextInt();
        String department = sc.next();

        switch (empID) {
            case 1:
                System.out.println("Emp1");
                break;
            case 2:
                System.out.println("Emp2");
                break;
            case 3:
                System.out.println("Emp3");
                switch (department) {
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "CSE":
                        System.out.println("CSE Department");
                        break;
                    case "ECE":
                        System.out.println("ECE Department");
                        break;
                    default:
                        System.out.println("No Department entered");
                }
                break;
            default:
                System.out.println("Enter correct EmpID");
        }
    }
}
