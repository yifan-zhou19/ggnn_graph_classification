package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int sum = 0;
		int i;
		int j;
		double[][] points = new double[2][100];
		double[] dis = new double[200];
		double max = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			points[0][i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			points[1][i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n - 1;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				dis[sum++] = Math.sqrt(Math.pow(points[0][i] - points[0][j],2.0) + Math.pow(points[1][i] - points[1][j],2.0));
			}
		}
		for (i = 0;i < sum;i++)
		{
			if (dis[i] > max)
			{
				max = dis[i];
			}
		}
		System.out.printf("%.4f\n",max);
		return 0;
	}
}

