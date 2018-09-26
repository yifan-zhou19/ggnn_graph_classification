package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER NOTE: This was formerly a static local variable declaration (not allowed in Java):
private static int Main_n;
int[][][] a = new int[10][100][100];
	public static int Main()
	{
	//C++ TO JAVA CONVERTER NOTE: This static local variable declaration (not allowed in Java) has been moved just prior to the method:
	//	static int n,a[10][100][100];
		a[0][5][5] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		Main_n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1;i <= Main_n;i++)
		{
			for (int x = 1;x <= 9;x++)
			{
				for (int y = 1;y <= 9;y++)
				{
					a[i][x][y] = a[i - 1][x][y] * 2 + a[i - 1][x - 1][y] + a[i - 1][x + 1][y] + a[i - 1][x][y - 1] + a[i - 1][x][y + 1] + a[i - 1][x - 1][y - 1] + a[i - 1][x - 1][y + 1] + a[i - 1][x + 1][y - 1] + a[i - 1][x + 1][y + 1];
				}
			}
		}
		for (int i = 1;i <= 9;i++)
		{
			for (int j = 1;j <= 9;j++)
			{
				if (j - 1 != 0)
				{
					System.out.print(' ');
				}
				System.out.print(a[Main_n][i][j]);
				if (j == 9)
				{
					System.out.print("\n");
				}
			}
		}
		//cin>>n;
		return 0;
	}

}

