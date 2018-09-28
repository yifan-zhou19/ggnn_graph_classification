package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	int[] ss = new int[n];
	int[] sz = new int[n];
	int i = 0;
	int[] zc = new int[n];
	for (i = 0;i < n;i++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			(ss[i]) = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			(sz[i]) = Integer.parseInt(tempVar3);
		}
		zc[i] = 0;
	}
	int j = 0;
	int zui = 0;
	for (i = 0;i < n;i++)
	{
		 if ((ss[i] >= 90) && (ss[i] <= 140) && (sz[i] <= 90) && (sz[i] >= 60))
		 {
			 zc[j]++;
		 }
		 else
		 {
			 j++;
		 }
	}
	for (i = 0;i < n;i++)
	{
		if (zc[i] > zui)
		{
			zui = zc[i];
		}
	}
	System.out.printf("%d",zui);
	return 0;
	}

}

