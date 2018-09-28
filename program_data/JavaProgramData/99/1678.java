package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] bingren = new int[100];
		double[] nianling = new double[4];

		int i;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				bingren[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < 4;i++)
		{
			nianling[i] = 0.0;
		}
		for (i = 0;i < n;i++)
		{
			if (bingren[i] <= 18)
			{
				nianling[0]++;
			}
			if (bingren[i] > 18 && bingren[i] <= 35)
			{
				nianling[1]++;
			}
			if (bingren[i] > 35 && bingren[i] <= 60)
			{
				nianling[2]++;
			}
			if (bingren[i] >= 61)
			{
				nianling[3]++;
			}
		}
		for (i = 0;i < 4;i++)
		{
			nianling[i] = nianling[i] * 100 / n;
		}
		System.out.printf("1-18: %.2lf%%\n",nianling[0]);
		System.out.printf("19-35: %.2lf%%\n",nianling[1]);
		System.out.printf("36-60: %.2lf%%\n",nianling[2]);
		System.out.printf("60??: %.2lf%%\n",nianling[3]);
		return 0;
	}

}

