package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m = 0;
		int k;
	int i;
	int n;
	int j;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	j = n;
	int[] sz = new int[j];
	int[] ss = new int[j];
	for (i = 0;i < j;i++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			sz[i] = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			ss[i] = Integer.parseInt(tempVar3);
		}
	}
	for (i = 0;i < n;i++)
	{
		if (sz[i] >= 90 && sz[i] <= 140 && ss[i] >= 60 && ss[i] <= 90)
		{
			m++;
		}
		else
		{
			k = (k >= m)?k:m;
		m = 0;
		}
	}
		k = (k >= m)?k:m;

	System.out.printf("%d",k);
	return 0;
	}
}

