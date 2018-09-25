package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[][] a = new int[100][100];
	int n;
	int t;
	int i;
	int k = 0;
	int j;
	int b;
	int c;
	int d;
	int e;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i < n;i++)
	{
	for (j = 0;j < n;j++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		a[i][j] = Integer.parseInt(tempVar2);
	}
	if (a[i][j] == 0 && k == 0)
	{
	b = i;
	c = j;
	k++;
	}
	}
	}
	for (i = n - 1;i >= 0;i--)
	{
	for (j = n - 1;j >= 0;j--)
	{
	if (a[i][j] == 0 && k == 1)
	{
	d = i;
	e = j;
	k++;
	}
	}
	}
	t = (d - b - 1) * (e - c - 1);
	System.out.printf("%d\n",t);
	return 0;
	}


}

