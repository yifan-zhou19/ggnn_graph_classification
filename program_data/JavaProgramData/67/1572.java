package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		double[][] groups = new double[1000][3];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 0;k < n;k++)
		{
			groups[k][0] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			groups[k][1] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		}
		for (k = 0;k < n;k++)
		{
			groups[k][2] = groups[k][1] / groups[k][0];
		}
		for (k = 1;k < n;k++)
		{
			if ((groups[k][2] - groups[0][2]) > 0.05)
			{
				System.out.print("better");
				System.out.print("\n");
			}
			else if ((groups[0][2] - groups[k][2]) > 0.05)
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

