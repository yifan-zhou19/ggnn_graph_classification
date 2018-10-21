package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int group = 0;
		int row = 0;
		int col = 0;
		int[][] a = new int[101][101];
		int[] p = new int[101];
		int i;
		int j;
		int sum = 0;
		p = a;
		group = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (group-- != 0)
		{
			row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (i = 0;i < row;i++) //??
			{
				for (j = 0;j < col;j++)
				{
					*(p[i] + j) = ConsoleInput.readToWhiteSpace(true);
				}
			}
			sum = 0;
			if (row == 1 && col == 1)
			{
				sum = p[0]; //????
			}
			else
			{
				for (i = 0;i < col;i++) //??????????
				{
						sum += *(p[0] + i);
						if (row > 1)
						{
							sum += *(p[row - 1] + i);
						}
				}
				for (i = 1;i <= row - 2;i++) //????????????
				{
						sum += *(p[i]);
						if (col > 1)
						{
							sum += *(p[i] + col - 1);
						}
				}
			}
			System.out.print(sum);
			System.out.print("\n");

		}
	}

}

