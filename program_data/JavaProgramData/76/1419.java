package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] sz = new int[n];
		int[] zs = new int[n];
		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				zs[i] = Integer.parseInt(tempVar3);
			}
		}
		for (int x = 0;x < n - 1;x++)
		{
		for (int i = 0;i < n - 1 - x;i++)
		{
			if (sz[i] > sz[i + 1])
			{
				m = sz[i];
				sz[i] = sz[i + 1];
				sz[i + 1] = m;
			}
		}
		}
		for (int x = 0;x < n - 1;x++)
		{
			for (int i = 0;i < n - 1;i++)
			{
			if (zs[i] > zs[i + 1])
			{
				m = zs[i];
				zs[i] = zs[i + 1];
				zs[i + 1] = m;
			}
			}
		}
		a = 1;
		for (int i = 0;i < n - 1;i++)
		{
			if (zs[i] < sz[i + 1])
			{
				a = 0;
			}
		}
		if (a == 1)
		{
			System.out.printf("%d %d",sz[0],zs[n - 1]);
		}
		else
		{
			System.out.print("no");
		}
		return 0;
	}

}

