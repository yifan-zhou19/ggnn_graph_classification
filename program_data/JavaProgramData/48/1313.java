package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] array = new int[9][9];
		int[][] temp = new int[9][9];
		int i;
		int j;
		int k;
		int p;
		for (i = 0 ;i < 9 ;i++)
		{
			for (j = 0 ; j < 9 ; j++)
			{
				array[i][j] = 0;
				temp[i][j] = 0;
			}
		}
		int m;
		int n;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		array[4][4] = m;
		while (n != 0)
		{
			for (i = 0; i < 9 ;i++) //??????
			{
				for (j = 0 ;j < 9 ; j++)
				{
					if (i - 1 >= 0 && j - 1 >= 0 && array[i][j] != 0) //??i,j?????????
					{
						for (k = i - 1 ;k <= i + 1 ;k++)
						{
							for (p = j - 1 ; p <= j + 1 ;p++)
							{
								if (k == i && p == j)
								{
									temp[i][j] = temp[i][j] + array[i][j] * 2;
								}
								else
								{
									temp[k][p] = temp[k][p] + array[i][j];
								}
							}
						}
					}
				}
			}
			for (i = 0 ;i < 9 ;i++) //???????????
			{
				for (j = 0 ; j < 9 ; j++)
				{
					array[i][j] = temp[i][j];
					temp[i][j] = 0;
				}
			}
			n--;
		}
		for (i = 0 ;i < 9 ;i++) //??
		{
			for (j = 0 ; j < 9 ; j++)
			{
				if (j == 8)
				{
					System.out.print(array[i][j]);
				}
				else
				{
					System.out.print(array[i][j]);
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}

	}

}

