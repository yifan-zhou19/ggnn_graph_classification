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
		int[] geshu = new int[128];
		int[] fenzi = new int[512];
		int[] fenmu = new int[512];
		double[] a = new double[512];
		fenzi[0] = 2,fenmu[0] = 1;
		a[0] = (double)fenzi[0] / fenmu[0];
		fenzi[1] = 3,fenmu[1] = 2;
		a[1] = (double)fenzi[1] / fenmu[1];
		double sum = a[0];
		double sum1 = a[0] + a[1];
		int i;
		int j;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				geshu[i] = Integer.parseInt(tempVar2);
			}
				if (geshu[i] == 1)
				{
					System.out.printf("%.3lf\n",sum);
					continue;
				}
				else if (geshu[i] == 2)
				{
					sum += a[1];
					System.out.printf("%.3lf\n",sum);
					continue;
				}
			for (j = 2;j < geshu[i];j++)
			{

					a[j] = (double)(fenzi[j - 2] + fenzi[j - 1]) / (fenmu[j - 2] + fenmu[j - 1]);
					fenzi[j] = fenzi[j - 2] + fenzi[j - 1];
					fenmu[j] = fenmu[j - 2] + fenmu[j - 1];
					sum1 += a[j];

			}
			if (j >= geshu[i])
			{
				System.out.printf("%.3lf\n",sum1);
				sum1 = a[0] + a[1];
			}
		}
		return 0;
	}

}

