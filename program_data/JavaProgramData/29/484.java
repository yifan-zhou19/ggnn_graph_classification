package <missing>;

public class GlobalMembers
{
	public static int f(int a)
	{
		if (a == 1)
		{
			return 1;
		}
		else if (a == 2)
		{
			return 2;
		}
		return f(a - 1) + f(a - 2);
	}
	public static int Main()
	{
		int n;
		int i;
		int a1;
		int a2;
		int j;
		int m;
		double sum;
		a1 = f(1);
		a2 = f(2);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			sum = 2;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			for (j = 2;j <= m;j++)
			{

			   sum += (1.0 * f(j + 1) / f(j));
			}
			System.out.printf("%.3lf\n",sum);
		}

		  return 0;
	}
}

