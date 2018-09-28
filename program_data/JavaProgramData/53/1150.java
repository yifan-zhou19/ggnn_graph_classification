package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] sz = new int[300];
		int n;
		int i;
		int j;
		int[] q = new int[300];
		int m = 0;
		int p;
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
				sz[i] = Integer.parseInt(tempVar2);
			}
			for (j = 0;j <= i;j++)
			{
				if (j == i)
				{
						q[m] = sz[i];
						m++;
				}
				if (sz[i] == sz[j])
				{
					break;
				}
			}
		}
		for (p = 0;p < (m - 1);p++)
		{
			System.out.printf("%d,",q[p]);
		}
		System.out.printf("%d",q[m - 1]);
		return 0;
	}
}

