package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] c = new char[10][10];
		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;
		int i = 0;
		int j = 0;
		int k = 0;
		int p = 0;
		int a = 0;
		int m = 0;
		for (i = 1;i <= 5;i++)
		{
			c[i][2] = ' ';
		}
		for (i = 1;i <= 5;i++)
		{
			for (j = 1;j <= 5;j++)
			{
				if (i == j)
				{
					continue;
				}
				for (k = 1;k <= 5;k++)
				{
					if (i == k || j == k)
					{
						continue;
					}
					for (p = 1;p <= 5;p++)
					{
						if (i == p || j == p || k == p)
						{
							continue;
						}
						sum1 = (i + j == k + p);
						sum2 = (i + p > j + k);
						sum3 = (i + k < j);
						if (sum1 + sum2 + sum3 == 3)
						{
							c[i][2] = 'z';
							c[j][2] = 'q';
							c[k][2] = 's';
							c[p][2] = 'l';

						}
					}
				}
			}
		}
			for (m = 5;m >= 1;m--)
			{

				if (c[m][2] != ' ')
				{
					a = 10 * m;
					System.out.print(c[m][2]);
					System.out.print(" ");
					System.out.print(a);
					System.out.print("\n");
				}
			}
			return 0;
	}

}
