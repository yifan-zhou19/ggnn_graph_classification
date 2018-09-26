public class point
{
	public double x;
	public double y;
}

package <missing>;

public class GlobalMembers
{
	public static double len(point m, point n)
	{
		double l;
		l = Math.sqrt((m.x - n.x) * (m.x - n.x) + (m.y - n.y) * (m.y - n.y));
		return (l);
	}
	public static void Main()
	{
		point[] p = tangible.Arrays.initializeWithDefaultpointInstances(100);
		int n;
		int i;
		int j;
		double max = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			p[0].x = Double.parseDouble(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			p[0].y = Double.parseDouble(tempVar3);
		}
		for (i = 1;i <= n - 1;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				p[i].x = Double.parseDouble(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				p[i].y = Double.parseDouble(tempVar5);
			}
			for (j = 0;j <= i - 1;j++)
			{
				if (max < len(p[i], p[j]))
				{
					max = len(p[i], p[j]);
				}
			}
		}
		System.out.printf("%.4lf",max);
	}
}

