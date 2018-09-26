package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int x1 = 0;
		int x2 = 0;
		int x3 = 0;
		int x4 = 0;
		double y1;
		double y2;
		double y3;
		double y4;
		int[] sz = new int[100];
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
				(sz[i]) = Integer.parseInt(tempVar2);
			}
			if (sz[i] <= 18)
			{
				x1 = x1++;
			}
			else if (sz[i] >= 19 && sz[i] <= 35)
			{
				x2 = x2++;
			}
			else if (sz[i] >= 36 && sz[i] <= 60)
			{
				x3 = x3++;
			}
			else if (sz[i] >= 61)
			{
				x4 = x4++;
			}
		}
		y1 = (double)x1 * 100 / n;
		y2 = (double)x2 * 100 / n;
		y3 = (double)x3 * 100 / n;
		y4 = (double)x4 * 100 / n;
		System.out.printf("1-18: %.2lf%%\n19-35: %.2lf%%\n36-60: %.2lf%%\n60??: %.2lf%%\n",y1,y2,y3,y4);
		return 0;
	}

}

