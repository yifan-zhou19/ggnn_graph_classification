package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int a1;
		int a2;
		double e;
		double x;
		double sum;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			sum = 0;
			a1 = a2 = 1;
			for (j = 0;j < m;j++)
			{
				e = a1 + a2;
				a1 = a2;
				a2 = e;
				x = 1.0 * a2 / a1;
				sum += x;
			}
			System.out.printf("%.3lf\n",sum);
		}
		return 0;
	}
}

