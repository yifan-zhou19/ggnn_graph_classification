package <missing>;

public class GlobalMembers
{
	public static int isPrime(int a)
	{
		int i;
		for (i = 2;i < a;i++)
		{
		if (a % i == 0)
		{
			return 0;
		}
		}
		return 1;
	}
	public static int Main()
	{
	   int n;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   int i;
	   int sum = 0;
	   for (i = 3;i + 2 <= n;i++)
	   {
	   if (isPrime(i) != 0 && isPrime(i + 2) != 0)
	   {
		   System.out.printf("%d %d\n",i,i + 2);
		   sum++;
	   }
	   }
	   if (sum == 0)
	   {
		   System.out.print("empty");
	   }
	   return 0;
	}


}

