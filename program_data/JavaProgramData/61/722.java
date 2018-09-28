package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[] sz = new int[30];
	int[] zs = new int[25];
	sz[0] = 1;
	sz[1] = 1;
	for (int i = 2;i < 30;i++)
	{
	sz[i] = sz[i - 1] + sz[i - 2];
	}
	int n;
	int c;
	int q;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (int j = 0;j < n;j++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		(zs[j]) = Integer.parseInt(tempVar2);
	}
	}
	for (int w = 0;w < n;w++)
	{
	c = zs[w];
	q = sz[c - 1];
	System.out.printf("%d\n",q);
	}
	}

}

