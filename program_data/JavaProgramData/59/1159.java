package <missing>;

public class GlobalMembers
{
	//********************************
	//*???2011??               **
	//*??????                 **
	//*???2013.1.12              **
	//*******************************/


	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		int[][] a = new int[100][100];
		int[][] b = new int[100][100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (i = 0; i < n; i++)
		{
			for (j = 0; j < n; j++)
			{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
				label:
				switch (System.in.read())
				{
				case '.':
					a[i][j] = -1;
					break;
				case '@':
					a[i][j] = 1;
					break;
				case '#':
					a[i][j] = 0;
					break;
				default:
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
					goto label;
				}
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (; m > 1; m--)
		{
			for (i = 0; i < n; i++)
			{
				for (j = 0; j < n; j++)
				{
					b[i][j] = -1;
				}
			}
			for (i = 0; i < n; i++)
			{
				for (j = 0; j < n; j++)
				{
					if (a[i][j] == 1)
					{
						if (i != n - 1 && a[i + 1][j] == -1)
						{
							b[i + 1][j] = 1;
						}
						if (i != 0 && a[i - 1][j] == -1)
						{
							b[i - 1][j] = 1;
						}
						if (j != n - 1 && a[i][j + 1] == -1)
						{
							b[i][j + 1] = 1;
						}
						if (j != 0 && a[i][j - 1] == -1)
						{
							b[i][j - 1] = 1;
						}
					}
				}
			}
			for (i = 0; i < n; i++)
			{
				for (j = 0; j < n; j++)
				{
					if (a[i][j] == -1 && b[i][j] == 1)
					{
						a[i][j] = 1;
					}
				}
			}

		}
		int sum = 0;
		for (i = 0; i < n; i++)
		{
			for (j = 0; j < n; j++)
			{
				if (a[i][j] == 1)
				{
					sum++;
				}
			}
		}
		System.out.print(sum);
		return 0;
	}
}

