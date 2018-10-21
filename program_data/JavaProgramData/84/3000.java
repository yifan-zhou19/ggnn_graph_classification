package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] sz = new int[100];
			 int i;
		int a;
		int b;
		int c;
		int e;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		for (i = 0 ; i < a; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(sz[i]) = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0; i < a - 1; i++)
		{
			if (sz[i] > sz[i + 1])
			{
				e = sz[i];
				sz[i] = sz[i + 1];
				sz[i + 1] = e;
			}
		}
		b = sz[i];
		for (i = 0 ; i < a - 2 ; i++)
		{
			if (sz[i] > sz[i + 1])
			{
				e = sz[i];
				sz[i] = sz[i + 1];
				sz[i + 1] = e;
			}
		}
		c = sz[i];
		System.out.printf("%d\n", b);
		System.out.printf("%d\n", c);
		return 0;
	}

}

