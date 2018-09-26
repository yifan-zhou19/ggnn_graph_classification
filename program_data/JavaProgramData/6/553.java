package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int m;
		int n;
		int a;
		int[] sum = new int[100];
		int x;
		int y;
		int z;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (x = 0;x < k;x++)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (y = 0;y < m;y++)
			{
				for (z = 0;z < n;z++)
				{
					a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
					if (z == 0 || y == 0 || z == n - 1 || y == m - 1)
					{
						sum[x] = sum[x] + a;
					}
				}
			}
		}

		for (x = 0;x < k;x++)
		{
			System.out.print(sum[x]);
			System.out.print("\n");
		}

		return 0;
	}
}

