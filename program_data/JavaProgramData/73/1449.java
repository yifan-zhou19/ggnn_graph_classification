package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[5][5];
		int[][] b = new int[5][5];
		int v;
		int flag = 0;
		for (int i = 0;i < 5;i++)
		{
			for (int j = 0;j < 5;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				b[i][j] = a[i][j];
			}
		}
		for (int i = 0;i < 5;i++)
		{
			for (int k = 0;k < 4;k++)
			{
				for (int j = 0;j < 4 - k;j++)
				{
					if (a[i][j] <= a[i][j + 1])
					{
						v = a[i][j];
						a[i][j] = a[i][j + 1];
						a[i][j + 1] = v;
					}
				}
			}
		}
		for (int j = 0;j < 5;j++)
		{
			for (int k = 0;k < 4;k++)
			{
				for (int i = 0;i < 4 - k;i++)
				{
					if (b[i][j] >= b[i + 1][j])
					{
						v = b[i][j];
						b[i][j] = b[i + 1][j];
						b[i + 1][j] = v;
					}
				}
			}
		}
		for (int i = 0;i < 5;i++)
		{
			for (int j = 0;j < 5;j++)
			{
				if (a[i][0] == b[0][j])
				{
					System.out.print(i + 1);
					System.out.print(' ');
					System.out.print(j + 1);
					System.out.print(' ');
					System.out.print(a[i][0]);
					flag = 1;
				}
			}
		}
		if (flag == 0)
		{
			System.out.print("not found");
		}
		return 0;
	}

}

