package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int x;
		int y;
		int z;
		double sum = 0;
		double sum1 = 0;
		double[] a = new double[1000];
		double b;
		double c;
		double d;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		int j;
		for (i = 0;i < n;i++)
		{
			sum = 0;
			sum1 = 0;
			int m;
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		for (j = 0;j < m;j++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[j] = Double.parseDouble(tempVar3);
			}
			sum += a[j];
		}
	b = sum / m;
		for (j = 0;j < m;j++)
		{
			c = Math.pow(a[j] - b,2);

			sum1 += c;
		}
		d = Math.pow(sum1 / m,0.5);
		System.out.printf("%.5lf\n",d);
		}
	return 0;
	}
}

