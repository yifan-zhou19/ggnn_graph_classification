package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		int i;
		int[] cs = new int[m];
		for (i = 0;i < m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				cs[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < m;i++)
		{
			int[] sz = new int[(cs[i] + 1)];
			int a = 1;
			int b = 2;
			int j;
			sz[0] = 1;
			sz[1] = 2;
			for (j = 2;j <= cs[i];j++)
			{
				sz[j] = sz[j - 2] + sz[j - 1];
			}
			double[] sl = new double[(cs[i])];
			for (j = 0;j < cs[i];j++)
			{
				sl[j] = 1.0 * sz[j + 1] / sz[j];
			}
			double sum = 0;
			for (j = 0;j < cs[i];j++)
			{
				sum += sl[j];
			}
			System.out.printf("%.3lf\n",sum);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
			free(sz);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
			free(sl);
		}
		return 0;
	}

}

