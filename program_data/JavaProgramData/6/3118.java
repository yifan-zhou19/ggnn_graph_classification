package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int k;
	int i;
	int e;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		k = Integer.parseInt(tempVar);
	}
	for (i = 0;i < k;i++)
	{
	int a;
	int b;
	int c;
	int d;
	int total;
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		a = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		b = Integer.parseInt(tempVar3);
	}
	if (a == 1 && b == 1)
	{
	String tempVar4 = ConsoleInput.scanfRead();
	if (tempVar4 != null)
	{
		c = Integer.parseInt(tempVar4);
	}
	System.out.printf("%d",c);
	}
	else
	{
	int[][] sz = new int[a][b];
	for (c = 0;c < a;c++)
	{
	for (d = 0;d < b - 1;d++)
	{
	String tempVar5 = ConsoleInput.scanfRead();
	if (tempVar5 != null)
	{
		sz[c][d] = Integer.parseInt(tempVar5);
	}
	}
	String tempVar6 = ConsoleInput.scanfRead();
	if (tempVar6 != null)
	{
		sz[c][b - 1] = Integer.parseInt(tempVar6);
	}
	}
	total = 0;
	for (c = 0;c < a;c++)
	{
	total = total + sz[c][0];
	total = total + sz[c][b - 1];
	}
	for (c = 0;c < b;c++)
	{
	total = total + sz[0][c];
	total = total + sz[a - 1][c];
	}
	total = total - sz[0][0];
	total = total - sz[0][b - 1];
	total = total - sz[a - 1][0];
	total = total - sz[a - 1][b - 1];
	System.out.printf("%d\n",total);
	}
	}
	return 0;
	}
}

