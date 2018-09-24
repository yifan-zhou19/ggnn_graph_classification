package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[][] a = new char[1000][13];
		char[][] c = new char[1000][17];
		char[][] b = new char[1000][3];
		int n = 0;
		int i = 0;
		int j;
		int m;
		int k;

		for (i = 0;i < 1000;i++)
		{
			c[i] = new Scanner(System.in).nextLine();
			if (c[i][0] == '\0')
			{
				n = i;
				break;
			}

			for (j = 0;j < 17;j++)
			{
				if (c[i][j] == ' ')
				{
					for (k = 0;k < j;k++)
					{
						a[i][k] = c[i][k];
						a[i][j] = '\0';
					}
					for (k = 0;k < 3;k++)
					{
						b[i][k] = c[i][k + j + 1];
					}
				}
			}
		}

		for (i = 0;i < n;i++)
		{
			m = 0;
			for (j = 0;j < (int)String.valueOf(a[i]).length();j++)
			{
				if (a[i][j] > a[i][m])
				{
					m = j;
				}
			}
			for (j = 9;j > m;j--)
			{
				a[i][j + 3] = a[i][j];
			}
			for (j = 0;j < 3;j++)
			{
				a[i][m + j + 1] = b[i][j];
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%s\n",a[i]);
		}
	}


}
