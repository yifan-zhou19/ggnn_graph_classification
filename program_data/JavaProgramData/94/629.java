package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int t;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] sz1 = new int[1000];
		int[] sz = new int[1000];
		int s = 0;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz1[i] = Integer.parseInt(tempVar2);
			}
			if (sz1[i] % 2 == 1)
			{
				sz[s] = sz1[i];
			s++;
			}
		}
			for (i = 0;i < s;i++)
			{
			for (m = 0;m < s - i;m++)
			{
				if (sz[m] > sz[m + 1])
				{
					t = sz[m + 1];
					sz[m + 1] = sz[m];
					sz[m] = t;
				}
			}
			}
		for (i = 1;i < s;i++)
		{
			System.out.printf("%d,",sz[i]);
		}
		System.out.printf("%d",sz[s]);
		return 0;
	}
}

