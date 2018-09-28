package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int k;
	int h;
	int l;
	int j;
	int[][] sz = new int[MAX][MAX];
	int[] jh = new int[MAX];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i < n;i++)
	{
	jh[i] = 0;
	}
	for (i = 0;i < n;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		h = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		l = Integer.parseInt(tempVar3);
	}
	for (j = 0;j < h;j++)
	{
	for (k = 0;k < l;k++)
	{
	String tempVar4 = ConsoleInput.scanfRead();
	if (tempVar4 != null)
	{
		sz[j][k] = Integer.parseInt(tempVar4);
	}
	}
	}
	for (k = 0;k < l;k++)
	{
	jh[i] += sz[0][k];
	jh[i] += sz[h - 1][k];
	}
	for (j = 1;j < h - 1;j++)
	{
	jh[i] += sz[j][0];
	jh[i] += sz[j][l - 1];
	}
	if (h == 1 && l == 1)
	{
	jh[i] -= sz[0][0];
	}
	}
	for (i = 0;i < n;i++)
	{
	System.out.printf("%d\n",jh[i]);
	}
	return 0;
	}
}

