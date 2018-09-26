package <missing>;

public class GlobalMembers
{
	public static int prime(int n)
	{
		int i;
		int flag = 1;
		for (i = 2;i <= Math.sqrt(n);i++)
		{
			if (n % i == 0)
			{
				flag = 0;
				return 0;
			}
		}
		if (flag != 0)
		{
		return 1;
		}
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
		int j;
		int k;
	   for (i = 2;i <= n / 2;i++)
	   {
		   if (prime(i) == 1)
		   {
			   if (prime(n - i) == 1)
			   {
				   System.out.printf("%d %d\n",i,n - i);
			   }
		   }
	   }
	}


}

