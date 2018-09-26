package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int i;
		int j;
		int n;
		double[] x;
		double[] y;
		double max = 0;
		double l;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		x = new double[n];
		y = new double[n];
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			x[0] = Double.parseDouble(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			y[0] = Double.parseDouble(tempVar3);
		}
		for (i = 1;i < n;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				x[i] = Double.parseDouble(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				y[i] = Double.parseDouble(tempVar5);
			}
		}
		for (i = 1;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{

				l = Math.sqrt((x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]));
				if (l > max)
				{
					max = l;
				}
			}
		}
		System.out.printf("%.4lf",max);
	}





}

