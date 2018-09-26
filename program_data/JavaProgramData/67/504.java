package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		double[] a = new double[100];
		double[] b = new double[100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < n; i++)
		{
			a[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			b[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		}
		for (int j = 1; j < n; j++)
		{
			if ((b[j] / a[j]) - (b[0] / a[0]) > 0.05)
			{
				System.out.print("better");
				System.out.print("\n");
			}
			else if ((b[j] / a[j]) - (b[0] / a[0]) < -0.05)
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

