package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double[][] a = new double[100][2];
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i <= n - 1;i++)
		{
			for (int j = 0;j <= 1;j++)
			{
				a[i][j] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			}
		}

		double z = 0;
		for (int k = 0;k <= n - 2;k++)
		{
		for (int l = k + 1;l <= n - 1;l++)
		{
			double s = Math.sqrt(Math.pow((a[k][0] - a[l][0]),2) + Math.pow((a[k][1] - a[l][1]),2));
				if (z < s)
				{
					z = s;
				}
		}
		}
		System.out.printf("%.4lf\n",z);
		return 0;
	}
}

