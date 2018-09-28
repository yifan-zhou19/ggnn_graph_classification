package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int su = int x;
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 3;i <= n / 2;i += 2)
		{
			if (su(i) != 0 && su(n - i) != 0)
			{
				System.out.printf("%d %d\n",i,n - i);
			}
		}
	}

	public static int su(int x)
	{
		int t;
		int k;
		int leap = 1;
		if (x == 3)
		{
		  return 1;
		}
		else
		{
			for (t = 3;t <= (x / 2);t += 2)
			{
				k = x % t;
				if (k == 0)
				{
					leap = 0;
					break;
				}
			}
		}
		return (leap);
	}
}

