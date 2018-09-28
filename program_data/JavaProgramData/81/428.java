package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[5][5];
	public static int t;

	public static int Main()
	{
		int i;
		int j;
		int m;
		int n;
		for (i = 0;i < 5;i++)
		{
						for (j = 0;j < 5;j++)
						{
							a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
						}
		}
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n < 0 || n>4 || m < 0 || m>4)
		{
			System.out.print("error");
			System.out.print("\n");
		}
		else
		{
			for (i = 0;i < 5;i++)
			{
				t = a[n][i];
				a[n][i] = a[m][i];
				a[m][i] = t;
			}
			for (i = 0;i < 5;i++)
			{
				System.out.print(a[i][0]);
				for (j = 1;j < 5;j++)
				{
					System.out.print(' ');
					System.out.print(a[i][j]);
				}
				System.out.print("\n");
			}
		}
		return 0;
	}

}

