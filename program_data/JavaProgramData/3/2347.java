package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] sz = new int[1001];
		int[] js = new int[1001];
		int n;
		int i;
		int k;
		int a;
		int b;
		b = 0;
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
				(sz[i]) = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (i != n - 1)
			{
			for (a = i + 1;a < n;a++)
			{
				if (sz[i] + sz[a] == k)
				{
					b = b - 1000000;
					break;
				}
				b = b + 1;
			}
			}
		}
		if (b == (n * (n - 1)) / 2)
		{
			System.out.print("no");
		}
		else
		{
			System.out.print("yes");
		}
		return 0;
	}

}

