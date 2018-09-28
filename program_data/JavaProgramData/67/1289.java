package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		double old;
		double[] hen = new double[2];
		double[][] test = new double[20][2];
		double[] NEW = new double[20];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		hen[0] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		hen[1] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		for (i = 0 ; i < n - 1 ; i++)
		{
			for (j = 0 ; j <= 1 ; j++)
			{
				test[i][j] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			}
		}
		old = hen[1] / hen[0];
		for (i = 0; i < n - 1 ; i++)
		{
			NEW[i] = test[i][1] / test[i][0];
		}
		for (i = 0 ; i < n - 1 ; i++)
		{
			if (old - NEW[i] > 0.05)
			{
				System.out.print("worse");
				System.out.print("\n");
			}
			else if (NEW[i] - old > 0.05)
			{
				System.out.print("better");
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

