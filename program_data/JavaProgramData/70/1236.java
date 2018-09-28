package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int num;
		double[] x = new double[100];
		double[] y = new double[100];
		num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1;i <= num;i++)
		{
			x[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			y[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		}
		double[][] dis = new double[100][100];
		double temp_dis = 0;
		for (int i = 1;i < num;i++)
		{
			for (int j = i + 1;j <= num;j++)
			{
				dis[i][j] = Math.sqrt((x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]));
				if (temp_dis < dis[i][j])
				{
					temp_dis = dis[i][j];
				}
			}
		}
		System.out.printf("%.4f", temp_dis);
		System.out.printf("%.4f", "\n");

		return 0;
	}
}

