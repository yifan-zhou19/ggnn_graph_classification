package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		double[] sz = new double[N];
		double[] fd = new double[N];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[i] = Double.parseDouble(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (sz[i] <= 18 && sz[i] >= 1)
			{
				fd[0]++;
			}
			else if (sz[i] <= 35 && sz[i] >= 19)
			{
				fd[1]++;
			}
			else if (sz[i] <= 60 && sz[i] >= 36)
			{
				fd[2]++;
			}
			else if (sz[i] >= 61)
			{
				fd[3]++;
			}

		}
		for (i = 0;i < 4;i++)
		{
			fd[i] = 100 * fd[i] / n;
		}
		System.out.printf("1-18: %.2lf%%\n",fd[0]);
		System.out.printf("19-35: %.2lf%%\n",fd[1]);
		System.out.printf("36-60: %.2lf%%\n",fd[2]);
		System.out.printf("60??: %.2lf%%\n",fd[3]);
		return 0;
	}
}

