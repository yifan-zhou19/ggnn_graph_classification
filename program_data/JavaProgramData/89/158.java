package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] g1 = new int[100000];
		int[] g2 = new int[100000];
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (scanf("%d%d", i, j), i != 0 || j != 0)
		{
			g1[i]++;
			g2[j]++;
		}
		for (i = 0; i < n; i++)
		{
			if (g1[i] == 0 && g2[i] == n - 1)
			{
				System.out.printf("%d", i);
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

