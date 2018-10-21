package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int k;
		int e;
		int[] sz = new int[300];
		int[] zz = new int[300];
		int n;
		int m = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			sz[0] = Integer.parseInt(tempVar2);
		}
		for (i = 1;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				e = Integer.parseInt(tempVar3);
			}
			for (k = 0;k < i;k++)
			{
				if (e == sz[k])
				{
					sz[i] = 0;
					break;
				}
				else
				{
					sz[i] = e;
				}
			}
		}

			for (i = 0;i < n;i++)
			{

					if (sz[i] != 0)
					{
					  m += 1;

					zz[m - 1] = sz[i];
					}
			}
			for (i = 0;i < m - 1;i++)
			{
				System.out.printf("%d,",zz[i]);
			}
			System.out.printf("%d",zz[m - 1]);

		return 0;
	}
}

