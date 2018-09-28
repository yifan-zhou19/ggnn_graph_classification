package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int i;
		int j;
		int n;
		double[] t = new double[1000];
		double h;
		double s;
		double p;
		double m;
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
			h = s = 0;
			for (j = 0;j < n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					t[j] = Double.parseDouble(tempVar3);
				}
				s = s + t[j];
			}
			   p = (double)s / n;
			for (j = 0;j < n;j++)
			{
				h = h + (t[j] - p) * (t[j] - p);
			}
			m = (double)Math.sqrt(h / n);
			System.out.printf("%.5lf\n", m);
		}
		return 0;
	}

}

