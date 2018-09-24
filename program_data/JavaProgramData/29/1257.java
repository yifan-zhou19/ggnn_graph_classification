package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int m;
		int n;
		double a = 1;
		double b = 1;
		double s = 0;
		double t;
		double d;
		double[] sum = new double[MAX];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}

		for (i = 0;i < m;i++)
		{
			s = 0;
			a = 1;
			b = 1;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			for (j = 1;j <= n;j++)
			{
				d = (a + b) / b;
				s = s + d;
				t = b;
				b = a + b;
				a = t;
			}
			sum[i] = s;
		}
		for (i = 0;i < m;i++)
		{
			System.out.printf("%.3lf\n",sum[i]);
		}

	   return 0;
	}


}

