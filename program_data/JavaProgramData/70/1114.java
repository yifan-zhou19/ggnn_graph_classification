package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double distance = 0;
		double max = 0;
		double[][] point = new double[200][2];
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < n; i++)
		{ // store the position of each point
			point[i][0] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			point[i][1] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		}
		for (int i = 0; i < n - 1; i++)
		{
			for (int j = i + 1; j < n; j++)
			{ // calculate the distances
				distance = (point[i][0] - point[j][0]) * (point[i][0] - point[j][0]) + (point[i][1] - point[j][1]) * (point[i][1] - point[j][1]);
				if (distance > max)
				{
					max = distance;
				}
			}
		}
		max = Math.sqrt(max);
		System.out.printf("%.4f\n", max);
		System.in.read();
		System.in.read();
		return 0;
	}
}

