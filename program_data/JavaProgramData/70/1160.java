package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int total;
		total = n * (n - 1) / 2;
		int i;
		double[] a = new double[100];
		double[] b = new double[100];
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
		double[] distance = new double[2000];
		int k = 1;
		int j;
		for (i = 1;i <= n - 1;i++)
		{
						   for (j = i + 1;j <= n;j++)
						   {
											  distance[k] = Math.sqrt((a[i] - a[j]) * (a[i] - a[j]) + (b[i] - b[j]) * (b[i] - b[j]));
											  k++;
						   }
		}
		double max = distance[1];
		for (i = 1;i <= k;i++)
		{
						if (max < distance[i])
						{
										   max = distance[i];
						}
		}
		System.out.printf("%.4lf", max);
		return 0;
	}

}

