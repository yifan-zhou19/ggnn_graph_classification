package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int m;
		int k;
		int s;
		char[][] a = new char[110][110];
		int[][] b = new int[110][110]; //???????
		s = 0; //????????0
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				b[i][j] = 0;
				a[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);

			}
		} //????a???b??????0
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 0;k < m - 1;k++)
		{
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
					 if (a[i][j] == '@')
					 {
						 if (b[i][j] == k)
						 { //??????????????????

							if (i - 1 >= 0)
							{
								if (a[i - 1][j] == '.')
								{
								   a[i - 1][j] = '@';
								   b[i - 1][j]++;
								}
							} //???????????????????????
							if (j - 1 >= 0)
							{
							   if (a[i][j - 1] == '.')
							   {
								   a[i][j - 1] = '@';
								   b[i][j - 1]++;
							   }
							} //???????????????????????
							if (i + 1 < n)
							{
							   if (a[i + 1][j] == '.')
							   {
								   a[i + 1][j] = '@';
								   b[i + 1][j]++;
							   }
							} //???????????????????????
							if (j + 1 < n)
							{
							   if (a[i][j + 1] == '.')
							   {
								   a[i][j + 1] = '@';
									 b[i][j + 1]++;
							   }
							} //???????????????????????

						 }
					 }
				}
			}
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
					b[i][j] = k + 1;
				}
			}

		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (a[i][j] == '@')
				{
					s++;
				}
			}
		}
		//??????
		System.out.print(s);

		return 0;
	}













}

