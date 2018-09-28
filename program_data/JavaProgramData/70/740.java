package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double[] a = new double[300];
		double[] b = new double[300];
		double d;
		double c = 0;
		int i;
		int r;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n - 1;i++)
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
		for (i = 0;i <= n - 2;i++)
		{
			for (r = i + 1;r <= n - 1;r++)
			{
				d = Math.sqrt((a[i] - a[r]) * (a[i] - a[r]) + (b[i] - b[r]) * (b[i] - b[r]));
				if (c < d)
				{
					c = d;
				}
			}
		}
		System.out.printf("%.4f\n",c);
	}
}

