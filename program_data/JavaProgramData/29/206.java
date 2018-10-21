package <missing>;

public class GlobalMembers
{
	public static double f(int n)
	{
		if (n == 1)
		{
			return 2.0;
		}
		else
		{
			return 1 / f(n - 1) + 1.0;
		}
	}
	public static int Main()
	{
		int a;
		int i;
		int m;
		int j;
		double sum;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		for (i = 0;i < a;i++)
		{
			sum = 0.0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			for (j = 1;j < m + 1;j++)
			{
				sum += f(j);
			}
			System.out.printf("%.3lf\n",sum);
		}
		return 0;
	}


}

