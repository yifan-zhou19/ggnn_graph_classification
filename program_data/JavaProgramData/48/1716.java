package <missing>;

public class GlobalMembers
{
	public static void birth(int day, int num)
	{
		cnt++;
		if (cnt > day) //???????????
		{
			return;
		}

		for (int i = 0; i <= 8; i++) //?????????????spread???????????
		{
			for (int j = 0; j <= 8; j++)
			{
				spread[i][j] = a[i][j];
				a[i][j] = a[i][j] * 2;
			}
		}
		for (int k = 0; k <= 8; k++)
		{
			for (int l = 0; l <= 8; l++)
			{
				a[k - 1][l] = a[k - 1][l] + spread[k][l]; //????8????
				a[k + 1][l] = a[k + 1][l] + spread[k][l];
				a[k][l - 1] = a[k][l - 1] + spread[k][l];
				a[k][l + 1] = a[k][l + 1] + spread[k][l];
				a[k - 1][l - 1] = a[k - 1][l - 1] + spread[k][l];
				a[k - 1][l + 1] = a[k - 1][l + 1] + spread[k][l];
				a[k + 1][l - 1] = a[k + 1][l - 1] + spread[k][l];
				a[k + 1][l + 1] = a[k + 1][l + 1] + spread[k][l];
			}
		}

		birth(day, num); //??
	}
	public static int cnt = 0;
	public static int[][] a = new int[10][10];
	public static int[][] spread = new int[10][10];
	public static int Main()
	{
		int m;
		int n;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[4][4] = m;
		birth(n, m); //birth???????????
		for (int y = 0; y <= 8; y++)
		{
			for (int o = 0; o <= 7; o++) //????
			{
				System.out.print(a[y][o]);
				System.out.print(" ");
			}
			System.out.print(a[y][8]);
			System.out.print("\n");
		}
		return 0;
	}





}

