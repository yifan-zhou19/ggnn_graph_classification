package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int m = 0;
		double[] distance = new double[1000]; //??????????double??
		double[] x = new double[100];
		double[] y = new double[100];
		double t;
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
				x[i] = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				y[i] = Double.parseDouble(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = i;j < n;j++)
			{
				distance[m] = Math.sqrt((x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]));
				m++;
			}
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < m - i - 1;j++) //j++????i++,?????
			{
				if (distance[j] < distance[j + 1])
				{
					t = distance[j];
					distance[j] = distance[j + 1];
					distance[j + 1] = t;
				}
			}
		}
		System.out.printf("%.4f\n",distance[0]);
	}

}

