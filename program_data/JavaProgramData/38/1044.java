package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int n;
		int i;
		int j;
		double[] x = new double[1000];
		double s;
		double v;
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
			v = 0;
			s = 0;
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
				v = v + x[j];
			}
			v = v / n;
			for (j = 0;j < n;j++)
			{
				s = s + (x[j] - v) * (x[j] - v);
			}
			s = Math.sqrt((double)s / n);
			System.out.printf("%.5lf\n",s);
		}
		return 0;
	}
}

