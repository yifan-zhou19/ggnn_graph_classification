package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int row;
		int col;
		int j;
		int k;
		int sum;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (i = 0;i < n;i++)
		{
			sum = 0;
			row = 0;
			col = 0;
			int[][] a = new int[103][103];
			row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (j = 0;j < row;j++)
			{
				for (k = 0;k < col;k++)
				{
					*(*(a + j) + k) = ConsoleInput.readToWhiteSpace(true);
				}
			}
			if ((row == 1) && (col == 1))
			{
				System.out.print(a);
				System.out.print("\n");
			}
			else
			{
				for (k = 0;k < col;k++)
				{
					sum = sum + *(a + k); //?????
				}
				for (k = 0;k < col;k++)
				{
					sum = sum + *(*(a + row - 1) + k);
				}
				for (j = 0;j < row;j++)
				{
					sum = sum + **(a + j);
				}
				for (j = 0;j < row;j++)
				{
					sum = sum + *(*(a + j) + col - 1);
				}
				sum = sum - * a;
				sum = sum - *(*(a + row - 1));
				sum = sum - *(a + col - 1);
				sum = sum - *(*(a + row - 1) + col - 1);
				System.out.print(sum);
				System.out.print("\n");
			}
		}
		return 0;
	}
}

