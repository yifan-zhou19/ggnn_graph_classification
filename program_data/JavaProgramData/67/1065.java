package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		double k;
		double s;
		double[] g = new double[200];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			k = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			s = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			g[i] = s / k;
		}
		for (i = 2;i <= n;i++)
		{
			if (g[1] - g[i] > 0.05)
			{
				System.out.print("worse");
				System.out.print("\n");
			}
			if (g[i] - g[1] > 0.05)
			{
				System.out.print("better");
				System.out.print("\n");
			}
			if (g[i] - g[1] <= 0.05 && g[i] - g[1] >= (-0.05))
			{
				System.out.print("same");
				System.out.print("\n");
			}
		}
		return 0;
	}


}

