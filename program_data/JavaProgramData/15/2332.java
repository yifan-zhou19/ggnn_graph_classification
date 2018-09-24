package <missing>;

public class GlobalMembers
{
	public static int[][] array = new int[1000][1000];

	public static int Main()
	{
		int x1 = 1000;
		int y1 = 1000;
		int x2;
		int y2;
		int i;
		int j;
		int n;

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (i = 0; i < n; i++)
		{
			for (j = 0; j < n; j++)
			{
				array[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

				if (array[i][j] == 0)
				{
					x1 = (i < x1) ? i : x1;
					y1 = (j < y1) ? j : y1;
					x2 = i;
					y2 = j;
				}
			}
		}

		System.out.print((x2 - x1 - 1) * (y2 - y1 - 1));
		System.out.print("\n");

		return 0;
	}


}

