package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		int[][] b = new int[100][100];
		int[] a = new int[100];
		int t;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (j = 0;j < m;j++)
			{
				b[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			if (b[i][m - 1] + 3 * m > 60)
			{
				for (j = 0;j < m;j++)
				{
					if (b[i][j] + 3 * (j + 1) > 60 && b[i][j] + 3 * j <= 60)
					{
						t = 60 - 3 * j - (3 - (b[i][j] + 3 * (j + 1) - 60));
						System.out.print(t);
						System.out.print("\n");
						break;
					}
				else if (b[i][j] + 3 * (j + 1) <= 60 && b[i][j + 1] + 3 * (j + 1)>60)
				{
						t = 60 - 3 * (j + 1);
						System.out.print(t);
						System.out.print("\n");
						break;
				}
				}
			}
			else
			{
				t = 60 - m * 3;
				System.out.print(t);
				System.out.print("\n");
			}
		}
		return 0;
	}






}

