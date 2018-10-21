package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double[] s = new double[100];
		double a;
		double b;
		double d;
		double e;
		int m;
		int[] c = new int[100];
		int i;
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
				c[i] = Integer.parseInt(tempVar2);
			}
		}

		for (i = 0;i < m;i++)
		{
			a = 2.000;
			b = 1.000;
			e = 2.000;
			if (c[i] == 1)
			{
			   s[i] = e;
			}
			if (c[i] != 1)
			{
				for (int j = 1;j < c[i];j++)
				{
					d = a;
					 a = a + b;
					b = d;
					e = e + a / b;
				}
			s[i] = e;
			}
		}

		for (int k = 0;k < m;k++)
		{
			System.out.printf("%.3lf\n",s[k]);
		}
		return 0;
	}

}

