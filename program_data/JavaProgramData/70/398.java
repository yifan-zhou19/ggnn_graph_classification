package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		double[] a = new double[30];
		double[] b = new double[30];
		double dis;
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
		dis = Math.sqrt((a[2] - a[1]) * (a[2] - a[1]) + (b[2] - b[1]) * (b[2] - b[1]));
		for (i = 1;i <= n - 1;i++)
		{
			for (j = i + 1;j <= n;j++)
			{
				if (Math.sqrt((a[j] - a[i]) * (a[j] - a[i]) + (b[j] - b[i]) * (b[j] - b[i])) > dis)
				{
					dis = Math.sqrt((a[j] - a[i]) * (a[j] - a[i]) + (b[j] - b[i]) * (b[j] - b[i]));
				}
			}
		}
		System.out.printf("%.4lf",dis);
	}
}

