package <missing>;

public class GlobalMembers
{
	//***************************
	//**???5.cpp
	//**??????
	//**???2013.11.1
	//**?????????
	//***************************
	public static int Main()
	{
		char[][] a = new char[102][102];
		int n;
		int m;
		int num = 0;

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1; i <= n; i++)
		{
			for (int j = 1; j <= n; j++)
			{
				a[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int k = 2; k <= m; k++)
		{
			for (int i = 1; i <= n; i++)
			{
				for (int j = 1; j <= n; j++)
				{
					if (a[i][j] == '@')
					{
						a[i - 1][j] = (a[i - 1][j] == '#' || a[i - 1][j] == '@')? a[i - 1][j]: ' ';
						a[i + 1][j] = (a[i + 1][j] == '#' || a[i + 1][j] == '@')? a[i + 1][j]: ' ';
						a[i][j - 1] = (a[i][j - 1] == '#' || a[i][j - 1] == '@')? a[i][j - 1]: ' ';
						a[i][j + 1] = (a[i][j + 1] == '#' || a[i][j + 1] == '@')? a[i][j + 1]: ' ';
					}
				}
			}
			for (int i = 1; i <= n; i++)
			{
				for (int j = 1; j <= n; j++)
				{
					a[i][j] = a[i][j] == ' '? '@': a[i][j];
				}
			}
		}
		for (int i = 1; i <= n; i++)
		{
			for (int j = 1; j <= n; j++)
			{
				if (a[i][j] == '@')
				{
					num++;
				}
			}
		}
		System.out.print(num);
		System.out.print("\n");
		return 0;
	}
}

