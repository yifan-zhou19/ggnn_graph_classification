public class point
{
	public int x;
	public int y;
	public int z;
}

public class distanceBetweenPoints
{
	public int pointIndex1;
	public int pointIndex2;
	public double distace;
}

package <missing>;

public class GlobalMembers
{
	public static double distance(point p1, point p2)
	{
		double d = 0.0;
		d = Math.sqrt((p1.x - p2.x) * (p1.x - p2.x) + (p1.y - p2.y) * (p1.y - p2.y) + (p1.z - p2.z) * (p1.z - p2.z));
		return d;
	}

	public static void Main(String[] args)
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		point[] points = tangible.Arrays.initializeWithDefaultpointInstances(n);
		for (int j = 0; j < n; j++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				points[j].x = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				points[j].y = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				points[j].z = Integer.parseInt(tempVar4);
			}
		}

		distanceBetweenPoints[] distances = tangible.Arrays.initializeWithDefaultdistanceBetweenPointsInstances(n * (n - 1) / 2);
		int index = 0;
		for (int index1 = 0; index1 < n; index1++)
		{
			for (int index2 = index1 + 1; index2 < n; index2++)
			{
				double d = distance(points[index1], points[index2]);
				distances[index].distace = d;
				distances[index].pointIndex1 = index1;
				distances[index].pointIndex2 = index2;
				index++;
			}
		}

		for (int i = 0; i < index; i++)
		{
			for (int j = 1; j < index - i; j++)
			{
				if (distances[j - 1].distace < distances[j].distace)
				{
					distanceBetweenPoints temp = new distanceBetweenPoints();
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: temp = distances[j-1];
					temp.copyFrom(distances[j - 1]);
					distances[j - 1] = distances[j];
					distances[j] = temp;
				}
			}
		}

		for (int i = 0; i < index; i++)
		{
			System.out.printf("(%d,%d,%d)",points[distances[i].pointIndex1].x, points[distances[i].pointIndex1].y, points[distances[i].pointIndex1].z);
			System.out.print("-");
			System.out.printf("(%d,%d,%d)",points[distances[i].pointIndex2].x, points[distances[i].pointIndex2].y, points[distances[i].pointIndex2].z);
			System.out.print("=");
			System.out.printf("%.2lf\n", distances[i].distace);
		}

	}

}

