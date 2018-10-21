package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N;
		int[] sz = new int[500];
		int j = 0;
		int e;
		int[] yz = new int[500];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < N;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[i] = Integer.parseInt(tempVar2);
			}
		}
		for (int i = 0;i < N;i++)
		{
			if (sz[i] % 2 != 0)
			{
				yz[j] = sz[i];
				j++;
			}
		}
		for (int p = 1;p < j;p++)
		{
			for (int q = 0;q < j - p;q++)
			{
				if (yz[q] > yz[q + 1])
				{
					e = yz[q + 1];
					yz[q + 1] = yz[q];
					yz[q] = e;
				}
			}
		}
		for (int t = 0;t < j;t++)
		{
			if (t != j - 1)
			{
				System.out.printf("%d,",yz[t]);
			}
			else
			{
				System.out.printf("%d",yz[t]);
			}
		}
		return 0;
	}


}

