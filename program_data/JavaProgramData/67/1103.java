package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		double[][] x = new double[100][2];
		double[] e = new double[100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < 2;j++)
			{
				x[i][j] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			}
			e[i] = x[i][1] / x[i][0];
		}
		for (i = 1;i < n;i++)
		{
			if ((e[i] - e[0]) > 0.05)
			{
				System.out.print("better");
				System.out.print("\n");
			}
			if ((e[0] - e[i]) > 0.05)
			{
				System.out.print("worse");
				System.out.print("\n");
			}
			if ((e[i] - e[0]) < 0.05 && (e[0] - e[i]) < 0.05)
			{
				System.out.print("same");
				System.out.print("\n");
			}
		}
		return 0;
	}

}

