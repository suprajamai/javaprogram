import java.util.Scanner;
class sample1
{
public static void main(String args[])
{
char c;
Scanner s=new Scanner(System.in);
c=s.next().charAt(0);
if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U')
  System.out.println("Vowel");
else if(!(c>='a' && c<='z')||(c>='A' && c<='Z'))
  System.out.println("invalid");
else
  System.out.println("consonant");
s.close();
}
}
