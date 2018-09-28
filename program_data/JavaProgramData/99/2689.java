package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] sz = new int[100];
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
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
			if (sz[i] >= 1 && sz[i] <= 18)
			{
				a += 1;
			}
			else if (sz[i] >= 19 && sz[i] <= 35)
			{
				b += 1;
			}
			else if (sz[i] >= 36 && sz[i] <= 60)
			{
				c += 1;
			}
			else
			{
				d += 1;
			}
		}
		System.out.printf("1-18: %.2lf%%\n",1.0 * a * 100 / n);
			 System.out.printf("19-35: %.2lf%%\n",1.0 * b * 100 / n);
			 System.out.printf("36-60: %.2lf%%\n",1.0 * c * 100 / n);
			 System.out.printf("60??: %.2lf%%\n",1.0 * d * 100 / n);
		return 0;
	}

}

