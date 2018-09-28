public class point
{
		public double x;
		public double y;
}

package <missing>;

public class GlobalMembers
{
		public static point[] point = tangible.Arrays.initializeWithDefaultpointInstances(1000);
	public static int Main()
	{
		int n;
		int i;
		int j;
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
				point[i].x = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				point[i].y = Double.parseDouble(tempVar3);
			}
		}
		double s;
		double max;
		max = 0;
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				s = Math.sqrt(Math.pow(point[i].x - point[j].x,2) + Math.pow(point[i].y - point[j].y,2));
				if (s > max)
				{
					max = s;
				}
			}
		}
		System.out.printf("%.4lf",max);
		return 0;
	}

}

