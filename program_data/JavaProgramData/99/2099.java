package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[100];
		int i;
		double w;
		double x;
		double y;
		double z;
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
		w = 0,x = 0,y = 0,z = 0;
		for (i = 0;i < n;i++)
		{
			if (a[i] <= 18)
			{
				w += 1;
			}
			else if (a[i] <= 35)
			{
				x += 1;
			}
			else if (a[i] <= 60)
			{
				y += 1;
			}
			else
			{
				z += 1;
			}
		}
		w = 100 * w / n;
		x = 100 * x / n;
		y = 100 * y / n;
		z = 100 * z / n;
		System.out.printf("1-18: %.2lf%%\n19-35: %.2lf%%\n36-60: %.2lf%%\n60??: %.2lf%%\n",w,x,y,z);
	}
}

