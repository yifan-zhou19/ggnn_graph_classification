package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		double s;
		double[][] a = new double[10][2];
		double x = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < 2;j++)
			{
				a[i][j] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				s = Math.sqrt((a[i][0] - a[j][0]) * (a[i][0] - a[j][0]) + (a[i][1] - a[j][1]) * (a[i][1] - a[j][1]));
				if (s > x)
				{
					x = s;
				}
			}
		}
		System.out.printf("%.4f\n",x);
		return 0;
	}


}

