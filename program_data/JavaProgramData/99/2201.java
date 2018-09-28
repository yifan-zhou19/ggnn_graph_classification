package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] s = new int[4];
		int[] year = new int[100];
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
				year[i] = Integer.parseInt(tempVar2);
			}
			if (year[i] <= 18)
			{
				s[0]++;
			}
			else if (year[i] > 18 && year[i] <= 35)
			{
				s[1]++;
			}
			else if (year[i] > 35 && year[i] <= 60)
			{
				s[2]++;
			}
			else if (year[i] > 60)
			{
				s[3]++;
			}
		}
		double[] bfs = new double[4];
		bfs[0] = (double)s[0] / n;
		bfs[1] = (double)s[1] / n;
		bfs[2] = (double)s[2] / n;
		bfs[3] = (double)s[3] / n;
		System.out.printf("1-18: %.2lf%%\n",bfs[0] * 100);
		System.out.printf("19-35: %.2lf%%\n",bfs[1] * 100);
		System.out.printf("36-60: %.2lf%%\n",bfs[2] * 100);
		System.out.printf("60??: %.2lf%%\n",bfs[3] * 100);
		return 0;
	}

}

