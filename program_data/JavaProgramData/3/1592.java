package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int k;
	int i;
	int j;
	int[] g = new int[N];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		k = Integer.parseInt(tempVar2);
	}
	for (i = 0;i < n;i++)
	{
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			g[i] = Integer.parseInt(tempVar3);
		}
	}
	for (i = 0;i < n - 1;i++)
	{
		for (j = i + 1;j < n;j++)
		{
			if (g[i] + g[j] == k)
			{
				System.out.print("yes");
				break;
			}
			else if (i == n - 2)
			{
				System.out.print("no");
			}
		}
		if (g[i] + g[j] == k)
		{
				break;
		}
			else if (i == n - 2)
			{
				break;
			}
	}
		return 0;
	}
}

