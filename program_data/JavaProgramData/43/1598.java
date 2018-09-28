package <missing>;

public class GlobalMembers
{
	public static int pd(int x)
	{
		int z = 0;
		int i;
		if (x % 2 != 0)
		{
			   for (i = 3;i <= Math.sqrt(x);i += 2)
			   {
				   if (x % i == 0)
				   {
				break;
				   }
			   }
			 if (i > Math.sqrt(x))
			 {
			 z = 1;
			 }
		}
			 return z;
	}

	public static int Main()
	{
		int n;
		int a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (a = 3;a <= n / 2;a += 2)
		{
			if (pd(a) == 1 && pd(n - a) == 1)
			{
			  System.out.printf("%d %d\n\n",a,n - a);
			}
		}

		 return 0;
	}

}

