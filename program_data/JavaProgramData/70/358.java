package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		double[] a = new double[30];
		double[] b = new double[30];
		double dis = 0;
		double m = 0;
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
				a[i] = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b[i] = Double.parseDouble(tempVar3);
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			for (j = i;j < n - 2;j++)
			{
				m = (a[i] - a[j + 1]) * (a[i] - a[j + 1]) + (b[i] - b[j + 1]) * (b[i] - b[j + 1]);
				if (m > dis)
				{
					dis = m;
				}
			}
		}
		dis = Math.sqrt(dis);
		System.out.printf("%.4lf",dis);
		return 0;
	}
}

