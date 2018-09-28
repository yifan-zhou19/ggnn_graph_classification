package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] col = new int[5];
		int[] row = new int[5];
		int i;
		int j;
		int max;
		int min;
		int[][] p = new int[5][5];
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				*(*(p + i) + j) = ConsoleInput.readToWhiteSpace(true);
			}
		}
		for (i = 0;i < 5;i++)
		{
			max = 0;
			min = 2100000000;
			for (j = 0;j < 5;j++)
			{
				if (max < *(*(p + i) + j))
				{
					max = (*(p + i) + j);
					row[i] = j;
				}
				if (min > *(*(p + j) + i))
				{
					min = (*(p + j) + i);
					col[i] = j;
				}
			}
		}
		for (i = 0;i < 5;i++)
		{
			if (col[row[i]] == i)
			{
				System.out.print(i + 1);
				System.out.print(" ");
				System.out.print((row + i) + 1);
				System.out.print(" ");
				System.out.print((*(p + i) + row[i]));
				System.out.print("\n");
				return 0;
			}
		}
		System.out.print("not found");
		System.out.print("\n");
		return 0;
	}
}

