package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N;
		int[] sz = new int[500];
		int i;
		int[] js = new int[500];
		int j = 1;
		int e;
		int k;
		int s = 0;
		int h = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= N;i++,s++)
		{
			 String tempVar2 = ConsoleInput.scanfRead();
			 if (tempVar2 != null)
			 {
				 (sz[i]) = Integer.parseInt(tempVar2);
			 }
		}
		for (k = 1;k <= s;k++)
		{
			for (i = 0;i <= s - k;i++)
			{
				if (sz[i] > sz[i + 1])
				{
					 e = sz[i + 1];
					 sz[i + 1] = sz[i];
					 sz[i] = e;
				}
			}
		}
		for (i = 1;i <= s;i++)
		{
			if (sz[i] % 2 != 0)
			{
				 js[j] = sz[i];
				 j = j + 1;
				 h = h + 1;
			}
		}
		for (j = 1;j <= h - 1;j++)
		{
			 System.out.printf("%d,",js[j]);
		}
		System.out.printf("%d",js[h]);
		return 0;
	}
}

