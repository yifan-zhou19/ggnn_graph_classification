package <missing>;

public class GlobalMembers
{
	public static int reverse(int num)
	{
	 int f = 1;
	 int s = 0;
	 if (num < 0)
	 {
	   f = 0;
	   num = -num;
	 }
	 for (;num != 0;)
	 {
	   s = s * 10 + num % 10;
	   num = num / 10;
	 }
	 if (f == 0)
	 {
	   s = -s;
	 }
	 return (s);
	}
	public static void Main()
	{
	 int i;
	 int n;
	 for (i = 1;i <= 6;i++)
	 {
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   System.out.printf("%d\n",reverse(n));
	 }
	}
}

