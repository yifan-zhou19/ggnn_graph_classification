package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[10000];

	public static int Main()
	{
		int n;
		int i;
		int from;
		int to;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (scanf("%d %d", from, to) && (from != 0 || to != 0))
		{
			a[from] = -1;
			if (a[to] != -1)
			{
				a[to] += 1;
			}
		}
		for (i = 0; i < n; i++)
		{
			if (a[i] == n - 1)
			{
				System.out.printf("%d\n", i);
				break;
			}
		}
		if (i == n)
		{
			System.out.print("NOT FOUND\n");
		}
		return 0;
	}

}

