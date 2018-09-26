package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k = 0;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] sz = new int[300];
		int[] e = new int[300];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(sz[i]) = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			 for (j = i + 1;j < n;j++)
			 {
				  if (sz[i] == sz[j])
				  {
						  sz[j] = 0;
				  }
			 }
		}
		for (i = 0;i < n;i++)
		{
			 if (sz[i] != 0)
			 {
				  e[k] = sz[i];
				  k++;
			 }
		}
		m = k;
		for (k = 0;k < m - 1;k++)
		{
			 System.out.printf("%d,",e[k]);
		}
		System.out.printf("%d",e[m - 1]);
	return 0;
	}
}

