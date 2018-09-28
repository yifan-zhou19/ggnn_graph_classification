package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i = 0;
		int j = 0;
		int k = 0;
		double[] x = new double[10000];
		double[] y = new double[10000];
		double[] dis = new double[10000];
		double max = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			x[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			y[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				dis[k++] = Math.sqrt((x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]));
			}
		}
		for (i = 0;i < k;i++)
		{
			if (max < dis[i])
			{
				max = dis[i];
			}
		}
		System.out.printf("%.4f", max);
		System.out.printf("%.4f", "\n");
		return 0;
	}


}

