package <missing>;

public class GlobalMembers
{
	public static int f(int n,int m)
	{
	if (n >= 0 && n <= 4 && m >= 0 && m < 5)
	{
	return 1;
	}
	else
	{
		return 0;
	}
	}
	public static int Main()
	{
	int[][] a = new int[5][5];
	int m;
	int n;
	int i;
	int j;
	int k;
	int s;
	for (i = 0;i < 5;i++)
	{
	for (j = 0;j < 5;j++)
	{
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a[i][j] = Integer.parseInt(tempVar);
	}
	}
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		n = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		m = Integer.parseInt(tempVar3);
	}
	k = f(n, m);
	if (k == 0)
	{
		System.out.print("error");
	}
	else
	{
	for (i = 0;i < 5;i++)
	{
	s = a[n][i];
	a[n][i] = a[m][i];
	a[m][i] = s;
	}
	for (i = 0;i < 5;i++)
	{
	System.out.printf("%d %d %d %d %d\n",a[i][0],a[i][1],a[i][2],a[i][3],a[i][4]);
	}
	}
	return 0;
	}



}

