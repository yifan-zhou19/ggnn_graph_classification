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
		int j;
		double[] sz = new double[999];
		double[] r = new double[999];
		for (i = 1;i <= m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[i] = Double.parseDouble(tempVar2);
			}
		}
		int a1;
		int a2;
		int b1;
		int b2;
		int e1;
		int e2;
		for (i = 1;i <= m;i++)
		{
			a1 = 1;
			a2 = 2;
			b1 = 1;
			b2 = 1;
			for (j = 1;j <= sz[i];j++)
			{
				r[i] = r[i] + 1.0 * a2 / b2;
				e1 = a2;
				e2 = a1 + a2;
				a1 = e1;
				a2 = e2;
				e1 = b2;
				e2 = b1 + b2;
				b1 = e1;
				b2 = e2;
			}
			System.out.printf("%.3lf\n",r[i]);
		}
		return 0;
	}

}

