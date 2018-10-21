package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[5][5];
		int i;
		int j;
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		int count = 0;
		int temp;
		for (i = 0;i < 5;i++)
		{
			int max = a[i][0];
			int maxj = 0;
			for (j = 0;j < 5;j++)
			{
				if (a[i][j] > max)
				{
						max = a[i][j];
				maxj = j;
				}
			}
			int g = 1;
			for (j = 0;j < 5;j++)
			{
				if (a[j][maxj] < max)
				{
					g = 0;
					break;
				}
			}
			if (g == 1)
			{
				count++;
				System.out.print(i + 1);
				System.out.print(" ");
				System.out.print(maxj + 1);
				System.out.print(" ");
				System.out.print(max);
				break;
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

