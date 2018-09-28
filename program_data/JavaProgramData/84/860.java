package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int r;
	int fm;
	int sm;
	int[] shu = new int[100];
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
		shu[i] = Integer.parseInt(tempVar2);
	}
	}
	for (i = n - 1;i > 0;i--)
	{
	for (r = 0;r < i;r++)
	{
	if (shu[r] > shu[r + 1])
	{
	int tmp;
	tmp = shu[r + 1];
	shu[r + 1] = shu[r];
	shu[r] = tmp;
	}
	}
	}
	fm = shu[n - 1];
	sm = shu[n - 2];
	System.out.printf("%d\n",fm);
	System.out.printf("%d\n",sm);
	return 0;
	}


}

