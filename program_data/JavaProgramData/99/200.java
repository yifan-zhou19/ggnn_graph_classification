package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		double x;
		double y;
		double z;
		double p;
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int i;
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
				sz[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (sz[i] <= 18)
			{
				a += 1;
			}
			else if (sz[i] > 18,sz[i] <= 35)
			{
				b += 1;
			}
			else if (sz[i] > 35,sz[i] <= 60)
			{
				c += 1;
			}
			else
			{
				d += 1;
			}
		}
		x = (double)a / n * 100;
				y = (double)b / n * 100;
				z = (double)c / n * 100;
				p = (double)d / n * 100;
		System.out.printf("1-18: %.2lf%%\n",x);
		System.out.printf("19-35: %.2lf%%\n",y);
		System.out.printf("36-60: %.2lf%%\n",z);
		System.out.printf("60??: %.2lf%%\n",p);
		return 0;
	}
}

