public class dot
{
	public double x;
	public double y;
}

package <missing>;

public class GlobalMembers
{
	public static dot[] p;

	public static double distance(int i, int j)
	{
		double re;
		re = Math.sqrt((p[i].x - p[j].x) * (p[i].x - p[j].x) + (p[i].y - p[j].y) * (p[i].y - p[j].y));
		return re;
	}


	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		double max = 0;
		p = tangible.Arrays.initializeWithDefaultdotInstances(n);
		int i;
		for (i = 0 ; i < n ; i++)
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
		int j;
		for (i = 0 ; i < n ; i++)
		{
			for (j = i + 1 ; j < n ; j++)
			{
				if (distance(i, j) > max)
				{
					max = distance(i, j);
				}
			}
		}
		System.out.printf("%.4lf\n",max);
		p = null;
		return 0;
	}
}

