package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 0;
		int k = 0;
		int j = 0;
		int max = 0;
		int min = 1000000;
		int[][] a = new int[6][6];
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{

				if (a[i][j] > max)
				{
					max = a[i][j];
				}
			}
			a[i][5] = max;
			max = 0;
		}

		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{

				if (a[j][i] < min)
				{
					min = a[j][i];
				}

			}
			a[5][i] = min;
			min = 1000000;
		}
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				if (a[i][j] == a[i][5] && a[i][j] == a[5][j])
				{
					k = 1;
					System.out.print(i + 1);
					System.out.print(" ");
					System.out.print(j + 1);
					System.out.print(" ");
					System.out.print(a[i][j]);
					System.out.print("\n");
				}
			}
		}
		if (k == 0)
		{
			System.out.print("not found");
			System.out.print("\n");
		}

		return 0;
	}
}

