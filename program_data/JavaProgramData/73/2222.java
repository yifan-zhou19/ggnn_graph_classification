package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int j;
	int k;
	int[][] a = new int[N][M];
	int max;
	int maxj;
	int flag;
	for (i = 0;i < N;i++)
	{
	for (j = 0;j < M;j++)
	{
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a[i][j] = Integer.parseInt(tempVar);
	}
	}
	}
	for (i = 0;i < N;i++)
	{
		max = a[i][0];
	maxj = 0;
	for (j = 0;j < M;j++)
	{
	if (a[i][j] > max)
	{
		max = a[i][j];
	maxj = j;
	}
	}

	flag = 1;

	for (k = 0;k < N;k++)
	{
	if (max > a[k][maxj])
	{
		flag = 0;
	continue;
	}
	}

	if (flag != 0)
	{
		System.out.printf("%d %d %d\n",i + 1,maxj + 1,max);
	break;
	}
	}
	if (flag == 0)
	{
	System.out.print("not found\n");
	}
	}
}

