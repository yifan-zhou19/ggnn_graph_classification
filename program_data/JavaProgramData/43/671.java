package <missing>;

public class GlobalMembers
{
	public static int n;
	public static void Main()
	{
		int a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (a = 3;a <= n - a;a += 2)
		{
			if (chose(a) != 0 && chose(n - a) != 0)
			{
				System.out.printf("%d %d\n",a,n - a);
			}
		}
	}
	public static int chose(int n)
	{
		int i;
		if (n == 3)
		{
			return 1;
		}
		else if (n % 2)
		{
			for (i = 3;i <= Math.sqrt(n) + 2;i += 2)
			{
				if ((n % i) == 0)
				{
					break;
				}
			}
			if (i > Math.sqrt(n))
			{
				return 1;
			}
			else
			{
				return 0;
			}
		}
		else
		{
			return 0;
		}
	}
}

