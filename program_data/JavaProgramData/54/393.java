package <missing>;

public class GlobalMembers
{
	public static void work()
	{
		i++;
	 if (temp % n == k && temp >= n)
	 {
		 temp = (temp - k) / n * (n - 1);
	   if (i == n)
	   {
		   p = 0;
	   }
	   else
	   {
		   work();
	   }
	 }

	}
	public static int temp;
	public static int p;
	public static int i;
	public static int sum;
	public static int j;
	public static int k;
	public static int n;

	public static void Main()
	{

	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 k = Integer.parseInt(tempVar2);
	 }
	 sum = k;
	 p = 1;
	 while (p == 1)
	 {
		 sum = sum + n;
		 temp = sum;
		 i = 0;
		 work();
	 }
	 System.out.printf("%ld",sum);
	}
}

