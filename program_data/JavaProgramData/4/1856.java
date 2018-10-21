package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[][] a = new int[100][100];
	int m;
	int n;
	int i;
	int j;
	int k;
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



	for (i = 0; i < m; i++)
	{
	for (j = 0; j < n; j++)
	{
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		a[i][j] = Integer.parseInt(tempVar3);
	}
	}
	}
	for (k = 0; k < n; k++)
	{
	for (i = 0, j = k; i < m && j >= 0; i++, j--)
	{
	System.out.printf("%d\n", a[i][j]);
	}
	}
	for (k = 1; k < m; k++)
	{
	for (i = k, j = n - 1; i < m && j >= 0; i++, j--)
	{
	System.out.printf("%d\n", a[i][j]);
	}
	}
	return 0;
	}

	public static int main_e4_6_for()
	{
	int[][] a = new int[100][100];
	int m;
	int n;
	int i;
	int j;
	int k;
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
	for (i = 0; i < m; i++)
	{
	for (j = 0; j < n; j++)
	{
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		a[i][j] = Integer.parseInt(tempVar3);
	}
	}
	}
	for (k = 0; k < (m + n - 1); k++)
	{
	for (i = e46max(0, k - n + 1), j = e46min(k, n - 1); i < m && j >= 0; i++, j--)
	{
	System.out.printf("%d\n", a[i][j]);
	}
	}
	return 0;
	}

}

