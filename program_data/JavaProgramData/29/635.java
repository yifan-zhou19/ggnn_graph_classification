package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a = 2;
		int b = 1;
		int e;
		int m;
		int n;
		int i;
		int j;
		double[] c = new double[100];
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
			c[i] = 0.0;
			for (j = 0;j < n;j++)
			{
				c[i] = c[i] + 1.0 * a / b;
				//printf("?????:%d/%d",a,b);
				e = a;
				a = a + b;
				b = e;
			}
			a = 2;
			b = 1;
		//	printf("%.3lf",c[i]);
		}
		for (i = 0;i < m - 1;i++)
		{
			System.out.printf("%.3lf\n",c[i]);
		}
		System.out.printf("%.3lf",c[i]);
	return 0;
	}

}

