package <missing>;

public class GlobalMembers
{
	public static int p(int n)
	{
		int i;
		int j;
		j = Math.sqrt(n);
		if (n % 2 == 0)
		{
			return 0;
		}
		else
		{
			for (i = 3;i <= j;)
			{
				if (n % i == 0)
				{
				break;
				}
				i = i + 2;
			}
			if (i > j)
			{
				return 1;
			}
			else
			{
				return 0;
			}
		}
	}
	public static void Main()
	{
		int n;
		int m;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (m = 6;m <= n;)
		{
			for (i = 2;i <= (m / 2);i++)
			{
				j = m - i;
			if (p(i) == 1 && p(j) == 1)
			{
				break;
			}
			}
			System.out.printf("%d=%d+%d\n",m,i,j);
			m = m + 2;
		}
	}
}

