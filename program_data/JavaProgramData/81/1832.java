package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int sw = new int(int a[5][5],int n,int m);
	int i;
	int j;
	int m;
	int n;
	int[][] a = new int[5][5];
	int q;
	int h;
	if (sw(a, n, m) == 0)
	{
		System.out.print("error");
	}
	else
	{
		for (q = 0;q < 5;q++)
		{
	for (h = 0;h < 4;h++)
	{
	System.out.printf("%d ",a[q][h]);
	}
	System.out.printf("%d",a[q][4]);
	System.out.print("\n");
		}
	}
	return 0;
	}



	public static int sw(int[][] a, int n, int m)
	{
		int i;
		int j;
		int q;
		int h;
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
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		m = Integer.parseInt(tempVar3);
	}
		int p;
		int t;

	if (n >= 0 && n < 5 && m >= 0 && m < 5)
	{
	for (p = 0;p < 5;p++)
	{
	t = a[n][p];
	a[n][p] = a[m][p];
	a[m][p] = t;
	}
	return 1;
	}
	return 0;


	}



}

