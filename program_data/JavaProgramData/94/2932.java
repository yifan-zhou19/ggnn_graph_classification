package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int maxIndex;
	int e;
	int LEN;
	int k;
	int i;
	int[] sz = new int[1000];
	int[] js = new int[1000];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		LEN = Integer.parseInt(tempVar);
	}
	for (i = 0;i < LEN;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		sz[i] = Integer.parseInt(tempVar2);
	}
	}
	for (int k = 1 ; k <= LEN; k++)
	{
		maxIndex = 0;
		for (int i = 0; i <= LEN - k; i++)
		{
				if (sz[i] > sz[maxIndex])
				{
						maxIndex = i;
				}
		}
		if (maxIndex != LEN - k)
		{
			e = sz[maxIndex];
			sz[maxIndex] = sz[LEN - k];
			sz[LEN - k] = e;
		}
	}
	k = 0;
	for (i = 0;i < LEN;i++)
	{
	if (sz[i] % 2 != 0)
	{
	js[k] = sz[i];
	k++;
	}
	}
	if (k < 2)
	{
	for (i = 0;i < k;i++)
	{
	System.out.printf("%d",js[i]);
	}
	}
	if (k > 1)
	{
	for (i = 0;i < k - 1;i++)
	{
	System.out.printf("%d,",js[i]);
	}
	System.out.printf("%d",js[k - 1]);
	}
	return 0;
	}
}

