package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] sz = new int[500];
		int[] js = new int[500];
		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(sz[i]) = Integer.parseInt(tempVar2);
			}
		}
		for (int i = 0;i < n;i++)
		{
			if ((sz[i]) % 2 != 0)
			{
				js[i] = sz[i];
			}
		}
		int e;
		for (int k = 0;k <= n;k++)
		{
			for (int i = 0;i < n - 1;i++)
			{
				if ((js[i]) > (js[i + 1]))
				{
					e = js[i + 1];
					js[i + 1] = js[i];
					js[i] = e;
				}
			}
		}
		for (int i = 0;i < n;i++)
		{
			if ((js[i]) != 0 && i != n - 1)
			{
			System.out.printf("%d,",(js[i]));
			}
			else if (i == n - 1)
			{
				System.out.printf("%d",(js[i]));
			}
		}
		return 0;
	}

}

