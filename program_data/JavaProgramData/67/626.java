package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		double[][] a = new double[100][2];
		double[] b = new double[100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i][0] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			a[i][1],b[i] = a[i][1] / a[i][0] = ConsoleInput.readToWhiteSpace(true);
		}
		for (i = 1;i < n;i++)
		{
				if ((b[i] - b[0]) > 0.05)
				{
				System.out.print("better");
				System.out.print("\n");
				}
			else if ((b[i] - b[0]) < -0.05)
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

