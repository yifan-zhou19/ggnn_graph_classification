public class point
{
	public double x;
	public double y;
}

package <missing>;

public class GlobalMembers
{
	public static point[] point;
	public static int Main()
	{
		int n;
		int i;
		int j;
		double d;
		double dx;
		double dy;
		double maxd = 0;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		point = tangible.Arrays.initializeWithDefaultpointInstances(n);
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				point[i].x = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				point[i].y = Double.parseDouble(tempVar3);
			}
			for (j = 0;j < i;j++)
			{
				dx = point[i].x - point[j].x;
				dy = point[i].y - point[j].y;
				d = Math.sqrt(dx * dx + dy * dy);
				if (d > maxd)
				{
					maxd = d;
				}
			}
		}
		System.out.printf("%.4lf\n",maxd);
		point = null;

		return 0;
	}

}

