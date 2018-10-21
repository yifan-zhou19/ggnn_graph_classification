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
		int[] a = new int[p];
		int i;
		double x = 0.0;
		double y = 0.0;
		double z = 0.0;
		double t = 0.0;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			if (a[i] <= 18)
			{
				x++;
			}
			else if (a[i] > 18 && a[i] < 36)
			{
				y++;
			}
			else if (a[i] > 35 && a[i] < 61)
			{
				z++;
			}
			else if (a[i] > 60)
			{
				t++;
			}
		}
			x = 100.0 * x / n;
			y = 100.0 * y / n;
			z = 100.0 * z / n;
			t = 100.0 * t / n;

		System.out.printf("1-18: %.2lf%%\n",x);
		System.out.printf("19-35: %.2lf%%\n",y);
		System.out.printf("36-60: %.2lf%%\n",z);
		System.out.printf("60??: %.2lf%%\n",t);
		return 0;
	}

}

