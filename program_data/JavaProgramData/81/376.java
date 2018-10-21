package <missing>;

public class GlobalMembers
{
	public static int f(int x,int y)
	{
		int z;
	if (x >= 0 && x <= 4 && y >= 0 && y <= 4)
	{
	z = 1;
	}
	else
	{
	z = 0;
	}
	return z;
	}
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		int[][] a = new int[5][5];
		(int)(*p)[5];
	p = a;
	for (i = 0;i < 5;i++)
	{
		for (j = 0;j < 5;j++)
		{
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		*(p + i) + j = tempVar;
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
	if (f(m, n) == 0)
	{
	System.out.print("error");
	}
	else
	{
		for (i = 0;i < n;i++)
		{
		System.out.printf("%d",p[i][0]);
		for (j = 1;j < 5;j++)
		{
	System.out.printf(" %d",p[i][j]);
		}
	System.out.print("\n");
		}
	System.out.printf("%d",p[m][0]);
	for (j = 1;j < 5;j++)
	{
	System.out.printf(" %d",p[m][j]);
	}
	System.out.print("\n");
	for (i = n + 1;i < m;i++)
	{
		System.out.printf("%d",p[i][0]);
		for (j = 1;j < 5;j++)
		{
	System.out.printf(" %d",p[i][j]);
		}
	System.out.print("\n");
	}
	System.out.printf("%d",p[n][0]);
	for (j = 1;j < 5;j++)
	{
	System.out.printf(" %d",p[n][j]);
	}
	System.out.print("\n");
	for (i = m + 1;i < 5;i++)
	{
		System.out.printf("%d",p[i][0]);
		for (j = 1;j < 5;j++)
		{
	System.out.printf(" %d",p[i][j]);
		}
	System.out.print("\n");
	}
	}
	return 0;
	}

}

