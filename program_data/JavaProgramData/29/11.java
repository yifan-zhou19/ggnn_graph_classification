package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		int[] n = new int[500];
		double sum;
		int i;
		int j;
		int[] fm = new int[500];
		int[] fz = new int[500];
		fm[0] = 1;
		fm[1] = 2;
		fz[0] = 2;
		fz[1] = 3;
		for (i = 2;i < 500;i++)
		{
			fm[i] = fm[i - 1] + fm[i - 2];
			fz[i] = fz[i - 1] + fz[i - 2];
		}
		for (i = 0;i < m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(n[i]) = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < m;i++)
		{
			sum = 0;
			for (j = 0;j < n[i];j++)
			{
				sum = sum + 1.0 * fz[j] / fm[j];
			}
			System.out.printf("%.3lf\n",sum);
		}
	}


}

