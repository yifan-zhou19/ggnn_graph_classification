public class Point
{
	public double x;
	public double y;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		double distant;
		double max = 0;

		Point[] point = tangible.Arrays.initializeWithDefaultPointInstances(100);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < n;i++)
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
			for (int j = 0;j < i;j++)
			{
				distant = Math.sqrt((point[i].x - point[j].x) * (point[i].x - point[j].x) + (point[i].y - point[j].y) * (point[i].y - point[j].y));
				if (distant > max)
				{
					max = distant;
				}
			}
		}

		System.out.printf("%.4lf",max);
		return 0;
	}

}

