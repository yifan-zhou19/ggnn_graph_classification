package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int start_row;
		int start_col;
		int end_row;
		int end_col;
		int row;
		int col;
		int value;
		int area;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		start_row = 0;
		for (i = 1; i <= n; i++)
		{
			for (j = 1; j <= n; j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					value = Integer.parseInt(tempVar2);
				}
				if (value == 0)
				{
						   row = i;
						   col = j;
						   if (start_row == 0)
						   {
							  start_row = row, start_col = col;
						   }
				}
			}
		}
		end_row = row, end_col = col;
		area = (end_row - start_row - 1) * (end_col - start_col - 1);
		System.out.printf("%i", area);

		return 0;
	}

}

