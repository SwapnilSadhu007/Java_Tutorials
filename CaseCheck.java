import java.util.Scanner;
class CaseCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next().trim();
        int n = sc.nextInt();
        char ch = str.charAt(n);
        if (ch >= 'a' && ch <= 'z') {
            System.out.println("Lowercase");
        } else if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Uppercase");
        } else {
            System.out.println("Not an alphabet");
        }
    }
}
