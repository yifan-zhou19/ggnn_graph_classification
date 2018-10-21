package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] x = new int[21];
		int i;
		int n;
		int[] y = new int[100];
		x[1] = 1;
		x[2] = 1;
		for (i = 3; i < 21; i++)
		{
			x[i] = x[i - 1] + x[i - 2];
		}
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			y[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0; i < n; i++)
		{
			System.out.print(x[y[i]]);
			System.out.print("\n");
		}
		return 0;
	}
}

