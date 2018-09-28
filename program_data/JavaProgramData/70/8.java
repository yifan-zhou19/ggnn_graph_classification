package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		double[][] a = new double[100][2];
		double[] b = new double[100];
		double h = 0;
		double q = 0;
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
				a[i][1] = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				a[i][2] = Double.parseDouble(tempVar3);
			}
		}
		for (i = 1;i <= n - 1;i++)
		{
			for (j = i + 1;j <= n;j++)
			{
				if (Math.sqrt(Math.pow(a[j][1] - a[i][1],2) + Math.pow(a[j][2] - a[i][2],2)) > h)
				{
					h = Math.sqrt(Math.pow(a[j][1] - a[i][1],2) + Math.pow(a[j][2] - a[i][2],2));
				}
			};
			b[i] = h;
		};
		for (i = 1;i <= n;i++)
		{
			if (b[i] > q)
			{
				q = b[i];
			}
		};
		System.out.printf("%.4lf",q);
		return 0;
	}
}

