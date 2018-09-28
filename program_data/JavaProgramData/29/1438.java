package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int e;
		double[] sum = new double[100];
		double a;
		double b;
		double t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			a = 2;
			b = 1;
			sum[i] = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			for (j = 1;j <= m;j++)
			{
							  t = a / b;
							  sum[i] += t;
							  e = a;
							  a = a + b;
							  b = e;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (i == n - 1)
			{
					 System.out.printf("%.3lf",sum[i]);
			}
					 else
					 {
						   System.out.printf("%.3lf\n",sum[i]);
					 }
		}
	   return 0;
	}
}

