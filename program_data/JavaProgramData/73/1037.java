package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[5][5];
		int i;
		int j;
		int[] row = new int[5];
		int[] col = new int[5];
		int sum;
		int n;
		int[] max = new int[5];
		sum = 0;
		for (i = 0; i < 5; i++)
		{
			for (j = 0; j < 5; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0; i < 5; i++)
		{
			for (j = 0; j < 5; j++)
			{
				if (a[i][j] > max[i])
				{
					max[i] = a[i][j];
					row[i] = i;
					col[i] = j;
				}
			}
		}
		for (n = 0; n < 5; n++)
		{
			for (i = 0; i < 5; i++)
			{
				if (a[i][col[n]] < max[n])
				{
					break;
				}
			}
			if (i == 5)
			{
				sum++;
				System.out.print(row[n] + 1);
				System.out.print(" ");
				System.out.print(col[n] + 1);
				System.out.print(" ");
				System.out.print(max[n]);
				System.out.print("\n");
			}
		}
		if (sum == 0)
		{
			System.out.print("not found");
			System.out.print("\n");
		}
		return 0;
	}

}

