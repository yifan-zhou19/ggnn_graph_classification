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
	if (m <= 4 && n <= 4)
	{
	for (int i = 0;i < 5;i++)
	{
	b = sz[m][i];
	sz[m][i] = sz[n][i];
	sz[n][i] = b;
	}
	for (int p = 0;p <= 4;p++)
	{
	for (int q = 0;q <= 3;q++)
	{
	System.out.printf("%d ",sz[p][q]);
	}
	System.out.printf("%d\n",sz[p][4]);
	}
	}
	else
	{
	System.out.print("error");
	}
	return 0;
	}


}

