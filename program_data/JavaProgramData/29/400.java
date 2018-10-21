package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int m;
		int[] sz = new int[100];
		int i;
		int[] sl = new int[500];
		int j;
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
		sl[0] = 1;
		sl[1] = 2;
		for (i = 2;i < 500;i++)
		{
			sl[i] = sl[i - 1] + sl[i - 2];
		}
		double[] fs = new double[500];
		double[] sum = new double[500];
		for (i = 0;i < 500;i++)
		{
			fs[i] = (double)sl[i + 1] / sl[i];
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < sz[i];j++)
			{
				sum[i] = fs[j] + sum[i];
			}
			System.out.printf("%.3lf\n",sum[i]);
		}



	}

}

