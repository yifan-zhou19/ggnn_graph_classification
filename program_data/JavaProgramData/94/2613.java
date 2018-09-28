package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int N;
	int i;
	int[] sz = new int[500];
	int m = 0;
	int e;
	int[] js = new int[500];
	int j;
	int p;
	int k;
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
	j = 0;
	p = 0;
	for (i = 0;i < N;i++)
	{
		if (sz[i] % 2 != 0)
		{
			js[j] = sz[i];
			j++;
			p++;
		}
	}
	m = 0;
	for (k = 1;k <= p;k++)
	{
		m = 0;
		for (j = 0;j <= p - k;j++)
		{
			if (js[j] > js[m])
			{
			m = j;
			}
		}
		if (m != p - k)
		{
			e = js[m];
			js[m] = js[p - k];
			js[p - k] = e;
		}
	}
	for (j = 0;j < p - 1;j++)
	{
	System.out.printf("%d,",js[j]);
	}
	System.out.printf("%d",js[p - 1]);
	return 0;
	}

}

