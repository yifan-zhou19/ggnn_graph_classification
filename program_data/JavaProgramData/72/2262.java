package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int m;
	int n;
	int i;
	int j;
	int[][] A = new int[20][20];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		m = Integer.parseInt(tempVar2);
	}
	for (i = 0;i < n;i++)
	{
	for (j = 0;j < m;j++)
	{
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		A[i][j] = Integer.parseInt(tempVar3);
	}
	}
	}
	for (i = 0;i < n;i++)
	{
	if (i == 0)
	{
	if (A[0][0] >= A[0][1] != 0 && A[0][0] >= A[1][0])
	{
		System.out.print("0 0\n");
	}
	for (j = 1;j < m - 1;j++)
	{
	if (A[0][j] >= A[0][j - 1] != 0 && A[0][j] >= A[1][j] != 0 && A[0][j] >= A[0][j + 1])
	{
	System.out.printf("0 %d\n",j);
	}
	}
	if (A[0][m - 1] >= A[0][m - 2] != 0 && A[0][m - 1] >= A[1][m - 1])
	{
		System.out.printf("0 %d\n",m - 1);
	}
	}
	else if (i != 0 && i != n - 1)
	{
	if (A[i][0] >= A[i - 1][0] != 0 && A[i][0] >= A[i + 1][0] != 0 && A[i][0] >= A[i][1])
	{
		System.out.printf("%d 0\n",i);
	}
	for (j = 1;j < m - 1;j++)
	{
	if (A[i][j] >= A[i - 1][j] != 0 && A[i][j] >= A[i][j - 1] != 0 && A[i][j] >= A[i + 1][j] != 0 && A[i][j] >= A[i][j + 1])
	{
	System.out.printf("%d %d\n",i,j);
	}
	}
	if (A[i][m - 1] >= A[i][m - 2] != 0 && A[i][m - 1] >= A[i + 1][m - 1] != 0 && A[i][m - 1] >= A[i - 1][m - 1])
	{
		System.out.printf("%d %d\n",i,m - 1);
	}
	}
	else if (i == n - 1)
	{
	if (A[n - 1][0] >= A[n - 2][0] != 0 && A[n - 1][0] >= A[n - 1][1])
	{
		System.out.printf("%d 0\n",n - 1);
	}
	for (j = 1;j < m - 1;j++)
	{
	if (A[n - 1][j] >= A[n - 2][j] != 0 && A[n - 1][j] >= A[n - 1][j - 1] != 0 && A[n - 1][j] >= A[n - 1][j + 1])
	{
	System.out.printf("%d %d\n",i,j);
	}
	}
	if (A[n - 1][m - 1] >= A[n - 1][m - 2] != 0 && A[n - 1][m - 1] >= A[n - 2][m - 1])
	{
		System.out.printf("%d %d\n",n - 1,m - 1);
	}

	}
	}
	return 0;
	}
}

