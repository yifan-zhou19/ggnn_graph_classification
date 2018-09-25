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
		int[] y = new int[N];
		int i;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				y[i] = Integer.parseInt(tempVar2);
			}
		}
		int a;
		int[] s = new int[4];
		int j;
		for (j = 0;j < n;j++)
		{
			if (y[j] <= 18)
			{
				 s[0]++;
			}
			else if ((y[j] >= 19) && (y[j] <= 35))
			{
				 s[1]++;
			}
			else if ((y[j] >= 36) && (y[j] <= 60))
			{
				 s[2]++;
			}
			else if (y[j] >= 60)
			{
				 s[3]++;
			}
		}
		 double[] bfb = new double[4];
		 int t;
		 for (t = 0;t < 4;t++)
		 {
			  bfb[t] = 100.0 * s[t] / n;
		 }
		 System.out.printf("1-18: %.2lf%%\n",bfb[0]);
		 System.out.printf("19-35: %.2lf%%\n",bfb[1]);
		 System.out.printf("36-60: %.2lf%%\n",bfb[2]);
		 System.out.printf("Over60: %.2lf%%\n",bfb[3]);
		 return 0;
	}
}

