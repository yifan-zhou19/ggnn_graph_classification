package <missing>;

public class GlobalMembers
{
	public static int prime(int a)
	{
		int k;
		int x = (int)Math.sqrt(a);
		for (k = 2;k <= x;k++)
		{
			if (a % k == 0)
			{
				break;
			}
		}
		if (k > x)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}

	public static int Main()
	{
		int m;
		int i;
		int a;
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 3;i <= m / 2;i++)
		{
			a = i;
			b = m - i;
			if ((prime(a) == 1) && (prime(b) == 1))
			{
					System.out.printf("%d %d\n",a,b);
			}
		}


		return 0;
	}
}

