package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		double[] a = new double[100];
		double[] b = new double[100];
		double[] c = new double[100];
		double sum;
		a[0] = 1;
		a[1] = 2;
		b[1] = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 0;i < m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			sum = 0;
			for (j = 0;j < n;j++)
			{
				a[j + 2] = a[j] + a[j + 1];
				b[j + 2] = a[j + 1];
				sum += a[j + 1] / b[j + 1];
			}
			System.out.printf("%.3lf\n",sum);
		}
		return 0;
	}


}

