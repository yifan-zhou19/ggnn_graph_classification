package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		double[][] a = new double[100][2];
		double t;
		double[] b = new double[100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		t = 5.0 / 100.0;
		for (i = 0;i <= n - 1;i++)
		{
			for (j = 0;j <= 1;j++)
			{
				a[i][j] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			}
			b[i] = a[i][1] / a[i][0];
		}
		for (i = 1;i <= n - 1;i++)
		{
			if ((b[i] - b[0]) > t)
			{
				System.out.print("better");
				System.out.print('\n');
			}
			else if (b[0] - b[i] > t)
			{
				System.out.print("worse");
				System.out.print('\n');
			}
			else
			{
				System.out.print("same");
				System.out.print('\n');
			}
		}
		return 0;
	}

}

