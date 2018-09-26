package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		int t;
		int k;
		double[] a = new double[100];
		double[] b = new double[100];
		double max = 0;
		double c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (k = 0;k < n;k++)
		{
			double x;
			double y;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				y = Double.parseDouble(tempVar3);
			}
			a[k] = x,b[k] = y;
		}
		for (i = 0;i < n;i++)
		{
			for (t = 0;t < n;t++)
			{
				c = Math.sqrt((a[t] - a[i]) * (a[t] - a[i]) + (b[t] - b[i]) * (b[t] - b[i]));
				if (c > max)
				{
					max = c;
				}
			}
		}


			System.out.printf("%.4lf\n",max);
	}

}

