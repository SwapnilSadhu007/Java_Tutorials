import java.util.Scanner;
class Fibo{
public static void main(String[] args){
Scanner in = new Scanner(System.in);
int n = in.nextInt();
System.out.println("Range:"+n);
int a= 0;
int b=1;
System.out.println(a+ " ");
if(n>1){
System.out.println(b+ " ");
}
for(int i=2;i<=n;i++){
int c = a+b;
System.out.println(c+" ");
a=b;
b=c;
}
}
}


