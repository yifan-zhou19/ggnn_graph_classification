package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[5][5];
	public static int Main()
	{
		int min;
		int max;
		int k = 0;
		int p;
		int q;
		int i;
		int j;
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
				max = a[i][j];
				min = a[i][j];
				for (p = 0;p < 5;p++)
				{
					if (max < a[i][p])
					{
						max = a[i][p];
					}
				}
				for (q = 0;q < 5;q++)
				{
					if (min > a[q][j])
					{
						min = a[q][j];
					}
				}
				if (a[i][j] == min && a[i][j] == max)
				{
					System.out.print(i + 1);
					System.out.print(' ');
					System.out.print(j + 1);
					System.out.print(' ');
					System.out.print(a[i][j]);
					k++;
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

