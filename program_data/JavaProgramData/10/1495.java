package <missing>;

public class GlobalMembers
{
	public static int result;

	public static void bfs(int[] a, int n, int i, int u)
	{
		int j;

		if (result < u)
		{
			result = u;
		}
		if (i < n)
		{
			for (j = i + 1;j <= n;j++)
			{

				if (a[j] <= a[i])
				{
					bfs(a, n, j, u + 1);
				}
			}
		}
	}

	public static int Main()
	{
		int R;
		int C;
		int i;
		int j;
		int n;
		int[] a = new int[26];
		int[][] b = new int[26][26];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		result = 0;
		a[0] = 99999;
		bfs(a, n, 0, 0);



		System.out.print(result);
		System.out.print("\n");
		return 0;
	}
}

