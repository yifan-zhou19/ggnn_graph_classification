package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		double[][] a = new double[100][3];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i][0] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			a[i][1] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			a[i][2] = a[i][1] / a[i][0];
			if (i != 0)
			{
				if (a[i][2] - a[0][2] > 0.05)
				{
					System.out.print("better");
					System.out.print("\n");
				}
				else
				{
					if (a[0][2] - a[i][2] > 0.05)
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
		}
		return 0;
	}
}

