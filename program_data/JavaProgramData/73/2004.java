package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[5][5];
		int i;
		int j;
		int k;
		int n = 0;
		int max;
		int min;
		int row;
		int colum;
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
			for (i = 0;i < 5;i++)
			{
				max = a[i][0];
				row = i;
				colum = 0;
				for (j = 1;j < 5;j++)
				{
				if (a[i][j] > max)
				{
						max = a[i][j];
						colum = j;
				}
				}
					min = max;
					for (k = 0;k < 5;k++)
					{
						if (a[k][colum] < min)
						{
							min = a[k][colum];
						}
					}
					if (max == min)
					{
							n++;
							System.out.print(row + 1);
							System.out.print(" ");
							System.out.print(colum + 1);
							System.out.print(" ");
							System.out.print(max);
							System.out.print("\n");
					}
			}
			if (n == 0)
			{
				System.out.print("not found");
				System.out.print("\n");
			}
			return 0;
	}


}

