package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int i;
		int n;
		int j;
		double[] a = new double[1001];
		double sum;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		a[1] = 1;
		a[2] = 2;
		for (i = 3;i <= 1000;i++)
		{
			a[i] = a[i - 1] + a[i - 2];
		}
		for (i = 1;i <= m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			sum = 0;
			for (j = 1;j <= n;j++)
			{
				sum = sum + a[j + 1] / a[j];
			}
			System.out.printf("%.3lf\n",sum);
		}

	}
}

