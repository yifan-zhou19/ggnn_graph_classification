package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		double[] a = new double[100];
		double[] b = new double[100];
		double dis;
		double fang = 0;
		double t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Double.parseDouble(tempVar3);
			}
		}
		for (k = 1;k < n;k++)
		{
			for (i = k + 1;i <= n;i++)
			{
				t = (a[i] - a[k]) * (a[i] - a[k]) + (b[i] - b[k]) * (b[i] - b[k]);
				if (fang < t)
				{
					fang = t;
				}
			}
		}
		dis = Math.sqrt(fang);
		System.out.printf("%.4lf",dis);
		return 0;
	}
}

