package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		double e;
		double all;
		int i;
		double xiaoguo;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		double[] E = new double[n + 2];
		for (i = 1;i <= n;i++)
		{
			all = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			e = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			xiaoguo = e / all;
			E[i] = xiaoguo;
		}
		for (i = 2;i <= n;i++)
		{
			if ((E[i] - E[1]) > 0.05)
			{
				System.out.print("better");
				System.out.print("\n");
			}
			else if ((E[i] - E[1]) < -0.05)
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

