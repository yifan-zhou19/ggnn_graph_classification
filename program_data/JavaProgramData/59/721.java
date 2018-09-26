package <missing>;

public class GlobalMembers
{
	//****************************
	//?????? 1200012971**
	//???5.cpp **
	//???2012.11.11 **
	//****************************
	public static int Main()
	{
		int i; //??????
		int j;
		int n;
		int[][] a = new int[100][100];
		int d;
		int m = 0;
		char[][] b = new char[100][100]; //????????
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			for (j = 0; j < n; j++) //??????????
			{
				b[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
				if (b[i][j] == '@')
				{
					a[i][j] = 1;
				}
			}
		}
		d = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int k = 1; k < d; k++)
		{
			for (i = 0; i < n; i++)
			{
				for (j = 0; j < n; j++)
				{
					if (b[i][j] == '@') //???????? ?????
					{
						if (j == 0) //????????????????????????????????
						{
							if (i == 0) //????????
							{
								a[i + 1][j] = 1;
								a[i][j + 1] = 1;
							}
							if (i == n - 1) //?????????
							{
								a[i - 1][j] = 1;
								a[i][j + 1] = 1;
							}
							if (i != 0 && i != n - 1) //?????????????????
							{
								a[i - 1][j] = 1;
								a[i][j + 1] = 1;
								a[i + 1][j] = 1;
							}
						}
						if (j == n - 1) //??????
						{
							if (i == 0) //???????
							{
								a[i + 1][j] = 1;
								a[i][j - 1] = 1;
							}
							if (i == n - 1) //????????
							{
								a[i - 1][j] = 1;
								a[i][j - 1] = 1;
							}
							if (i != 0 && i != n - 1) //?????????????
							{
								a[i - 1][j] = 1;
								a[i][j - 1] = 1;
								a[i + 1][j] = 1;
							}
						}
						if (j != 0 && j != n - 1) //????????
						{
							if (i == 0) //?????
							{
								a[i + 1][j] = 1;
								a[i][j - 1] = 1;
								a[i][j + 1] = 1;
							}
							if (i == n - 1) //??????
							{
								a[i - 1][j] = 1;
								a[i][j - 1] = 1;
								a[i][j + 1] = 1;
							}
							if (i != 0 && i != n - 1) //????????
							{
								a[i - 1][j] = 1;
								a[i][j - 1] = 1;
								a[i + 1][j] = 1;
								a[i][j + 1] = 1;
							}
						}
					}
				}
			}
			for (i = 0; i < n; i++) //???????????@
			{
				for (j = 0; j < n; j++)
				{
					if (a[i][j] == 1)
					{
						if (b[i][j] == '#') //????????????????0
						{
							a[i][j] = 0;
						}
						else
						{
							b[i][j] = '@';
						}
					}
				}
			}
		}
		for (i = 0; i < n; i++) //??????????????d???????
		{
			for (j = 0; j < n; j++)
			{
				m += a[i][j];
			}
		}
		System.out.print(m);
		return 0;
	}













}

