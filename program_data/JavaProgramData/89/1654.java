package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[10000];
		int[] b = new int[10000];
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (scanf("%d%d", i, j), i != 0 || j != 0)
		{
			a[i]++;
			b[j]++;
		}
		for (i = 0;i < n;i++)
		{
			if (a[i] == 0 && b[i] == n - 1)
			{
				System.out.printf("%d",i);
				break;
			}
		}
		if (i >= n)
		{
			System.out.print("NOT FOUND");
		}
	}
}

