package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] Z = new int[1000];
		int x;
		int y;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
	for (x = 1;x <= n;x++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		Z[x] = Integer.parseInt(tempVar2);
	}
	}
	for (x = 1;x < n;x++)
	{
		if (Z[x] < Z[x + 1])
		{
			Z[x + 1] = Z[x + 1];
		}
		else
		{
			y = Z[x + 1];
			Z[x + 1] = Z[x];
			Z[x] = y;
		}
	}
	for (x = 1;x < n - 1;x++)
	{
		if (Z[x] < Z[x + 1])
		{
			Z[x + 1] = Z[x + 1];
		}
		else
		{
			y = Z[x + 1];
			Z[x + 1] = Z[x];
			Z[x] = y;
		}

	}
	System.out.printf("%d\n%d\n",Z[n],Z[n - 1]);
	return 0;
	}


}

