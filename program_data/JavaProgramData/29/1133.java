package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int m;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		double[] sum = new double[m];
		for (i = 0;i < m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			if (n == 1)
			{
				sum[i] = 2.0;
			}
			else if (n == 2)
			{
				sum[i] = 3.5;
			}
			else
			{
				double[] fenmu = new double[n];
				double[] fenzi = new double[n];
				fenmu[0] = 1;
				fenmu[1] = 2;
				fenzi[0] = 2;
				fenzi[1] = 3;
				sum[i] = 3.5;
					for (j = 2;j < n;j++)
					{
					fenmu[j] = fenmu[j - 1] + fenmu[j - 2];
					fenzi[j] = fenzi[j - 1] + fenzi[j - 2];
					sum[i] = sum[i] + (fenzi[j] / fenmu[j]);
					}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
				free(fenzi);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
				free(fenmu);

			}
		}
		for (i = 0;i < m;i++)
		{
			System.out.printf("%.3lf\n",sum[i]);
		}

	return 0;
	}
}

