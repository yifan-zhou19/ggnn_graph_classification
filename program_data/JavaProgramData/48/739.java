package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER NOTE: This was formerly a static local variable declaration (not allowed in Java):
private static int[][][] Main_a = new int[10][20][20];
int n;
	public static int Main()
	{
	//C++ TO JAVA CONVERTER NOTE: This static local variable declaration (not allowed in Java) has been moved just prior to the method:
	//	static int a[10][20][20],n;
		Main_a[0][5][5] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		//????????????????????
		for (int i = 1;i <= n;i++)
		{
			for (int x = 1;x <= 9;x++)
			{
				for (int y = 1;y <= 9;y++)
				{
					Main_a[i][x + 1][y + 1] += Main_a[i - 1][x][y];
					Main_a[i][x + 1][y] += Main_a[i - 1][x][y];
					Main_a[i][x + 1][y - 1] += Main_a[i - 1][x][y];
					Main_a[i][x - 1][y + 1] += Main_a[i - 1][x][y];
					Main_a[i][x - 1][y] += Main_a[i - 1][x][y];
					Main_a[i][x - 1][y - 1] += Main_a[i - 1][x][y];
					Main_a[i][x][y + 1] += Main_a[i - 1][x][y];
					Main_a[i][x][y - 1] += Main_a[i - 1][x][y];
					Main_a[i][x][y] += 2 * Main_a[i - 1][x][y];
				}
			}
		}
		//??
		for (int x = 1;x <= 9;x++)
		{
			for (int y = 1;y <= 9;y++)
			{
				if (y > 1)
				{
					System.out.print(" ");
				}
				System.out.print(Main_a[n][x][y]);
			}
			System.out.print("\n");
		}
		//cin>>n;
		return 0;
	}

}

