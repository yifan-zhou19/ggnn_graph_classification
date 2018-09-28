package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		for (i = 1; i <= m; i++)
		{
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			double[][] a = new double[1000][2];
			int j;
			a[0][1] = 1;
			a[1][1] = 2;
			for (j = 2; j < n; j++)
			{
				a[j][1] = a[j - 1][1] + a[j - 2][1];
			}
			a[0][0] = 2;
			for (j = 1; j < n; j++)
			{
				a[j][0] = a[j - 1][0] + a[j - 1][1];
			}
			double sum = 0;
			double mul = 1;
			for (j = 0; j < n; j++)
			{
				mul = mul * a[j][1];
			}
			for (j = 0; j < n; j++)
			{
					a[j][0] = a[j][0] * (mul / a[j][1]);
					sum = sum + a[j][0];
			}
			System.out.printf("%.3f", sum / mul);
			System.out.printf("%.3f", "\n");
		}
		return 0;
	}



}

