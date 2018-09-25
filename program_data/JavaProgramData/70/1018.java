public class point
{
	public double x;
	public double y;
}

package <missing>;

public class GlobalMembers
{
	public static double dis(double x1, double y1, double x2, double y2)
	{
		return Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
	}

	public static int Main()
	{
		int n;
		int i;
		int j;
		double ans;
		double t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		point[] data;
		data = tangible.Arrays.initializeWithDefaultpointInstances((n + 10));
		for (i = 0; i < n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				data[i].x = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				data[i].y = Double.parseDouble(tempVar3);
			}
		}
		ans = 0;
		for (i = 0; i < n - 1; i++)
		{
			for (j = i + 1; j < n; j++)
			{
				t = dis(data[i].x, data[i].y, data[j].x, data[j].y);
				if (t > ans)
				{
					ans = t;
				}
			}
		}
		System.out.printf("%.4lf\n", ans);
		data = null;
		return 0;
	}

}

