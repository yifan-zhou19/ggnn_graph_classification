package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int num = 0;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int row;
		int col;
		for (num = 0;num < k;num++)
		{
			row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			int[][] data = new int[row][col];
			int[] p = data;
			int i;
			int j;
			int sum = 0;
			for (i = 0;i < row;i++)
			{
				for (j = 0;j < col;j++)
				{
					*(p[i] + j) = ConsoleInput.readToWhiteSpace(true);
				}
			}
			for (i = 1;i < row - 1;i++)
			{
				sum = sum + *(p[i]) + *(p[i] + col - 1);
			}
			for (i = 1;i < col - 1;i++)
			{
				sum = sum + *(p[0] + i) + *(p[row - 1] + i);
			}
			sum += p + *(p[0] + col - 1) + *(p[row - 1]) + *(p[row - 1] + col - 1);
			System.out.print(sum);
			System.out.print("\n");
		}
		return 0;
	}

}

