package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int v;
		int i;
		int j;
		double max = 0;
		double[] x = new double[100];
		double[] y = new double[100];
		double[] distance = new double[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (v = 0;v < n;v++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x[v] = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				y[v] = Double.parseDouble(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				distance[j] = Math.sqrt((x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]));
				if (distance[j] >= max)
				{
					max = distance[j];
				}
			}
		}
		System.out.printf("%.4f",max);
	}

}

