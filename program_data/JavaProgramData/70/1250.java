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
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
			point[i].x = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			point[i].y = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		}
		double max;
		for (int i = 0;i < n - 1;i++)
		{
			for (int j = i + 1;j < n;j++)
			{
				double temp = Math.sqrt((point[i].x - point[j].x) * (point[i].x - point[j].x) + (point[i].y - point[j].y) * (point[i].y - point[j].y));
				if (temp > max)
				{
					max = temp;
				}
			}
		}
		System.out.print(max);
		return 0;

	}
}

