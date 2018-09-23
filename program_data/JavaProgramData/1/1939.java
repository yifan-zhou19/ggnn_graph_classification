package <missing>;

public class GlobalMembers
{
	public static int t;
	public static int Main()
	{
		int n;
		int i;
		int[] a = new int[100];
	void fenjie(int x,int y);
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
		a[i] = Integer.parseInt(tempVar2);
	}
	}
	for (i = 0;i < n;i++)
	{
		t = 0;
	fenjie(2, a[i]);
	System.out.printf("%d\n",t);
	}
	return 0;
	}

	public static void fenjie(int x,int y)
	{
		int j;
	if (y == 1)
	{
	t++;
	return;
	}
	for (j = x;j <= y;j++)
	{
		if (y % j == 0)
		{
	fenjie(j, y / j);
		}
	}

	}



}

