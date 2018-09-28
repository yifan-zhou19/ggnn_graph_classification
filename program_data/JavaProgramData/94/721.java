package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N;
		int i;
		int j = 0;
		int k;
		int[] sz = new int[500];
		int[] result = new int[500];
		int e;
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
				sz[i] = Integer.parseInt(tempVar2);
			}
			if (sz[i] % 2 == 1)
			{
				result[j] = sz[i];
				j++;
			}
		}
		for (k = 1;k <= j;k++)
		{
			for (i = 0;i < j - k;i++)
			{
				if (result[i] > result[i + 1])
				{
					e = result[i + 1];
					result[i + 1] = result[i];
					result[i] = e;
				}
			}
		}
		for (i = 0;i < j - 1;i++)
		{
			System.out.printf("%d,",result[i]);
		}
		System.out.printf("%d",result[j - 1]);
		return 0;
	}
}

