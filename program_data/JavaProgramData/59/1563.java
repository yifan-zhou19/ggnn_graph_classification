package <missing>;

public class GlobalMembers
{
	//****************************
	//**Title:????          **
	//**Author:?? 1300012732  **
	//**Date?2013.11.01        **
	//**File?5.cpp             **
	//****************************

	public static int Main()
	{
		char[][] a = new char[100][100];
		char[][] b = new char[100][100];
		int n;
		int i;
		int j;
		int k;
		int m;
		int p;
		int q;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			for (j = 0; j < n; j++)
			{
				a[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			}
		}
		for (i = 0; i < n; i++)
		{
			for (j = 0; j < n; j++)
			{
				b[i][j] = a[i][j];
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 2; k <= m; k++)
		{
			for (i = 0; i < n; i++)
			{
				for (j = 0; j < n; j++)
				{
					if (a[i][j] == '@' && a[i - 1][j] == '.' && i - 1 >= 0)
					{
						b[i - 1][j] = '@';
					}
					if (a[i][j] == '@' && a[i + 1][j] == '.' && i + 1 < n)
					{
						b[i + 1][j] = '@';
					}
					if (a[i][j] == '@' && a[i][j + 1] == '.' && j + 1 < n)
					{
						b[i][j + 1] = '@';
					}
					if (a[i][j] == '@' && a[i][j - 1] == '.' && j - 1 >= 0)
					{
						b[i][j - 1] = '@';
					}
				}
			}
	for (p = 0; p < n; p++)
	{
						for (q = 0; q < n; q++)
						{
							a[p][q] = b[p][q];
						}
	}
					System.out.print("\n");
		}
		int cnt = 0;
		for (i = 0; i < n; i++)
		{
			for (j = 0; j < n; j++)
			{
				cnt += (a[i][j] == '@');
			}
		}
		System.out.print(cnt);
		System.out.print("\n");
		return 0;
	}



}

