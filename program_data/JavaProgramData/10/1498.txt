package <missing>;

public class GlobalMembers
{
	public static int[] b = new int[MAX_N + 10];
	public static int[] aMaxLen = new int[MAX_N + 10];
	public static int Main()
	{
		int N;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		for (i = N;i >= 1;i--)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				b[i] = Integer.parseInt(tempVar2);
			}
		}
		aMaxLen[1] = 1;
		for (i = 2; i <= N; i++)
		{
			int nTmp = 0;
			for (j = 1; j < i; j++)
			{
				if (b[i] >= b[j])
				{
					if (nTmp < aMaxLen[j])
					{
						nTmp = aMaxLen[j];
					}
				}
			}
			aMaxLen[i] = nTmp + 1;
		}
		int nMax = -1;
		for (i = 1;i <= N;i++)
		{
			if (nMax < aMaxLen[i])
			{
				nMax = aMaxLen[i];
			}
		}
		System.out.printf("%d\n", nMax);
		return 0;
	}
}

