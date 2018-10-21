package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int i;
		double[] s = new double[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i < k;i++)
		{
		int m;
		int j;
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		double[] a = new double[100];
		double b = 0;
		double c;
		double[] d = new double[100];
		double e = 0;
		double f;
		for (j = 0;j < m;j++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[j] = Double.parseDouble(tempVar3);
			}
			b = b + a[j];
		}
		c = (double)b / m;
		for (j = 0;j < m;j++)
		{
			d[j] = (double)(a[j] - c) * (a[j] - c);
			e = e + d[j];
		}
		f = (double)e / m;
		s[i] = Math.sqrt(f);
		}
		for (i = 0;i < k;i++)
		{
			System.out.printf("%.5lf\n",s[i]);
		}
		return 0;
	}
}

