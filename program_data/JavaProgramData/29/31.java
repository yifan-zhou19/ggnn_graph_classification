package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] sz = new int[100];
		double[] jieguo = new double[100];
		double[] fbnq = new double[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		fbnq[0] = 1;
		fbnq[1] = 2;
		for (i = 2;i < 100;i++)
		{
			fbnq[i] = fbnq[i - 2] + fbnq[i - 1];
		//printf("%lf",fbnq[i]);
		}


		for (i = 0;i < n;i++)
		{
			jieguo[i] = 0;
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[i] = Integer.parseInt(tempVar2);
			}
			for (j = 0;j < sz[i];j++)
			{
				jieguo[i] = jieguo[i] + fbnq[j + 1] / fbnq[j];
			}

		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%.3lf\n",jieguo[i]);
		}
		return 0;
	}
}

