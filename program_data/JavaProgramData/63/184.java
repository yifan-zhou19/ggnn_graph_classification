package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100][100];
		int[][] b = new int[100][100];
		int[][] c = new int[100][100];
		int i;
		int j;
		int ah;
		int al;
		int bh;
		int bl;
		int k;
		int t;
		for (i = 0;i < 100;i++)
		{
			for (j = 0;j < 100;j++)
			{
				c[i][j] = 0;
			}
		}
		ah = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		al = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < ah;i++)
		{
			for (j = 0;j < al;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		bh = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		bl = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < bh;i++)
		{
			for (j = 0;j < bl;j++)
			{
				b[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0;i < ah;i++)
		{
			for (j = 0;j < bl;j++)
			{
				for (t = 0,k = 0;k < al;k++)
				{
					t = t + a[i][k] * b[k][j];
				}
				c[i][j] = t;
			}
		}
		for (i = 0;i < ah;i++)
		{
			System.out.print(c[i][0]);
			for (j = 1;j < bl;j++)
			{
				System.out.print(" ");
				System.out.print(c[i][j]);
			}
			System.out.print("\n");
		}
		return 0;
	}
}

