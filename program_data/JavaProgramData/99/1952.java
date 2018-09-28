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
		int[] nianling = new int[100];
		int i;
		int[] sum = new int[4];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				nianling[i] = Integer.parseInt(tempVar2);
			}
			if (nianling[i] >= 1 && nianling[i] <= 18)
			{
				sum[0]++;
			}
			if (nianling[i] >= 19 && nianling[i] <= 35)
			{
				sum[1]++;
			}
			if (nianling[i] >= 36 && nianling[i] <= 60)
			{
				sum[2]++;
			}
			if (nianling[i] >= 61)
			{
				sum[3]++;
			}
		}
		int j;
		double[] bai = new double[4];
		for (j = 0;j < 4;j++)
		{
			bai[j] = ((double)sum[j] / (double)n) * 100;
		}
		System.out.printf("1-18: %.2lf%%\n",bai[0]);
		System.out.printf("19-35: %.2lf%%\n",bai[1]);
		System.out.printf("36-60: %.2lf%%\n",bai[2]);
		System.out.printf("60??: %.2lf%%",bai[3]);
		return 0;
	}




}

