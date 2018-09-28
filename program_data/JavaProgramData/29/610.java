package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int i;
		int j;
		int[] sz = new int[1000];
		int[] fenzi = new int[1000];
		int[] fenmu = new int[1000];
		double[] xulie = new double[1000];
		double[] sum = new double[1000];
		fenzi[0] = 2;
		fenmu[0] = 1;
		for (i = 1;i < 1000;i++)
		{
			fenmu[i] = fenzi[i - 1];
			fenzi[i] = fenzi[i - 1] + fenmu[i - 1];
		}
		for (i = 0;i < 1000;i++)
		{
			xulie[i] = (double)fenzi[i] / fenmu[i];
		}
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
				sz[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < sz[i];j++)
			{
				sum[i] += xulie[j];
			}
		}
		for (i = 0;i < m;i++)
		{
			System.out.printf("%.3lf\n",sum[i]);
		}
		return 0;
	}

}

