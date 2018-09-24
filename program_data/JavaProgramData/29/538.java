package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] fenzi = new int[100];
		int[] fenmu = new int[100];
		 fenzi[0] = 2;
		 fenzi[1] = 3;
		 fenmu[0] = 1;
		 fenmu[1] = 2;
		double s = 0;
		double s1 = 2 * 1.0 / 1;
		double s2 = s1 + (3 * 1.0 / 2);
		int i;
		int m;
		int j;
		int n;
		double[] sz = new double[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 0;i < m;i++)
		{
			s = s2;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			if (n == 1)
			{
				sz[i] = s1;
			}
			else if (n == 2)
			{
				sz[i] = s2;
			}
			else
			{

				for (j = 2;j < n;j++)
				{
					fenzi[j] = fenzi[j - 1] + fenzi[j - 2];
					fenmu[j] = fenmu[j - 1] + fenmu[j - 2];
					s += fenzi[j] * 1.0 / fenmu[j];
					sz[i] = s;
				}
			}
		}
		for (i = 0;i < m - 1;i++)
		{
			System.out.printf("%.3lf\n",sz[i]);
		}
		System.out.printf("%.3lf",sz[i]);
		return 0;
	}

}

