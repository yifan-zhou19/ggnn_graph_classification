package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct point
	//	{
	//	float x;
	//	float y;
	//	};
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		point[] points = tangible.Arrays.initializeWithDefaultpointInstances(100);
		int i;
		int j;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				points[i].x = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				points[i].y = tempVar3;
			}
		};
		double d;
		double[] distance = new double[1000];
		int m = 0;
		for (i = n - 1;i >= 0;i--)
		{
			for (j = 0;j < n;j++)
			{
				d = Math.sqrt((points[i].x - points[j].x) * (points[i].x - points[j].x) + (points[i].y - points[j].y) * (points[i].y - points[j].y));
				distance[m] = d;
				m++;
			};
		};
		double max;
		max = distance[0];
		int k;
		for (k = 1;k < n * n;k++)
		{
			if (distance[k] > max)
			{
				max = distance[k];
			};

		};
		System.out.printf("%.4f\n", (float)max);
	}
}

