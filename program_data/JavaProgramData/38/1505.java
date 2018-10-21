package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		double a = 0;
		double b = 0;
		double m = 0;
		double p = 0;
		double[] x = new double[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i < k;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			for (j = 0;j < n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					x[j] = Double.parseDouble(tempVar3);
				}
			}
			for (j = 0;j < n;j++)
			{
				a = a + x[j];
			}
			m = 1.00000000000 * a / n;
			for (j = 0;j < n;j++)
			{
				b = b + (x[j] - m) * (x[j] - m);
			}
			p = Math.sqrt(b / n);
			a = 0;
			b = 0;
			System.out.printf("%.5lf\n",p);
		}
		return 0;
	}
}

