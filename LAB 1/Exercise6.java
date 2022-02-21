import java.util.*;

class Exe6
{
public static int calculateDifference(int a)
{
int sumOfSquare=0;
int sum=0;

for(int i=1;i<=a;i++)
{
sumOfSquare=sumOfSquare+(int)Math.pow(i,2);
sum=sum+i;

}
return sumOfSquare-(int)Math.pow(sum,2);

}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int res=calculateDifference(a);
System.out.println("Difference is:"+res);
}

}