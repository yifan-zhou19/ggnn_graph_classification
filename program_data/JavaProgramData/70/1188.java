package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		double[] x = new double[100];
		double[] y = new double[100];
		double[] d = new double[500];
		for (int i = 0;i < n;i++)
		{
			x[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			y[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		}
		for (int i = 0;i < n - 1;i++)
		{
			for (int j = i + 1;j < n;j++)
			{
				d[k++] = Math.sqrt((x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]));
			}
		}
		for (int i = 0;i < k;i++)
		{
			for (int j = 0;j < k - i;j++)
			{
				if (d[j] < d[j + 1])
				{
					swap(d[j],d[j + 1]);
				}
			}
		}
		System.out.printf("%.4f", d[0]);
		System.out.printf("%.4f", "\n");
		return 0;
	}
}

