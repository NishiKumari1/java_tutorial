import java.util.Scanner;
class Perfect_square
{
public static void main(String[] args)
{
Scanner sc= new Scanner(System.in);
int num=sc.nextInt();
int i=1;
boolean is_sqr = false;
while(i<num)
{
if(i*i==num)
{
is_sqr = true;
break;
}

i=i+1;
}

if(is_sqr==true){
System.out.println("this is a perfect square");
}else{
System.out.println("no is not perfect square");
}
}
}


