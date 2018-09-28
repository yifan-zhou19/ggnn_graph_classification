package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N;
		int[] sz = new int[500];
		int i;
		int[] s = new int[500];
		int k;
		int max;
		int e;
		int f = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		for (i = 0;i < N;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(sz[i]) = Integer.parseInt(tempVar2);
			}
		}
		k = 0;
		for (i = 0;i < N;i++)
		{
			if (sz[i] % 2 != 0)
			{
					s[k] = sz[i];
					k++;
			}
		}
		for (f = 1;f <= k;f++)
		{
			max = 0;
			for (i = 0;i <= k - f;i++)
			{
				if (s[i] > s[max])
				{
				max = i;
				}
			}
			if (max != k - f)
			{
			e = s[max];
			s[max] = s[k - f];
			s[k - f] = e;
			}
		}
		System.out.printf("%d",s[0]);
		for (i = 1;i <= k - 1;i++)
		{
			System.out.printf(",%d",s[i]);
		}
		return 0;
	}

}

