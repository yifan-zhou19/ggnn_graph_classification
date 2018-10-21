package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[10][10];
		int i;
		int j;
		int t;
		int max;
		int k;
		int l;
		int w = 0;
		for (i = 1;i <= 5;i++)
		{
			for (j = 1;j <= 5;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}

		}
		for (i = 1;i <= 5;i++)
		{
			max = -1;
			l = 0;
			for (j = 1;j <= 5;j++)
			{
				if (a[i][j] > max)
				{
					t = j;
					max = a[i][j];
				}
			}
			for (k = 1;k <= 5;k++)
			{
				if (a[k][t] < max)
				{
					l = 1;
				}
			}
			if (l == 0)
			{
				System.out.print(i);
				System.out.print(" ");
				System.out.print(t);
				System.out.print(" ");
				System.out.print(max);
				System.out.print("\n");
				w = 1;
			}
		}
		if (w != 1)
		{
			System.out.print("not found");
		}
		return 0;
	}
}

