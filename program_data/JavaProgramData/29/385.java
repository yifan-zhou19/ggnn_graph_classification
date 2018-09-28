package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double[] a1 = new double[1000];
		double[] a2 = new double[1000];
		double[] a3 = new double[1000];
		int n;
		int i;
		int j;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		a1[0] = 2;
		a2[0] = 1;
		a3[0] = 2;
		for (i = 1;i < 1000;i++)
		{
			a1[i] = a1[i - 1] + a2[i - 1];
			a2[i] = a1[i - 1];
			a3[i] = a1[i] / a2[i];
		}
		for (i = 0;i < m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			double sum = 0;
			for (j = 0;j < n;j++)
			{
				sum += a3[j];
			}
			System.out.printf("%.3lf\n",sum);
		}
		return 0;
	}
}

