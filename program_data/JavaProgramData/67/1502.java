package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		int n = 0;

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		double[][] r = new double[100][2];

		for (int i = 0;i < n;i++)
		{
			r[i][0] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			r[i][1] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		}

		for (int i = 1;i < n;i++)
		{
			if (r[i][1] / r[i][0] - r[0][1] / r[0][0] > 0.05)
			{
				System.out.print("better");
			}
			else if (r[0][1] / r[0][0] - r[i][1] / r[i][0] > 0.05)
			{
				System.out.print("worse");

			}
			else
			{
				System.out.print("same");
			}

			if (i < n - 1)
			{
				System.out.print("\n");
			}
		}

		return 0;



	}
}

