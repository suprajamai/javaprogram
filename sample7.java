import java.util.Scanner;
class sample7
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
char n=s.next().charAt(0);
if(n>='a' && n<='z'||n>='A' && n<='Z')
System.out.println("Alphabet");
else
System.out.println('No');
s.close();
}
}
