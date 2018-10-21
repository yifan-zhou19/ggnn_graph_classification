package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[] sz = new int[100000];
	int n;
	int i;
	int k;
	int max;

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
			sz[i] = Integer.parseInt(tempVar2);
		}
	}

	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		k = Integer.parseInt(tempVar3);
	}

	if (n == 1)
	{
		max = 0;
	}
	else
	{

	for (i = 0;i < (n - 1);i++)
	{

		if (sz[i] != k && sz[i + 1] == k)
		{
			max = i;
		}
		else if (sz[i + 1] != k)
		{
			max = i + 1;
		}
	}
	}

	for (i = 0;i < n;i++)
	{
		if (sz[i] != k && i != max)
		{
			System.out.printf("%d ",sz[i]);
		}
		else if (sz[i] != k && i == max)
		{
			System.out.printf("%d",sz[i]);
		}
	}

	return 0;

	}
}

