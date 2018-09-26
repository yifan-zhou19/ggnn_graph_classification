package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] sz = new int[100];
		int i;
		int n;
		int sum = 0;
		int[] b = new int[4];
		double[] c = new double[4];
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
				sz[i] = Integer.parseInt(tempVar2);
			}
			sum++;
			if (sz[i] >= 1 && sz[i] <= 18)
			{
				b[0]++;
			}
			else if (sz[i] >= 19 && sz[i] <= 35)
			{
				b[1]++;
			}
			else if (sz[i] >= 36 && sz[i] <= 60)
			{
				b[2]++;
			}
			else if (sz[i] >= 61)
			{
				b[3]++;
			}
		}
		for (i = 0;i < 4;i++)
		{
			c[i] = (double)b[i] / sum;
		}
		System.out.printf("%d-%d: %.2lf%%\n",1,18,c[0] * 100);
		System.out.printf("%d-%d: %.2lf%%\n",19,35,c[1] * 100);
		System.out.printf("%d-%d: %.2lf%%\n",36,60,c[2] * 100);
		System.out.printf("%d??: %.2lf%%\n",60,c[3] * 100);
		return 0;
	}






}

