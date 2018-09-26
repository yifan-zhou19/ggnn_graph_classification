package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] sz = new int[300];
		int i;
		int j;
		int[] a = new int[300];
		int p = 0;
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
		}
		a[0] = sz[0];
		for (i = 1;i < n;i++)
		{
			for (j = 0;j < p + 1;j++)
			{
				if (sz[i] == a[j])
				{
					break;
				}
				else if (sz[i] != a[j] && (j == p))
				{
					p++;
					a[p] = sz[i];
				}
			}
		}
		for (i = 0;i < p;i++)
		{
			System.out.printf("%d,",a[i]);
		}
		System.out.printf("%d",a[p]);
		return 0;
	}


}

