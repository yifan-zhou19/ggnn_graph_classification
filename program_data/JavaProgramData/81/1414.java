package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int decide = new int(int x,int y);
	int i;
	int j;
	int m;
	int n;
	int b;
	int[][] a = new int[6][5];
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
		m = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		n = Integer.parseInt(tempVar3);
	}
	b = decide(m, n);

	if (b == 0)
	{
	System.out.print("error");
	}
	else
	{
		for (j = 0;j < 5;j++)
		{
		a[5][j] = a[n][j];
		a[n][j] = a[m][j];
		a[m][j] = a[5][j];
		}
	for (i = 0;i < 5;i++)
	{
	for (j = 0;j < 5;j++)
	{
		if (j != 4)
		{
			System.out.printf("%d ",a[i][j]);
		}
		if (j == 4)
		{
			System.out.printf("%d",a[i][j]);
		}
	}
	  System.out.print("\n");
	}
	}
	return 0;
	}


	public static int decide(int x,int y)
	{
		int b = 0;
	if (x >= 0)
	{
	if (x < 4)
	{
	if (y >= 0)
	{
	if (y < 4)
	{
	b = 1;
	}
	}
	}
	}
	return b;
	}
}

