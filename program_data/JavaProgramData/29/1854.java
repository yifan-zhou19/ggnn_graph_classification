package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int i;
		int j;
		int[] a = new int[100];
		double[] b = new double[100];
		double sum;
		double s;
		m = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		i = 0;
		for (i = 0;i < m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			b[1] = 1;
			b[2] = 2;
			sum = 0;
			for (j = 1;j <= a[i];j++)
			{
				s = b[j + 1] / b[j];
				sum = sum + s;
				b[j + 2] = b[j] + b[j + 1];
			}
		System.out.printf("%.3lf\n",sum);
		}
		return 0;
	}

}

