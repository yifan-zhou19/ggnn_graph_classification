public class point
{
	public double x;
	public double y;
}

package <missing>;

public class GlobalMembers
{
	public static double dis(point a, point b)
	{
		return ((a.x - b.x) * (a.x - b.x) + (a.y - b.y) * (a.y - b.y));
	}
	public static void Main()
	{
		int i;
		int j;
		int n;
		double max;
		point[] p = tangible.Arrays.initializeWithDefaultpointInstances(100);
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
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p[i].y = Double.parseDouble(tempVar3);
			}
		}
		max = dis(p[0], p[1]);
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				if (dis(p[i], p[j]) > max)
				{
					max = dis(p[i], p[j]);
				}
			}
		}
		System.out.printf("%.4f",Math.sqrt(max));
	}
}

