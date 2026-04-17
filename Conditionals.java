import java.util.Scanner;
public class Conditionals{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter your Salary:");
int Salary=sc.nextInt();
if (Salary>10000){
Salary+=2000;
}
else if (Salary>20000){
Salary+=3000;
}
else{
Salary+=1000;
}
System.out.println("Final Salary:"+Salary);
}
}