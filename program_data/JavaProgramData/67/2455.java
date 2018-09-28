package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		double[] c = new double[n];
		double[][] a = new double[n][2];
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < 2;j++)
			{
		a[i][j] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			}
		c[i] = a[i][1] / a[i][0];
		}
		for (i = 1;i < n;i++)
		{
		if (c[i] - c[0] > 0.05)
		{
			System.out.print("better");
			System.out.print("\n");
		}
		else if (c[0] - c[i] > 0.05)
		{
			System.out.print("worse");
			System.out.print("\n");
		}
		else
		{
			System.out.print("same");
			System.out.print("\n");
		}
		}
	return 0;
	}


}

