public class spot
{
	public double x;
	public double y;
}

package <missing>;

public class GlobalMembers
{
	public static spot[] pts = tangible.Arrays.initializeWithDefaultspotInstances(100);
	public static void Main()
	{
		int n;
		int i;
		int j;
		double a;
		double b;
		double s;
		double max = 0.0;
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
				pts[i].x = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				pts[i].y = Double.parseDouble(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				a = pts[j].x - pts[i].x;
				b = pts[j].y - pts[i].y;
				s = Math.sqrt(a * a + b * b);
				if (s > max)
				{
					max = s;
				}
			}
		}
		System.out.printf("%.4lf\n",max);
	}
}

