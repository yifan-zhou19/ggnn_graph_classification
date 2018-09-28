package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] sz = new int[500];
		int[] qs = new int[500];
		int n;
		int i;
		int j;
		int m;
		int k;
		int e;
		int x;
		j = 0;
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
		 while (sz[i] % 2 != 0)
		 {
				x = qs[j];
			   qs[j] = sz[i];
			   sz[i] = x;
			   j = j + 1;
		 }
		}
		for (k = 1;k <= j;k++)
		{
			for (m = 0;m < j - k;m++)
			{
				if (qs[m] > qs[m + 1])
				{
					e = qs[m + 1];
					qs[m + 1] = qs[m];
					qs[m] = e;
				}
			}
		}
		for (m = 0;m < j - 1;m++)
		{
			System.out.printf("%d,",qs[m]);
		}
		System.out.printf("%d",qs[j - 1]);
		return 0;
	}

}

