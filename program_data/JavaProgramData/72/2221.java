package <missing>;

public class GlobalMembers
{
	//**********************************
	//??: ????
	//???2013.12.18
	//**********************************
	public static int Main()
	{
		int m = 0;
		int n = 0;
		int i = 0;
		int j = 0;
		int[][] a = new int[22][22];
		int[][] b = new int[400][2];
		int p = 0;
		int q = 0;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= m;i++)
		{
			for (j = 1;j <= n;j++)
			{
			  a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 1;i <= m;i++)
		{
			for (j = 1;j <= n;j++)
			{
				if (a[i][j] >= a[i - 1][j] != 0 && a[i][j] >= a[i + 1][j] != 0 && a[i][j] >= a[i][j - 1] != 0 && a[i][j] >= a[i][j + 1])
				{
					b[p][0] = i;
					b[p][1] = j;
					p++;
				}
				else
				{
					continue;
				}
			}
		}
		for (i = 0;i < p;i++)
		{
			System.out.print(b[i][0] - 1);
			System.out.print(" ");
			System.out.print(b[i][1] - 1);
			System.out.print("\n");
		}
		return 0;
	}
}

