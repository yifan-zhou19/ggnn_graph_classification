package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int i;
		int j;
		int max;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		int[] sz_1 = new int[m];
		for (i = 0;i < m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(sz_1[i]) = Integer.parseInt(tempVar2);
			}
		}
		max = 0;
		for (i = 0;i < m;i++)
		{
			if (sz_1[i] > max)
			{
				max = sz_1[i];
			}
		}
		int[] sz_2 = new int[(max + 1)];
		sz_2[0] = 1;
		sz_2[1] = 2;
		for (i = 2;i <= max;i++)
		{
			sz_2[i] = sz_2[i - 1] + sz_2[i - 2];
		}
		double[] sz_3 = new double[m];
		for (i = 0;i < m;i++)
		{
			sz_3[i] = 0;
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < sz_1[i];j++)
			{
				sz_3[i] += 1.0 * sz_2[j + 1] / sz_2[j];
			}
		}
		for (i = 0;i < m;i++)
		{
			System.out.printf("%.3lf\n",sz_3[i]);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(sz_1);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(sz_2);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(sz_3);
		return 0;
	}
}

