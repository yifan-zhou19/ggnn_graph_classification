package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		int t;
		double[][] a = new double[100][2];
		double x = 0.0;
		double s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i][0] = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i][1] = Double.parseDouble(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			for (t = i + 1;t < n;t++)
			{
				s = (a[t][1] - a[i][1]) * (a[t][1] - a[i][1]) + (a[t][0] - a[i][0]) * (a[t][0] - a[i][0]);
				if (s > x)
				{
					x = s;
				}
			}
		}
		System.out.printf("%.4lf\n",(double)Math.sqrt(x));
	}
}

