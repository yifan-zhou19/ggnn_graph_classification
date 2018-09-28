package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int i;
		int k;
		int[] n = new int[100];
		double[] res = new double[100];
		int[] fz = new int[1000];
		int[] fm = new int[1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 0;i < 100;i++)
		{
			res[i] = 0;
		}
		for (i = 0;i < m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 1;i < 1000;i++)
		{
			fz[0] = 2;
			fm[0] = 1;
			fz[i] = fz[i - 1] + fm[i - 1];
			fm[i] = fz[i - 1];
		}
		for (i = 0;i < m;i++)
		{
			for (k = 0;k < n[i];k++)
			{
				res[i] += 1.0 * fz[k] / fm[k];
			}
			System.out.printf("%.3lf\n",res[i]);
		}

		return 0;
	}

}

