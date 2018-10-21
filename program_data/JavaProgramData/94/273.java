package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] s = new int[10000];
		int[] st = new int[10000];
		int N;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		int j = 0;
		for (int ii = 0;ii < N;ii++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s[ii] = Integer.parseInt(tempVar2);
		}
		if (s[ii] % 2 != 0)
		{
		st[j] = s[ii];
		j++;
		}
		}
	int e;
	for (int k = 1 ; k <= j ; k++)
	{
		for (int i = 0; i < j - k; i++)
		{
				if (st[i] > st[i + 1])
				{
						e = st[i + 1];
						st[i + 1] = st[i];
						st[i] = e;
				}
		}
	}
	for (int h = 0;h < j - 1;h++)
	{
	System.out.printf("%d,",st[h]);
	}
	System.out.printf("%d",st[j - 1]);
	return 0;
	}
}

