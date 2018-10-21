public class point
{
	public double x;
	public double y;
}

package <missing>;

public class GlobalMembers
{
	public static point[] points = tangible.Arrays.initializeWithDefaultpointInstances(200);
	public static int n;

	public static double getMaxDis(int i)
	{
		int j;
		double MaxDis = 0;
		double dx;
		double dy;
		for (j = 0; j < n; j++)
		{
			dx = (points[i].x - points[j].x) * (points[i].x - points[j].x);
			dy = (points[i].y - points[j].y) * (points[i].y - points[j].y);
			if (dx + dy > MaxDis)
			{
				MaxDis = dx + dy;
			}
		}
		return MaxDis;
	}
	public static int Main()
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		for (i = 0; i < n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				points[i].x = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				points[i].y = Double.parseDouble(tempVar3);
			}
		}

		double MaxDis = 0;
		double t;
		for (i = 0; i < n; i++)
		{
			t = getMaxDis(i);
			if (t > MaxDis)
			{
				MaxDis = t;
			}
		}
		System.out.printf("%.4lf", Math.sqrt(MaxDis));
	}
}

