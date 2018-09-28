package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100][100];
		int row = 0;
		int col = 0;
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] p = a;

		//cout<<*(p[0]+2)<<endl;
		int i;
		int j;
		for (i = 0;i < row;i++)
		{
			for (j = 0;j < col;j++)
			{
				*(p[i] + j) = ConsoleInput.readToWhiteSpace(true);
			}
		}
		for (i = 0;i < row + col - 1;i++)
		{
			for (j = 0;j < row;j++)
			{
				if (i - j >= 0 && i - j < col)
				{
					System.out.print((p[j] + i - j));
					System.out.print("\n");
				}
			}
		}
		return 0;
	}

}

