package <missing>;

public class GlobalMembers
{
	/*
	 * work.cpp
	 * function:????
	 * Created on: 2012-12-3
	 * Author: sear
	 */
	public static int n; //n??????
	public static char[][] a = new char[101][101]; //????a???????
	public static void judge(int i, int j)
	{ //????????
		for (int d = -1; d <= 1; d += 2)
		{ //??????????????"$"
			if ((i + d >= 0) && (i + d < n) && (a[i + d][j] == '.'))
			{
				a[i + d][j] = '$';
			}
			if ((j + d >= 0) && (j + d < n) && (a[i][j + d] == '.'))
			{
				a[i][j + d] = '$';
			}
		}
	}
	public static int Main()
	{
		int m; //m????,,
		int num = 0;
		int i;
		int j;
		int k;
								//i,j,k	?????
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++) //?????????
		{
			for (j = 0; j < n; j++)
			{
				a[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 1; k <= m; k++)
		{ //m-1??????m?
			for (i = 0; i < n; i++) //?????????????????�@�
			{
				for (j = 0; j < n; j++)
				{
					if (a[i][j] == '$')
					{
						a[i][j] = '@';
					}
				}
			}
			for (i = 0; i < n; i++) //????
			{
				for (j = 0; j < n; j++)
				{
					if (a[i][j] == '@')
					{ //????
						judge(i, j); //??????
						num++; //?????1
						a[i][j] = '#';
								//???????????????
					}
				}
			}
		}
		System.out.print(num);
		return 0;
	}

}

