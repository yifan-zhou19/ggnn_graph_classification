package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] sz = new int[4000];
		int[] az = new int[4000];
	int i = 0;
	int n;
	int m;
	int h = 1;
	int t = 0;
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
			az[i] = Integer.parseInt(tempVar2);
		}
	if ((az[i]) % 2 != 0)
	{
		sz[t] = az[i];
		t++;
	}
	}
	for (h = 1;h < t;h++)
	{
		i = 0;
	for (i = 0;i < t - h;i++)
	{
		if (sz[i] > sz[i + 1])
		{
			m = sz[i + 1];
	sz[i + 1] = sz[i];
	sz[i] = m;
		}
	}
	}
	i = 1;
		for (i = 0;i < t - 1;i++)
		{
			System.out.printf("%d,",sz[i]);
		}
		System.out.printf("%d",sz[t - 1]);
		return 0;
	}

}

