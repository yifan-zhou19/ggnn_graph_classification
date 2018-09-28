package <missing>;

public class GlobalMembers
{
	//****************************
	//?????????
	//???2013.12.21
	//****************************
	public static int Main()
	{
		int n = 0;
		int i = 0;
		int j = 0;
		int k = 0;
		double[] x = new double[100];
		double[] y = new double[100];
		double[] dis = new double[400];
		double max = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			x[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			y[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n - 1;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				dis[k++] = Math.sqrt((x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]));
			}
		}
		max = dis[0];
		for (i = 0;i < k;i++)
		{
			if (dis[i] > max)
			{
				max = dis[i];
			}
			else
			{
				continue;
			}
		}
		System.out.printf("%.4f\n",max);
		return 0;
	}
}

