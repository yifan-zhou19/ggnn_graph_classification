package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int t;
		int i;
		int r;
		int[] sz = new int[10000];
		double[] cz = new double[10000];
		double[] jz = new double[10000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (i = 0;i < t;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < t;i++)
		{
			double sum = 0;
			cz[1] = 2.0;
			jz[1] = 1.0;
			if (sz[i] == 1)
			{
				sum += 2.0 / 1.0;
			}
			else
			{
				sum = 2.0 / 1;
				for (r = 2;r <= sz[i];r++)
				{
					cz[r] = cz[r - 1] + jz[r - 1];
					jz[r] = cz[r - 1];
					sum = sum + cz[r] / jz[r];
				}
			}
			System.out.printf("%.3lf\n",sum);
		}
			return 0;
	}

}

