package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		int j;
		int e;
		k = 0;
		int[] shou = new int[100];
		int[] shu = new int[100];
		int[] sz = new int[100];
		for (j = 0;j < 100;j++)
		{
			sz[j] = 0;
		}
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
				(shou[i]) = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				(shu[i]) = Integer.parseInt(tempVar3);
			}
			if (shou[i] >= 90 && shou[i] <= 140 && shu[i] >= 60 && shu[i] <= 90)
			{
				sz[k] = sz[k] + 1;
			}
			else
			{
				k = k + 1;
			}
		}
		for (j = 0;j < k;j++)
		{
			if (sz[j] > sz[j + 1])
			{
				e = sz[j];
				sz[j] = sz[j + 1];
				sz[j + 1] = e;
			}
		}
		System.out.printf("%d",sz[k]);
		return 0;





	}
}

