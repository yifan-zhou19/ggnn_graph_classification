package <missing>;

public class GlobalMembers
{
	public static int[] know = new int[10000];
	public static int[] bknown = new int[10000];
	public static int Main()
	{
		int n;
		int i;
		int a;
		int b;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			know[i] = bknown[i] = 0;
		}
		while (scanf("%d%d", a, b))
		{
			if (a == b && b == 0)
			{
				break;
			}
			know[a]++;
			bknown[b]++;
		}
		for (i = 0;i < n;i++)
		{
			if (know[i] == 0 && bknown[i] == n - 1)
			{
				break;
			}
		}
		if (i <= n)
		{
			System.out.printf("%d\n",i);
		}
		else
		{
			System.out.print("NOT FOUND\n");
		}
		return 0;
	}

}

