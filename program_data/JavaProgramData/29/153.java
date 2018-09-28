package <missing>;

public class GlobalMembers
{
	public static int sl(int n)
	{
		if (n == 1)
		{
			return 1;
		}
		else if (n == 2)
		{
			return 2;
		}
		else
		{
			return sl(n - 1) + sl(n - 2);
		}

	}
	public static int Main()
	{
		int m;
		int n;
		int j;
		int i;
		double sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 0;i < m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			sum = 0;
			for (j = 1;j <= n;j++)
			{
				sum += (double)sl(j + 1) / sl(j);
			}
			System.out.printf("%.3lf\n",sum);
		}

		return 0;
	}
}

