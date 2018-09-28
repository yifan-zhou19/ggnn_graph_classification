package <missing>;

public class GlobalMembers
{
	public static int prime(int n)
	{
		int i = 0;
		int t = 0;
		float f = 0F;
		f = Math.sqrt(n);
		t = (int)f;
		if (n <= 10)
		{
			if ((n == 2) || (n == 3) || (n == 5) || (n == 7))
			{
				return (1);
			}
			else
			{
				return (0);
			}
		}
		else
		{
			if (n % 2 == 0)
			{
				return (0);
			}
			else
			{
				for (i = 3;i <= t;i++)
				{
					if (n % i == 0)
					{
						break;
					}
				}
				if (i == t + 1)
				{
					return (1);
				}
				else
				{
					return (0);
				}
			}
		}
	}
	public static void divide(int a)
	{
		int i;
		for (i = 2;i <= a;i++)
		{
			if ((prime(i) == 1) && (prime(a - i) == 1))
			{
				break;
			}
		}
		System.out.printf("%d=%d+%d\n", a, i, a - i);
	}
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		if (m >= 6)
		{
			for (i = 6;i <= m;i = i + 2)
			{
				divide(i);
			}
		}
	}
}

