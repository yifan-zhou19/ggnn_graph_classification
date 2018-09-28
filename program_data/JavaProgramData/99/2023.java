package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] num = new int[4];
		int[] pat = new int[101];
		double[] rate = new double[4];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				pat[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (pat[i] <= 18)
			{
				num[0]++;
			}
			if (pat[i] >= 19 && pat[i] <= 35)
			{
				num[1]++;
			}
			if (pat[i] >= 36 && pat[i] <= 60)
			{
				num[2]++;
			}
			if (pat[i] >= 61)
			{
				num[3]++;
			}
		}
		for (i = 0;i < 4;i++)
		{
			rate[i] = 100.0 * num[i] / n;
		}
		System.out.printf("1-18: %.2lf%%\n19-35: %.2lf%%\n36-60: %.2lf%%\n60??: %.2lf%%\n",rate[0],rate[1],rate[2],rate[3]);
		return 0;
	}

}

