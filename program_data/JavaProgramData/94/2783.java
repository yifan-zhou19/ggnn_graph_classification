package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int e;
		int m;
		int i = 0;
		int j = 0;
		int k = 0;
		int[] sz = new int[500];
		int[] js = new int[500];
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
		for (i = 0;i < n;i++)
		{
			if (sz[i] % 2 != 0)
			{
					js[j] = sz[i];
					j++;
			}
		}
		for (m = 1;m < j;m++)
		{
			k = 0;
			for (i = 1;i <= j - m;i++)
			{
				if (js[i] > js[k])
				{
					k = i;
				}
			}
				if (k != j - m)
				{
					e = js[k];
					js[k] = js[j - m];
					js[j - m] = e;
				}
		}
				for (i = 0;i < j - 1;i++)
				{
					System.out.printf("%d,",js[i]);
				}
				System.out.printf("%d",js[j - 1]);
				return 0;
	}
}

