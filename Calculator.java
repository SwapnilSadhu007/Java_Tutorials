import java.util.Scanner;
class Calculator{
int num1;
int num2;
public void input(){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the first number:");

num1=sc.nextInt();
System.out.println("Enter the second number:");
//Scanner sc2 = new Scanner(System.in);
num2=sc.nextInt();
}

public void add(){
int result=num1+num2;
System.out.println("Addition:"+result);
}

public void sub(){
int result=num1-num2;
System.out.println("Substraction:"+result);
}

public void mul(){
int result=num1*num2;
System.out.println("Multiplication:"+result);
}

public void div(){
int result=num1/num2;
System.out.println("Division:"+result);
}

public static void main(String[] args){
Calculator a = new Calculator();
a.input();
a.add();
a.sub();
a.mul();
a.div();
}
}









