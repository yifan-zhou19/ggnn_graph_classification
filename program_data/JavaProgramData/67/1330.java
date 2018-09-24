package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
			double[][] a = new double[100][2];
			double[] perc = new double[100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < 2;j++)
			{
			a[i][j] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			}
			perc[i] = a[i][1] / a[i][0];
		//	cout<<perc[i];
		}

		for (i = 1;i < n;i++)
		{
			if ((perc[i] - perc[0]) > 0.05)
			{
				System.out.print("better");
				System.out.print("\n");
			}
			else if ((perc[0] - perc[i]) > 0.05)
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

