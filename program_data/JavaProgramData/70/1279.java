package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0;
		int k = 0;
		int max = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		double[] x = new double[200];
		double[] y = new double[200];
		double[] dis = new double[2000];
		for (int i = 0;i < n;i++)
		{
		   x[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		   y[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		}
		for (int i = 0;i < n - 1;i++)
		{
		   for (int j = i + 1;j < n;j++)
		   {
			  dis[k++] = Math.sqrt((x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]));
		   }
		}
		for (k = 0;k < n * (n - 1) / 2;k++)
		{
		   if (dis[max] < dis[k])
		   {
			   max = k;
		   }
		}
		System.out.printf("%.4lf\n",dis[max]);

		return 0;
	}


}

