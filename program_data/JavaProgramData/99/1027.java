package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int i;
		int[] sz = new int[10000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= (n - 1);i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(sz[i]) = Integer.parseInt(tempVar2);
			}
			if (sz[i] > 0 && sz[i] <= 18)
			{
				a++;
			}
			else if (sz[i] >= 19 && sz[i] <= 35)
			{
				b++;
			}
			else if (sz[i] >= 36 && sz[i] <= 60)
			{
				c++;
			}
			else if (sz[i] >= 61)
			{
				d++;
			}
		}
		System.out.printf("1-18: %.2lf%%\n",1.0 * a / n * 100);
		System.out.printf("19-35: %.2lf%%\n",1.0 * b / n * 100);
		System.out.printf("36-60: %.2lf%%\n",1.0 * c / n * 100);
		System.out.printf("60??: %.2lf%%\n",1.0 * d / n * 100);
		return 0;
	}
}

