package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int a;
	int[] sz = new int[30];
	int i;
	int j;
	int t;
	int e;
	i = 1;
	j = 1;
	sz[0] = 1;
	sz[1] = 1;
	for (t = 2;t < 30;t++)
	{
		sz[t] = i + j;
		e = i;
		i = i + j;
		j = e;
	}
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (t = 0;t < n;t++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = Integer.parseInt(tempVar2);
		}
		System.out.printf("%d\n",sz[a - 1]);
	}
	return 0;
	}
}

