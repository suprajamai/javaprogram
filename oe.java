import java.util.scanner;
class oe
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
if(n<0)
System.out.println("invalid");
else
{
if(n%2==0)
System.out.println("even");
else
System.out.println("odd");
}
}
}
