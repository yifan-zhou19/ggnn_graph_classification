package <missing>;

public class GlobalMembers
{
	public static int Main(String[] args)
	{
		double x;
		int n;
		int s;
		int[] f = {1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		for (s = 2;s < 100;s++)
		{
		f[s] = f[s - 1] + f[s - 2];
		}
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (;n > 0;n--)
		{
			x = 0;
			s = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (;s > 0;s--)
			{
				x = x + (double)f[s] / (double)f[s - 1];
			}
			System.out.printf("%.3f", x);
			System.out.printf("%.3f", "\n");
		}
		return EXIT_SUCCESS;
	}

}

