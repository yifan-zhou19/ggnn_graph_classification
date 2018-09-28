package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int k;
	int m;
	int[] sz = new int[100];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	m = n / 2;
	for (i = 0;i < n;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		sz[i] = Integer.parseInt(tempVar2);
	}
	}
	for (i = 0;i < m;i++)
	{
	k = sz[i];
	sz[i] = sz[n - i - 1];
	sz[n - i - 1] = k;
	}
	for (i = 0;i < n;i++)
	{
		if (i < n - 1)
		{
		System.out.printf("%d ",sz[i]);
		}
	   else
	   {
		   System.out.printf("%d",sz[i]);
	   }
	}

	return 0;
	}


}

