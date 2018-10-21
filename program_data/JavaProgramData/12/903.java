package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] c = new int[100][100];
		int i = 0;
		int j = 0;
		int m;
		int n;
		int k;
		int s = 0;
		while (scanf("%d", c[i][j]))
		{
			if (c[i][j] != 0 && c[i][j] != -1)
			{
				j++;
			}
			else if (c[i][j] == 0)
			{
				i++;
				j = 0;
			}
			else
			{
				break;
			}
		}
		for (m = 0;m <= i - 1;m++)
		{
			for (n = 0;c[m][n] != 0;n++)
			{
				for (k = 0;c[m][k] != 0;k++)
				{
					if (c[m][n] == 2 * c[m][k])
					{
						s++;
					}
				}
			}
			System.out.printf("%d\n",s);
			s = 0;
		}
	}

}
