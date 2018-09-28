package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[5][5];
		int[] l = new int[5];
		int m;
		int k;
		int i;
		int j;
		int flag = 0;
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (j = 0;j < 5;j++)
		{
			l[j] = a[0][j];
			for (i = 0;i < 5;i++)
			{
				if (l[j] > a[i][j])
				{
					l[j] = a[i][j];
				}
			}
		}
		for (i = 0;i < 5;i++)
		{
				m = a[i][0];
				k = 0;
				for (j = 0;j < 5;j++)
				{
					if (a[i][j] > m)
					{
							m = a[i][j];
							k = j;
					}
				}
				if (m == l[k])
				{
						System.out.print(i + 1);
						System.out.print(' ');
						System.out.print(k + 1);
						System.out.print(' ');
						System.out.print(m);
						System.out.print("\n");
						flag = 1;
				}

		}
			if (flag == 0)
			{
				System.out.print("not found");
				System.out.print("\n");
			}
		return 0;
	}

}

