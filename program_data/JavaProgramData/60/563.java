package <missing>;

public class GlobalMembers
{
	public static int prime(int n)
	{
		int i;
		int a;
		{
			for (i = 2;i <= Math.sqrt(n);i++)
			{
		   if (n % i == 0)
		   {
		   a = 0;
		   break;
		   }
			}
		if (i > Math.sqrt(n))
		{
			a = 1;
		}
		}
		return a;
	}
	public static int Main()
	{
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n < 5)
		{
			System.out.print("empty");
		}
		else
		{
			System.out.print("3 5");
		}
		for (i = 5;i + 2 <= n;i += 2)
		{
		if (prime(i) * prime(i + 2) == 1)
		{
		System.out.printf("\n%d %d",i,i + 2);
		}
		}

	}

}

