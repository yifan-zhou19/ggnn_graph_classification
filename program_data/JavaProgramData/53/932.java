package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[] sz = new int[300];
	int n;
	int i;
	int k;
	int a;
	int b;
	int m = 1;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		(sz[0]) = Integer.parseInt(tempVar2);
	}
	for (i = 1;i < n;i++)
	{
		b = 0;
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			a = Integer.parseInt(tempVar3);
		}
		for (k = 0;k < m;k++)
		{
			if (sz[k] == a)
			{
				b++;
			}
		}
		if (b == 0)
		{
			sz[m] = a;
			m++;
		}
	}
	System.out.printf("%d",sz[0]);
	for (i = 1;i < m;i++)
	{
	System.out.printf(",%d",sz[i]);
	}
	return 0;
	}

}

