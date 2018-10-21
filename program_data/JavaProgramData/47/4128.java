package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	int[] sz1 = new int[100];
	int[] sz2 = new int[100];
	for (i = 0;i < n;i++)
	{
		if (i < n - 1)
		{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		sz1[i] = Integer.parseInt(tempVar2);
	}
	sz2[n - 1 - i] = sz1[i];
		}
	else if (i == n - 1)
	{
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			sz1[n - 1] = Integer.parseInt(tempVar3);
		}
		sz2[0] = sz1[n - 1];
	}
	}
	for (i = 0;i < n;i++)
	{
		if (i < n - 1)
		{
	System.out.printf("%d ",sz2[i]);
		}
		else if (i == n - 1)
		{
		System.out.printf("%d",sz2[n - 1]);
		}

	}
	return 0;
	}
}

