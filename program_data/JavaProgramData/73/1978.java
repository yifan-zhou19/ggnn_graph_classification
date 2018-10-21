package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[5][5];
		int i;
		int j;
		int i1;
		int j1;
		int m = 0;
		for (i = 0 ; i < 5 ; i++)
		{
			for (j = 0 ; j < 5 ; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i1 = 0 ; i1 < 5 ; i1++)
		{
			for (j1 = 0 ; j1 < 5 ; j1++)
			{
				if (a[i1][j1] >= a[i1][0] != 0 && a[i1][j1] >= a[i1][1] != 0 && a[i1][j1] >= a[i1][2] != 0 && a[i1][j1] >= a[i1][3] != 0 && a[i1][j1] >= a[i1][4])
				{
					if (a[i1][j1] <= a[0][j1] != 0 && a[i1][j1] <= a[1][j1] != 0 && a[i1][j1] <= a[2][j1] != 0 && a[i1][j1] <= a[3][j1] != 0 && a[i1][j1] <= a[4][j1])
					{
							System.out.print(i1 + 1);
							System.out.print(" ");
							System.out.print(j1 + 1);
							System.out.print(" ");
							System.out.print(a[i1][j1]);
							System.out.print("\n");
							m++;
							break;
					}
				}
				if (m != 0)
				{
					break;
				}
			}
			if (m != 0)
			{
				break;
			}
		}
		if (m == 0)
		{
			System.out.print("not found");
			System.out.print("\n");
		}
		return 0;
	}
}

