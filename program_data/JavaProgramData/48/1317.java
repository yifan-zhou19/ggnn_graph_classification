package <missing>;

public class GlobalMembers
{
	//********************************
	//*???2.cpp   **
	//*???????????   **
	//*?????? 1300012838 **
	//*???2013.12.4  **
	//********************************

	public static int m;

	public static int day(int x, int y, int n)
	{
		if (x == 0 || x == 10 || y == 0 || y == 10)
		{
			return 0;
		}
		else if (x == 5 && y == 5 && n == 0)
		{
			return m;
		}
		else if (n == 0)
		{
			return 0;
		}
		else
		{
			return day(x, y, n - 1) * 2 + day(x - 1, y, n - 1) + day(x + 1, y, n - 1) + day(x, y - 1, n - 1) + day(x, y + 1, n - 1) + day(x - 1, y - 1, n - 1) + day(x - 1, y + 1, n - 1) + day(x + 1, y - 1, n - 1) + day(x + 1, y + 1, n - 1);
		}
	}

	public static int Main()
	{
		int n;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1; i <= 9; i++)
		{
			System.out.print(day(i, 1, n));
			for (int j = 2; j <= 9; j++)
			{
				System.out.print(" ");
				System.out.print(day(i, j, n));
			}
			System.out.print("\n");
		}

		return 0;
	}

}

