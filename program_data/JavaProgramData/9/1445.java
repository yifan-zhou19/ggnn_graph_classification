package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int a;
		int n;
		int e;
		int[] sz = new int[100];
		int[] sx = new int[100];
		char[][] st = new char[100][11];
		String sa = new String(new char[11]);
		char[][] sd = new char[100][11];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				st[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				sz[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (sz[i] >= 60)
			{
				sx[i] = sz[i];
				sd[i] = st[i];
			}
		}
		for (i = 1;i <= n;i++)
		{
			for (a = 0;a < n - i;a++)
			{
				if (sx[a] < sx[a + 1])
				{
					e = sx[a];
					sx[a] = sx[a + 1];
					sx[a + 1] = e;
					sa = sd[a];
					sd[a] = sd[a + 1];
					sd[a + 1] = sa;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			if (sx[i] >= 60)
			{
			System.out.println(sd[i]);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (sz[i] < 60)
			{
			System.out.println(st[i]);
			}
		}
		return 0;
	}
}

