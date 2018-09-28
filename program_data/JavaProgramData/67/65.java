package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		double[][] sz = new double[100][2];

		int i;

		for (i = 0;i < n;i++)
		{
			sz[i][0] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			sz[i][1] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			if (i >= 1)
			{
				if (sz[i][1] / sz[i][0] - sz[0][1] / sz[0][0] > 0.05)
				{
					System.out.print("better");
					System.out.print("\n");
				}
				else if (sz[i][1] / sz[i][0] - sz[0][1] / sz[0][0] < -0.05)
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
		}







		return 0;
	}

}

