package <missing>;

public class GlobalMembers
{
	public static int apple(int m, int n)
	{
		int sum = 0;
		int j;
		if (m == 0)
		{
			return 1;
		}
		if (m < n)
		{
			return apple(m, m);
		}
		if (m >= n)
		{
			for (j = n;j > 0;j--)
			{
				sum += apple(m - j, j);
			}
			return sum;
		}
	}
	public static int Main()
	{
		int num;
		int i;
		int p;
		int q;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			num = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= num;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				q = Integer.parseInt(tempVar3);
			}
			System.out.printf("%d\n",apple(p, q));
		}
		return 0;
	}
}

