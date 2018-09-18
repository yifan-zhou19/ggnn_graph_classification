package <missing>;

public class GlobalMembers
{
	//???1134 ??
	//??????
	//???2010.11.7

	public static int[][] a = new int[100][20]; //????????a[100][20]???????
	public static int i = 1; //??????i???????????
	public static int[] b = new int[100]; //????????b[100]???????????

	public static void sort()
	{
		int x = 0;
		int y = 0;
		int p = 0;
		int t = 0;
		for (p = 1; p <= i - 2; p++) //???????a[i]??
		{
			for (x = 1; x <= 14; x++)
			{
				for (y = 1; y <= 15 - x; y++)
				{
					if (a[p][y] > a[p][y + 1])
					{
						t = a[p][y];
						a[p][y] = a[p][y + 1];
						a[p][y + 1] = t;
					}
				}
			}
		}
	}
	public static void compare()
	{
		int x = 0;
		int y = 0;
		int p = 0;
		for (p = 1; p <= i - 2; p++) //??????????????
		{
			for (x = 1; x <= 15; x++)
			{
				for (y = x; y <= 15; y++)
				{
					if ((a[p][y] == 2 * a[p][x]) && (a[p][x] != 0))
					{
						b[p]++;
					}
				}
			}
		}
	}
	public static int Main()
	{
		int p = 0;
		int j = 0;

		do
		{
			j = 1;
			do
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				j++;
			}while ((a[i][j - 1] != 0) && (a[i][j - 1] != -1));
			i++;
		}while (a[i - 1][j - 1] != -1); //??i???????a[i]?

		sort(); //????
		compare();

		for (p = 1; p <= i - 2; p++)
		{
			System.out.print(b[p]);
			System.out.print("\n");
		}

		return 0;
	}
}

