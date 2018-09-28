package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] s = new int[5][5];
		int q;
		int n;
		int flag = 0;
		int max;
		int min;
		for (int i = 0;i < 5;i++)
		{
			for (int j = 0;j < 5;j++)
			{
				s[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}

		for (int i = 0;i < 5;i++)
		{
			for (int j = 0;j < 5;j++)
			{
				{
					max = s[i][j];
				min = s[i][j];
				   n = i;
				   q = j;

					for (int p = 0;p < 5;p++)
					{
						if (s[i][p] > max)
						{
							max = s[i][p];
							q = p;
						}
					}

					for (int m = 0;m < 5;m++)
					{
							if (s[m][j] < min)
							{
								min = s[m][j];
								n = m;
							}
					}

				  if (i == n && q == j)
				  {
					  System.out.print(n + 1);
					  System.out.print(' ');
					  System.out.print(q + 1);
					  System.out.print(' ');
					  System.out.print(s[n][q]);
					  System.out.print("\n");
					  flag = 1;
				  }

			}

			}
		}

	if (flag == 0)
	{
		System.out.print("not found");
		System.out.print("\n");
	}
			return 0;

	}

}

