package <missing>;

public class GlobalMembers
{
	public static int su(int n)
	{
		int i;
		int l;
		l = Math.sqrt(n);
		for (i = 2;i <= l;i++)
		{
			if (n % i == 0)
			{
				return (0);
			}
		}
		return (1);
	}
	public static void Main()
	{
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 3;i <= n / 2;i++)
		{
			if (i % 2 != 0 && (n - i) % 2 != 0 && su(i) != 0 && su(n - i) != 0)
			{
				System.out.printf("%d %d\n",i,n - i);
			}
		}
	}
}

