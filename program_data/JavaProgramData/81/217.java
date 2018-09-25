package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[][] a = new int[5][5];
	int i;
	int n;
	int m;
	int e;
	int j;
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
	if (n > 4 || n < 0 || m>4 || m < 0)
	{
	System.out.print("error");
	}
	else
	{
	for (i = 0;i < 5;i++)
	{
	e = a[m][i];
	a[m][i] = a[n][i];
	a[n][i] = e;
	}
	System.out.printf("%d %d %d %d %d\n",a[0][0],a[0][1],a[0][2],a[0][3],a[0][4]);
	System.out.printf("%d %d %d %d %d\n",a[1][0],a[1][1],a[1][2],a[1][3],a[1][4]);
	System.out.printf("%d %d %d %d %d\n",a[2][0],a[2][1],a[2][2],a[2][3],a[2][4]);
	System.out.printf("%d %d %d %d %d\n",a[3][0],a[3][1],a[3][2],a[3][3],a[3][4]);
	System.out.printf("%d %d %d %d %d\n",a[4][0],a[4][1],a[4][2],a[4][3],a[4][4]);
	}
	return 0;
	}

}

