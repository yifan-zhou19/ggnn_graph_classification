package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double n;
		double[] x = new double[100];
		double[] y = new double[100];
		double[][] distance = new double[100][100];
		double max = 0;
		int i;
		int j;
		n = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			x[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			y[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
			distance[i][j] = Math.sqrt(Math.pow(x[i] - x[j],2) + Math.pow(y[i] - y[j],2));
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				if (distance[i][j] > max)
				{
			max = distance[i][j];
				}
			}
		}
		System.out.print(max);
		System.out.print("\n");
		return 0;

	}
}

