package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[] sz = new int[100000];
	int[] a = new int[100];
	int n;
	int i;
	int d;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i < 100;i++)
	{
		a[i] = 1;

	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		sz[0] = Integer.parseInt(tempVar2);
	}
	System.out.printf("%d",sz[0]);
	a[sz[0]] = 0;
	for (i = 1;i < n;i++)
	{
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			sz[i] = Integer.parseInt(tempVar3);
		}
			d = sz[i];
			if (a[d] != 0)
			{
				System.out.printf(" %d",sz[i]);
			}

		a[d] = 0;
	}


	return 0;

	}
}

