package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int m;
		int j;
		int a;
		int e;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] sz = new int[n];
		int[] b = new int[n];
		j = 0;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[i] = Integer.parseInt(tempVar2);
			}
			a = sz[i] % 2;
			if (a == 1)
			{
			b[j] = sz[i];
			j++;
			}
		}
		for (m = 1;m <= j;m++)
		{
			for (i = 0;i < j - m;i++)
			{
				if (b[i] > b[i + 1])
				{
					e = b[i + 1];
					b[i + 1] = b[i];
					b[i] = e;
				}
			}
		}
	for (i = 0;i < j - 1;i++)
	{
		System.out.printf("%d,",b[i]);
	}
	System.out.printf("%d",b[j - 1]);
	return 0;
	}

}

