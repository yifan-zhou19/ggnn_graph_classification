package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[5][5];
		int i;
		int j;
		int t;
		int k;
		int l;
		int m;
		int n;
		int flag;
		int count = 0;
		for (i = 0; i < 5; i++)
		{
			for (j = 0; j < 5; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (k = 0; k < 5; k++)
		{
			t = a[k][0];
			flag = 1;
			for (n = 0; n < 5; n++)
			{
				if (t <= a[k][n])
				{
					t = a[k][n];
					m = n;
				}
			}
			for (l = 0; l < 5; l++)
			{
				if (a[k][m] > a[l][m])
				{
					flag = 0;
					continue;
				}
			}
			if (flag == 1)
			{
				System.out.print(k + 1);
				System.out.print(' ');
				System.out.print(m + 1);
				System.out.print(' ');
				System.out.print(a[k][m]);
				System.out.print("\n");
				count = 1;
			}
		}
		if (count == 0)
		{
			System.out.print("not found");
			System.out.print("\n");
		}
		return 0;
	}
}

