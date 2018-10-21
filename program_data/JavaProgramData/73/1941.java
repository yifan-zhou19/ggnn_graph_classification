package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[5][5];
		int i;
		int j;
		int[] maxr = new int[5];
		int[] row = new int[5];
		int[] column = new int[5];
		int max;
		int c;
		int count = 0;
		for (i = 0; i < 5; i++)
		{
			for (j = 0; j < 5; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0; i < 5; i++)
		{
			max = a[i][0];
			column[i] = 0;
			for (j = 0; j < 5; j++)
			{
				if (a[i][j] > max)
				{
					max = a[i][j];
					column[i] = j;
				}
			}
			maxr[i] = max;
			row[i] = i;
		}
		for (i = 0; i < 5; i++)
		{
			c = 0;
			for (j = 0; j < 5; j++)
			{
				if (maxr[i] > a[j][column[i]])
				{
					c = 1;
					break;
				}
			}
			if (c == 0)
			{
				System.out.print(row[i] + 1);
				System.out.print(" ");
				System.out.print(column[i] + 1);
				System.out.print(" ");
				System.out.print(maxr[i]);
				System.out.print("\n");
				count++;
			}
		}
		if (count == 0)
		{
			System.out.print("not found");
			System.out.print("\n");
		}
		return 0;
	}
}

