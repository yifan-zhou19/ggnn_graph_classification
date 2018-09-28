package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int n;
		int m;
		double[] a = new double[100];
		double sum;
		double ave;
		double Sum;
		double b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (j = 0;j < n;j++)
		{
			sum = 0.00000;
			Sum = 0.00000;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			for (i = 0;i < m;i++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i] = Double.parseDouble(tempVar3);
				}
				sum += a[i];
			}
			for (i = 0;i < m;i++)
			{
				Sum += (a[i] - sum / m) * (a[i] - sum / m);
			}
			b = Math.sqrt(Sum / m);
			System.out.printf("%.5lf\n",b);
		}
		return 0;
	}

}

