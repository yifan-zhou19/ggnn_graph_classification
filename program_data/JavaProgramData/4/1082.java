package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100][100];
		int[] p = a;
		int i;
		int j;
		int r;
		int c;
		r = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		c = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i <= r - 1;i++)
		{
			for (j = 0;j <= c - 1;j++)
			{
				*(p[i] + j) = ConsoleInput.readToWhiteSpace(true);
			}
		}
		int t;
		for (t = 0;t <= c - 1;t++)
		{
			for (i = 0, j = t;(j >= 0) && (i <= r - 1);i++, j--)
			{
				System.out.print((p[i] + j));
				System.out.print("\n");
			}
		}
		for (t = 1;t <= r - 1;t++)
		{
			for (i = t, j = c - 1;(j >= 0) && (i <= r - 1);i++, j--)
			{
				System.out.print((p[i] + j));
				System.out.print("\n");
			}
		}
	}
}

