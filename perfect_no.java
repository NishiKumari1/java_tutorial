import java.util.Scanner;
class perfect_no
{
public static void main(String[] args)
{
Scanner sc= new Scanner(System.in);
int num=sc.nextInt();
int i=1;
int ans=0;
while(i<num)
{
if(num%i==0)
{
i=i+ans;
}
i++;
}
if(i==num)
{
System.out.println("No is a perfect_no");
}
else
{
System.out.println("No is not a perfect_no");
}
}
}