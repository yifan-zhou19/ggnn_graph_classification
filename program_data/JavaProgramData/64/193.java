package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k = 0;
		int t;
		int[] x = new int[10];
		int[] y = new int[10];
		int[] z = new int[10];
		double[][] dis = new double[10][9];
		double[] dist = new double[50];
		double a;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			x[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			y[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			z[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0; i < n - 1; i++)
		{
			for (j = i + 1; j < n; j++)
			{
				dis[i][j - i - 1] = Math.sqrt((x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]) + (z[i] - z[j]) * (z[i] - z[j]));
				dist[k++] = dis[i][j - i - 1];
			}
		}
		for (k = 0; k < n * (n - 1) / 2; k++)
		{
			for (t = 0; t < n * (n - 1) / 2 - k - 1; t++)
			{
				if (dist[t] < dist[t + 1])
				{
					a = dist[t];
					dist[t] = dist[t + 1];
					dist[t + 1] = a;
				}
			}
		}
		for (k = 0; k < n * (n - 1) / 2; k++)
		{
			if (k >= 1 && dist[k] == dist[k - 1])
			{
				continue;
			}
			for (i = 0; i < n - 1; i++)
			{
				for (j = i + 1; j < n; j++)
				{
					if (dis[i][j - i - 1] == dist[k])
					{
						System.out.print('(');
						System.out.print(x[i]);
						System.out.print(',');
						System.out.print(y[i]);
						System.out.print(',');
						System.out.print(z[i]);
						System.out.print(')');
						System.out.print('-');
						System.out.print('(');
						System.out.print(x[j]);
						System.out.print(',');
						System.out.print(y[j]);
						System.out.print(',');
						System.out.print(z[j]);
						System.out.print(')');
						System.out.print('=');
						System.out.printf("%.2f", dist[k]);
						System.out.printf("%.2f", "\n");
					}
				}
			}
		}
		return 0;
	}

}

