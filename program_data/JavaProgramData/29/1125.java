package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int[] n = new int[1000];
		int m;
		int[] fz = new int[1000];
		int[] fm = new int[1000];
		double[] sum = new double[1000];
		double fs;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (j = 0;j < m;j++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n[j] = Integer.parseInt(tempVar2);
			}
		}
		for (j = 0;j < m;j++)
		{
			fz[0] = 2;
			fm[0] = 1;
			fz[1] = 3;
			fm[1] = 2;
			fs = 3.500;
			if (n[j] == 1)
			{
				sum[j] = 2.000;
			}
			else if (n[j] == 2)
			{
				sum[j] = 3.500;
			}
			else if (n[j] > 2)
			{
				for (i = 2;i < n[j];i++)
				{
					fz[i] = fz[i - 1] + fz[i - 2];
					fm[i] = fm[i - 1] + fm[i - 2];
					fs += (fz[i] * 1.000 / fm[i] * 1.000);
				}
				sum[j] = fs;
			}
		}
		for (j = 0;j < m;j++)
		{
			 System.out.printf("%.3lf\n",sum[j]);
		}
		return 0;
	}
}

