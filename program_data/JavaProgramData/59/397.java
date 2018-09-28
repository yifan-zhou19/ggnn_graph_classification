package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] a = new char[100][101];
		char[][] b = new char[100][101];
		int n;

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));


		//??
		for (int i = 0;i < n;i++)
		{
			a[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
		}



	/*
	    strcpy(a[0],"....#");
	    strcpy(a[1],".#.@.");
	    strcpy(a[2],".#@..");
	    strcpy(a[3],"#....");
	    strcpy(a[4],".....");
	*/
		for (int i = 0;i < n;i++)
		{
			b[i] = a[i];
		}

		int m;

		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		//????
		for (int k = 0;k < m - 1;k++)
		{
			//????
			for (int i = 0;i < n;i++)
			{
			for (int j = 0;j < n;j++)
			{
				if (a[i][j] == '@')
				{
					//????
					if (i != 0)
					{
						if (a[i - 1][j] == '.')
						{
							b[i - 1][j] = '@';
						}
					}
					//???
					if (j != 0)
					{
						if (a[i][j - 1] == '.')
						{
							b[i][j - 1] = '@';
						}
					}
					//???
					if (i != n - 1)
					{
						if (a[i + 1][j] == '.')
						{
							b[i + 1][j] = '@';
						}
					}
					//???
					if (j != n - 1)
					{
						if (a[i][j + 1] == '.')
						{
							b[i][j + 1] = '@';
						}
					}

				}
			}
			}
			for (int i = 0;i < n;i++)
			{
			a[i] = b[i];
			}


		}
		//??
		int p = 0;
		for (int i = 0;i < n;i++)
		{
			for (int j = 0;j < n;j++)
			{
				if (a[i][j] == '@')
				{
					p += 1;
				}
			}
		}
		System.out.print(p);


	}
}

