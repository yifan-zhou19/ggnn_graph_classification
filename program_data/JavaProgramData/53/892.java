package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] sz = new int[350];
		int[] szy = new int[350];
		int a;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[i] = Integer.parseInt(tempVar2);
			}
		}
		szy[0] = sz[0];
		m = 1;
		for (int k = 1;k < n;k++)
		{
			a = 0;
			for (int j = 0;j < m;j++)
			{
				if (sz[k] != szy[j])
				{
					a++;
				}
			}
			if (a == m)
			{
				m++;
				szy[m - 1] = sz[k];
			}
		}
		for (int q = 0;q < m - 1;q++)
		{
			System.out.printf("%d,",szy[q]);
		}
		System.out.printf("%d",szy[m - 1]);
		return 0;
	}

}

