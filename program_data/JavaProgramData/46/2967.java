package <missing>;

public class GlobalMembers
{
	public static final int[] x = {0, 0, 1, 0, -1};
	public static final int[] y = {0, 1, 0, -1, 0};
	public static int[][] f = new int[1000][1000];
	public static int Main()
	{
	int m;
	int n;
	int k = 1;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		m = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		n = Integer.parseInt(tempVar2);
	}
	for (int i = 1; i <= m; i++)
	{
	for (int j = 1; j <= n; j++)
	{
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		f[i][j] = Integer.parseInt(tempVar3);
	}
	}
	}
	int dx = 1;
	int dy = 1;
	int dm = m;
	int dn = n;
	int cm = 1;
	int cn = 1;
	int count = 0;
	while (count < (m * n))
	{
	System.out.printf("%d\n",f[dx][dy]);
	count++;
	int tx = dx + x[k];
	int ty = dy + y[k];
	if ((tx > dm) || (tx < cm) || (ty> dn) || (ty < cn))
	{
	if (k == 1)
	{
		cm++;
	}
	else
	{
	if (k == 2)
	{
		dn--;
	}
	else
	{
	if (k == 3)
	{
		dm--;
	}
	else
	{
	if (k == 4)
	{
		cn++;
	}
	}
	}
	}
	k = (k % 4) + 1;
	tx = dx + x[k];
	ty = dy + y[k];
	}
	dx = tx;
	dy = ty;
	}
	//while(1);
	return 0;
	}

}

