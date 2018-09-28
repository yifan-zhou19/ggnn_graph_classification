package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int k;
	int i;
	int[] sz = new int[100];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	i = 0;
	k = n - 1;
	while (i < n)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		sz[i] = Integer.parseInt(tempVar2);
	}
	i++;
	}
	while (k >= 0)
	{
		if (k != 0)
		{
		System.out.printf("%d ",sz[k]);
		}
		else
		{
			System.out.printf("%d",sz[k]);
		}
		k--;
	}
	return 0;
	}

}

