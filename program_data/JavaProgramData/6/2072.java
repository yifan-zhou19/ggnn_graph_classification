package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0;
		int line = 0;
		int row = 0;
		int[][] a = new int[102][102];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
			line = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (int j = 0;j < line;j++) //??
			{
				for (int k = 0;k < row;k++)
				{
					*(*(a + j) + k) = ConsoleInput.readToWhiteSpace(true);
				}
			}
			if (line == 1 && row == 1)
			{
				System.out.print(a);
				System.out.print("\n");
				continue;
			}
			int plus =  a + *(a + row - 1) + **(a + line-1) + *(*(a + line-1) + row - 1); //?????????
			for (int j = 1;j < line-1;j++) //?????
			{
				plus += **(a + j) + *(*(a + j) + row - 1);
			}
			for (int j = 1;j < row - 1;j++) //?????
			{
				plus += *(a + j) + *(*(a + line-1) + j);
			}
			System.out.print(plus);
			System.out.print("\n");
		}
		return 0;
	}
}

