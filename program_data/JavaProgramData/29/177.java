package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int p;
		double[] a = new double[100];
		double[] fenzi = new double[100];
		double[] fenmu = new double[100];
		double[] sum = {0.0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		fenzi[0] = 2.0;
		fenzi[1] = 3.0;
		fenmu[0] = 1.0;
		fenmu[1] = 2.0;
		a[0] = 2.0;
		a[1] = 1.5;
		for (i = 2;i < 100;i++)
		{
			fenzi[i] = fenzi[i - 1] + fenzi[i - 2];
			fenmu[i] = fenmu[i - 1] + fenmu[i - 2];
			a[i] = fenzi[i] / fenmu[i];
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (p = 0;p < n;p++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				j = Integer.parseInt(tempVar2);
			}
			for (k = 0;k < j;k++)
			{
				sum[p] += a[k];
			}
			System.out.printf("%.3lf\n", sum[p]);
		}
		return 0;
	}
}

