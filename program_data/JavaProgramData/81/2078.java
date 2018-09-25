package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[][] sz = new int[5][5];
	int m;
	int n;
	int a;
	int b;
	for (int k = 0;k <= 4;k++)
	{
	for (int t = 0;t <= 4;t++)
	{
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		sz[k][t] = Integer.parseInt(tempVar);
	}
	}
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		m = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		n = Integer.parseInt(tempVar3);
	}
	if (m <= 4 && m >= 0 && n <= 4 && n >= 0)
	{
		a = 1;
	}
	else
	{
		a = 0;
	}
	if (a == 1)
	{
	for (int i = 0;i <= 4;i++)
	{
	b = sz[m][i];
	sz[m][i] = sz[n][i];
	sz[n][i] = b;
	}
	for (int p = 0;p <= 4;p++)
	{
		System.out.printf("%d", sz[p][0]);
	for (int q = 1;q <= 4;q++)
	{
	System.out.printf(" %d",sz[p][q]);
	}
	System.out.print("\n");
	}
	}
	if (a == 0)
	{
	System.out.print("error");
	}
	return 0;

	}


}

