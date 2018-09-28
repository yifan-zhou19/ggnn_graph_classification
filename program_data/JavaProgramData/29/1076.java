package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int i;
		int j;
		int n;
		double c;
		double a;
		double b;
		double d;
		double[] sz = new double[100];
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
			c = 0;
			a = 2;
			b = 1;
			for (j = 0;j < n;j++)
			{
				c += a / b;
				d = b;
				b = a;
				a = a + d;
			}
			sz[i] = c;
		}
		for (i = 0;i < m;i++)
		{
		System.out.printf("%.3lf\n",sz[i]);
		}
		return 0;
	}

}

