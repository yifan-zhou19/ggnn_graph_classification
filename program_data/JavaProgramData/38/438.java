package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int i;
		int j;
		double[] x = new double[100];
		double a;
		double b;
		double c;
		double d;
		double[] s = new double[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (j = 1;j <= k;j++)
		{
			s[j] = 0;
			b = 0;
			d = 0;
			a = 0;
			c = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			for (i = 1;i <= n;i++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					x[i] = Double.parseDouble(tempVar3);
				}
		b += x[i];
			}
			a = b / n;
		for (i = 1;i <= n;i++)
		{
			c += (x[i] - a) * (x[i] - a);
		}
		d = c / n;
		s[j] = s[j] + Math.sqrt(d);
		}
		for (j = 1;j <= k;j++)
		{
		System.out.printf("%.5lf\n",s[j]);
		}
		return 0;
	}
}

