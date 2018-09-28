package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] c = new char[50][100];
		int[] d = new int[100];
		int i;
		int j;
		int a = 0;
		for (i = 0;i <= 50;i++)
		{
			d[i] = 0;
			for (j = 0;j <= 100;j++)
			{
				c[i][j] = System.in.read();
				if (c[i][j] > 122 || c[i][j] < 65)
				{
					break;
				}
					d[i] = d[i] + 1;
			}
			if (c[i][j] == '\n')
			{
				break;
			}
				a = a + 1;
		}

		c[a][d[i]] = ' ';
		for (i = a;i > 0;i--)
		{
			for (j = 0;j <= d[i];j++)
			{
				System.out.printf("%c",c[i][j]);
			}
		}
		for (i = 0,j = 0;j <= d[i] - 1;j++)
		{
			System.out.printf("%c",c[i][j]);
		}

	}
}
