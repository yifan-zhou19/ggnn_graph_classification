package <missing>;

public class GlobalMembers
{
	public static int[][] a1 = new int[100][100];
	public static int xiao(int n)
	{
		int sum = 0;
		if (n == 2)
		{
			for (int i = 0; i < n; i++)
			{
					int min = 1000;
					for (int j = 0; j < n; j++)
					{
						if (min > a1[i][j])
						{
							min = a1[i][j];
						}
					}
					for (int j = 0; j < n; j++)
					{
						a1[i][j] = a1[i][j] - min;
					}
			} //cout<<a1[1][1]<<endl<<endl;
				for (int j = 0; j < n; j++)
				{
					int min = 1000;
					for (int i = 0; i < n; i++)
					{
						if (min > a1[i][j])
						{
							min = a1[i][j];
						}
					}
					for (int i = 0; i < n; i++)
					{
						a1[i][j] = a1[i][j] - min;
					}
				}




			return a1[1][1];
		}



		for (int i = 0; i < n; i++)
		{
			int min = 1000;
			for (int j = 0; j < n; j++)
			{
				if (min > a1[i][j])
				{
					min = a1[i][j];
				}
			}
			for (int j = 0; j < n; j++)
			{
				a1[i][j] = a1[i][j] - min;
			}
		}
		for (int j = 0; j < n; j++)
		{
			int min = 1000;
			for (int i = 0; i < n; i++)
			{
				if (min > a1[i][j])
				{
					min = a1[i][j];
				}
			}
			for (int i = 0; i < n; i++)
			{
				a1[i][j] = a1[i][j] - min;
			}
		}
		//cout<<a1[1][1]<<endl;
		//cout<<endl;
		sum += a1[1][1];
	//cout<<sum<<endl<<endl;
		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < n; j++)
			{
				if (j == 1)
				{
					continue;
				}
				if (j < 1)
				{
					a1[i][j] = a1[i][j];
				}
				else
				{
					a1[i][j - 1] = a1[i][j];
				}
			}
		}
		for (int j = 0; j < n - 1; j++)
		{
			for (int i = 0; i < n; i++)
			{
				if (i == 1)
				{
					continue;
				}
				if (i < 1)
				{
					a1[i][j] = a1[i][j];
				}
				else
				{
					a1[i - 1][j] = a1[i][j];
				}
			}
		}
		sum += xiao(n - 1);
		return sum;
	}


	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (int k = 0; k < n; k++)
		{


		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < n; j++)
			{
				a1[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		System.out.print(xiao(n));
		System.out.print("\n");

		}


		return 0;
	}

}

