package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[5][5];
		int m;
		int i;
		int j;
		int p = 0;
		int k;
		int q = 0;
		for (i = 0; i < 5; i++)
		{
			for (j = 0; j < 5;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
			for (i = 0; i < 5; i++)
			{
				m = 0;
				for (j = 0; j < 5;j++)
				{
					if (a[i][j] > m)
					{
						m = a[i][j];
						p = j; // ???????
					}
				}
					for (k = 0;k < 5;k++)
					{
						if (a[k][p] < a[i][p])
						{
							break; // ???????????
						}
					}
						if (k == 5)
						{
							System.out.print(i + 1);
							System.out.print(" ");
							System.out.print(p + 1);
							System.out.print(" ");
							System.out.print(a[i][p]);
							System.out.print("\n");
							q = 1; // ??????1
						}
			}
			if (q == 0)
			{
				System.out.print("not found");
				System.out.print("\n");
			}
		return 0;
	}
}

