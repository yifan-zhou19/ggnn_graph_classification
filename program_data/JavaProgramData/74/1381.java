package <missing>;

public class GlobalMembers
{
	public static int h(int n)
	{
		int s = 0;
		int k;
		int y = n;
		while (y > 0)
		{
			k = y % 10;
			s = 10 * s + k;
			y = y / 10;
		}
		if (s == n)
		{
			return (1);
		}
		else
		{
			return (0);
		}
	}
	public static int s(int n)
	{
		if (n == 1)
		{
			return (0);
		}
		else
		{
			int i;
			int j;
			j = n / 2;
			for (i = 2;i <= j;i++)
			{
			if (n % i == 0)
			{
				break;
			}
			else
			{
				j = n / i;
			}
			}
			if (i > j)
			{
				return (1);
			}
			else
			{
				return (0);
			}
		}
	}
	public static void Main()
	{
		int m;
		int n;
		int i;
		int k = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = m;i <= n != 0 && k < 1;i++)
		{
			if (h(i) != 0 && s(i) != 0)
			{
				System.out.printf("%d",i);
				k = k + 1;
			}
		}
		if (k == 0)
		{
			System.out.print("no");
		}
		else
		{
			int j;
			for (j = i;j <= n;j++)
			{
				if (h(j) != 0 && s(j) != 0)
				{
					System.out.printf(",%d",j);
				}
			}
		}
	}
}

