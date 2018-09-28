public class point
{
	public double x;
	public double y;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		point[] p = tangible.Arrays.initializeWithDefaultpointInstances(100);
		int n;
		int i;
		int j;
		double d;
		double max;
		max = 0;
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
				p[i].x = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				p[i].y = Double.parseDouble(tempVar3);
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				d = Math.sqrt((p[i].x - p[j].x) * (p[i].x - p[j].x) + (p[i].y - p[j].y) * (p[i].y - p[j].y));
				if (d > max)
				{
					max = d;
				}
			}
		}
		System.out.printf("%.4lf",max);
		return 0;
	}

}

