package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int n;
		double[] x;
		double[] y;
		double max;
		double dis;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		x = new double[n];
		y = new double[n];
		if (x == null || y == null)
		{
			System.exit(-1);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x[i] = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				y[i] = Double.parseDouble(tempVar3);
			}
		}
			max = Math.sqrt((x[0] - x[1]) * (x[0] - x[1]) + (y[0] - y[1]) * (y[0] - y[1]));
		for (i = 0;i < n - 1;i++)
		{
		for (j = i + 1;j < n;j++)
		{
		   dis = Math.sqrt((x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]));
		   if (dis > max)
		   {
			   max = dis;
		   }
		}
		}
		System.out.printf("%.4lf\n",max);
	}

}

