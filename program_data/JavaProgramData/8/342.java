package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[100][2];
	public static int[] n = new int[2];
	public static int i;
	public static int j;
	public static int k;
	public static int t;
	public static int order(int j)
	{
		for (i = 1;i < n[j];i++)
		{
			for (k = i + 1;k <= n[j];k++)
			{
				if (a[i][j] > a[k][j])
				{
					a[i][j] = a[i][j] ^ a[k][j];
					a[k][j] = a[i][j] ^ a[k][j];
					a[i][j] = a[i][j] ^ a[k][j];
				}
			}
		}
	}
	public static int Main()
	{
		n[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n[1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n[0];i++)
		{
			a[i][0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 1;i <= n[1];i++)
		{
			a[i][1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		order(0);
		order(1);
		for (i = 1;i <= n[0];i++)
		{
			System.out.print(a[i][0]);
			System.out.print(' ');
		}
		for (i = 1;i < n[1];i++)
		{
			System.out.print(a[i][1]);
			System.out.print(' ');
		}
		System.out.print(a[n[1]][1]);
		System.out.print("\n");

	return 0;
	}
}

