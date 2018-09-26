package <missing>;

public class GlobalMembers
{
	public static int[] t = new int[10000000];
	public static int Main()
	{
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (scanf("%d%d", i, j), i != 0 || j != 0)
		{
			t[j]++;
			t[i]--;
		}
		for (i = 0; i < n; i++)
		{
			if (t[i] == n - 1)
			{
				 System.out.printf("%d", i);
				 break;
			}
		}
		if (i == n)
		{
			System.out.print("NOT FOUND");
		}
		return 0;
	}
}

