package <missing>;

public class GlobalMembers
{
	public static int f(int n)
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
			return f(n - 2) + f(n - 1);
		}
	}
	public static double he(int n)
	{
		int i;
		double sum = 0;
		for (i = 1;i <= n;i++)
		{
			sum += (double)f(i + 1) / f(i);
		}
		return sum;
	}

	public static int Main()
	{
		int m;
		int[] s = new int[100];
		int i;
		int j;

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
				s[i] = Integer.parseInt(tempVar2);
			}
		}

		for (j = 0;j < m;j++)
		{
			System.out.printf("%.3lf\n",he(s[j]));
		}

		return 0;
	}

}

