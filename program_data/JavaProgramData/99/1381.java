package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] a = new int[100];
		double[] b = new double[100];
		int x;
		int y;
		int z;
		int t;
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
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		x = 0;
		y = 0;
		z = 0;
		t = 0;
		for (i = 0;i < n;i++)
		{
			if (a[i] <= 18)
			{
			  x++;
			}
			if (a[i] >= 36 && a[i] <= 60)
			{
			z++;
			}
			if (a[i] >= 61)
			{
			t++;
			}
			if (a[i] >= 19 && a[i] <= 35)
			{
			y++;
			}
		}
		b[0] = (double)x / n;
		b[1] = (double)y / n;
		b[2] = (double)z / n;
		b[3] = (double)t / n;
		System.out.printf("1-18: %.2lf%%\n",b[0] * 100);
		System.out.printf("19-35: %.2lf%%\n",b[1] * 100);
		System.out.printf("36-60: %.2lf%%\n",b[2] * 100);
		System.out.printf("60??: %.2lf%%\n",b[3] * 100);
		return 0;
	}
}

