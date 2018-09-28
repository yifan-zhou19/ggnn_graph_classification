package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int i;
		int j;
		int[] lim = new int[200];
		int[] fm = new int[200];
		int[] fz = new int[200];
		double res;
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
				(lim[i]) = Integer.parseInt(tempVar2);
			}
		}
				fm[0] = 1;
				fz[0] = 2;
		for (i = 0;i < m;i++)
		{
				res = 2.000;
			for (j = 1;j < lim[i];j++)
			{
				fm[j] = fz[j - 1];
				fz[j] = (fm[j - 1] + fz[j - 1]);
				res += 10 * (0.1 * fz[j] / fm[j]);

			}
				System.out.printf("%.3lf\n",res);
		}
		return 0;
	}

}

