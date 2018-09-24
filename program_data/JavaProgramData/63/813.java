package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100][100];
		int[][] b = new int[100][100];
		int[][] m = new int[100][100];
		int c;
		int d;
		int e;
		int f;
		int i;
		int j;
		int k;
		int l;
		c = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < c;i++)
		{
			for (j = 0;j < d;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		e = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		f = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < e;i++)
		{
			for (j = 0;j < f;j++)
			{
				b[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (k = 0;k < c;k++)
		{
			for (l = 0;l < f;l++)
			{
				for (j = 0;j < d;j++)
				{
				  m[k][l] = m[k][l] + a[k][j] * b[j][l];
				}
			}
		}
		for (k = 0;k < c;k++)
		{
				for (l = 0;l < f - 1;l++)
				{
				System.out.print(m[k][l]);
				System.out.print(" ");
				}
					 System.out.print(m[k][f - 1]);
				System.out.print("\n");
		}
		return 0;
	}
}

