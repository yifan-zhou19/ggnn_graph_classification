package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int x;
		int[] y = new int[100];
		int[][] total = new int[100][100];
		int[][] effect = new int[100][100];
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			total[i][100] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			effect[i][100] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		x = 10000 * effect[0][100] / total[0][100];
		for (i = 0; i < n - 1; i++)
		{
			y[i] = 10000 * effect[i + 1][100] / total[i + 1][100];
			if (y[i] - x > 500)
			{
				System.out.print("better");
				System.out.print("\n");
				continue;
			}
			if (x - y[i] > 500)
			{
				System.out.print("worse");
				System.out.print("\n");
				continue;
			}
			System.out.print("same");
			System.out.print("\n");
		}
		return 0;
	}


}

