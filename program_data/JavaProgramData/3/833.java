package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
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
		int[] sz = new int[1001];
		for (int i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				sz[i] = Integer.parseInt(tempVar3);
			}
		}
		int bar = 0;
		for (int a = 0;a < n;a++)
		{
			for (int b = a + 1;b < n;b++)
			{
				if (sz[a] + sz[b] == k)
				{
					bar = 1;
				}
			}
		}
		if (bar == 1)
		{
			System.out.print("yes");
		}
		if (bar == 0)
		{
			System.out.print("no");
		}
		return 0;
	}

}

