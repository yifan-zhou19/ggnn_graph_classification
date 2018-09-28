package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		int i;
		for (i = 0;i < m;i++)
		{
			int n;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			int a = 2;
			int b = 1;
			int k;
			int e;
			double sum = 0;
			for (k = 1;k <= n;k++)
			{
				sum += (double)a / b;
				e = a;
				a = a + b;
				b = e;
			}
			System.out.printf("%.3lf\n",sum);
		}
		return 0;
	}
}

