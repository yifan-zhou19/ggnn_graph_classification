package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//void change(int[] a, int UnnamedParameter, int UnnamedParameter2, int UnnamedParameter3);
	public static int Main()
	{
		int[][] a = new int[9][9];
		int[][] b = new int[9][9];
		int m;
		int n;
		int g = 0;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i <= 8; i++)
		{
			for (int j = 0; j <= 8; j++)
			{
				b[i][j] = 0;
				a[i][j] = 0;
			}
		}
		a[4][4] = m;
		for (int i = 1; i <= (n + 1) / 2; i++)
		{
			for (int i = 0; i <= 8; i++)
			{
				for (int j = 0; j <= 8; j++)
				{
					b[i][j] = 0;
				}
			}
			for (int j = 0; j <= 8; j++)
			{
				for (int k = 0; k <= 8; k++)
				{
					if (a[j][k] > 0)
					{
						b[j - 1][k] = a[j][k] + b[j - 1][k];
						b[j][k - 1] = a[j][k] + b[j][k - 1];
						b[j + 1][k] = a[j][k] + b[j + 1][k];
						b[j][k + 1] = a[j][k] + b[j][k + 1];
						b[j - 1][k - 1] = a[j][k] + b[j - 1][k - 1];
						b[j - 1][k + 1] = a[j][k] + b[j - 1][k + 1];
						b[j + 1][k - 1] = a[j][k] + b[j + 1][k - 1];
						b[j + 1][k + 1] = a[j][k] + b[j + 1][k + 1];
						b[j][k] = 2 * a[j][k] + b[j][k];
					}
					g++;
				}
			}
			if (g == n)
			{
				break;
			}
			for (int i = 0; i <= 8; i++)
			{
				for (int j = 0; j <= 8; j++)
				{
					a[i][j] = 0;
				}
			}
			for (int j = 0; j <= 8; j++)
			{
				for (int k = 0; k <= 8; k++)
				{
					if (b[j][k] > 0)
					{
						a[j - 1][k] = b[j][k] + a[j - 1][k];
						a[j][k - 1] = b[j][k] + a[j][k - 1];
						a[j + 1][k] = b[j][k] + a[j + 1][k];
						a[j][k + 1] = b[j][k] + a[j][k + 1];
						a[j - 1][k - 1] = b[j][k] + a[j - 1][k - 1];
						a[j - 1][k + 1] = b[j][k] + a[j - 1][k + 1];
						a[j + 1][k - 1] = b[j][k] + a[j + 1][k - 1];
						a[j + 1][k + 1] = b[j][k] + a[j + 1][k + 1];
						a[j][k] = 2 * b[j][k] + a[j][k];
					}
					g++;
				}
			}
		}
		if (n % 2 == 0)
		{
			for (int i = 0; i <= 8; i++)
			{
				System.out.print(a[i][0]);
				for (int j = 1; j <= 8; j++)
				{
					System.out.print(" ");
					System.out.print(a[i][j]);
				}
				System.out.print("\n");
			}
		}
		else
		{
			for (int i = 0; i <= 8; i++)
			{
				System.out.print(b[i][0]);
				for (int j = 1; j <= 8; j++)
				{
					System.out.print(" ");
					System.out.print(b[i][j]);
				}
				System.out.print("\n");
			}
		}
		return 0;
	}
}

