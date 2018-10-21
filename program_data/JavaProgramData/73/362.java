package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[5][5];
		int i;
		int j;
		int k;
		int t;
		int m;
		m = 0;
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
				if (a[i][j] >= a[i][0] != 0 && a[i][j] >= a[i][1] != 0 && a[i][j] >= a[i][2] != 0 && a[i][j] >= a[i][3] != 0 && a[i][j] >= a[i][4])
				{
					if (a[i][j] <= a[0][j] != 0 && a[i][j] <= a[1][j] != 0 && a[i][j] <= a[2][j] != 0 && a[i][j] <= a[3][j] != 0 && a[i][j] <= a[4][j])
					{
						k = i + 1;
						t = j + 1;
						System.out.print(k);
						System.out.print(" ");
						System.out.print(t);
						System.out.print(" ");
						System.out.print(a[i][j]);
					}
					else
					{
						m++;
					}
				}
				else
				{
					m++;
				}
			}
		}
		if (m == 25)
		{
			System.out.print("not found");
		}

		return 0;
	}




}

