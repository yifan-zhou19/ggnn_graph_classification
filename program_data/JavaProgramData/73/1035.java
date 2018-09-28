package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[5][5];
		int[] max = new int[5];
		int i;
		int j;
		int[] col = new int[5];
		int t = 1;

		for (i = 0; i < 5; i++)
		{
			for (j = 0; j < 5; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

				if (a[i][j] > max[i])
				{
					max[i] = a[i][j];
					col[i] = j;
				}
			}
		}
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				if (a[j][col[i]] < max[i])
				{
					break;
				}
			}
			if (j == 5)
			{
				System.out.print(i + 1);
				System.out.print(' ');
				System.out.print(col[i] + 1);
				System.out.print(' ');
				System.out.print(max[i]);
				System.out.print("\n");
				t = 0;
			}
		}
		if (t != 0)
		{
			System.out.print("not found");
			System.out.print("\n");
		}
		return 0;
	}
}

