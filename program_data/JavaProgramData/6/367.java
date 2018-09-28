package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] square = new int[100][100];
		int k;
		int i;
		int j;
		int[] p = new int[100];
		p = square;
		int sum = 0;
		for ((k; k != 0; --k = ConsoleInput.readToWhiteSpace(true)).length() > 0)
		{
			int wide;
			int height;
			sum = 0;
			height = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			wide = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (i = 0; i < height; i++)
			{
				for (j = 0; j < wide; j++)
				{
					square[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			p = square;
			for (i = 0; i < height; i++)
			{
				for (j = 0; j < wide; j++)
				{
					if (i == 0 || j == 0 || i == height - 1 || j == wide - 1)
					{
						sum += * (p[i] + j);
					}
				}
			}
				System.out.print(sum);
				System.out.print("\n");
		}
		return 0;
	}
}

