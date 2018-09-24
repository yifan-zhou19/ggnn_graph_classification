package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int i;
		int j;
		double e;
		double x;
		double y;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		int[] sz = new int[m];
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
			double sum = 0;
			x = 1.0;
			y = 2.0;
			for (j = 0;j < sz[i];j++)
			{
				sum += y / x;
				e = y;
				y = x + y;
				x = e;
			}
			System.out.printf("%.3lf\n",sum);
		}

//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(sz);


		return 0;
	}
}

