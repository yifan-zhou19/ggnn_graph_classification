package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[][] a = new int[5][5];
	int i;
	int j;
	int n;
	int m;
	int e;
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
	if (n > 4 || m > 4 || n < 0 || m < 0)
	{
		System.out.print("error");
	}
	else
	{
		for (j = 0;j < 5;j++)
		{
		e = a[n][j];
		a[n][j] = a[m][j];
		a[m][j] = e;
		}

	for (i = 0;i < 5;i++)
	{
		for (j = 0;j < 5;j++)
		{
	System.out.printf("%d",a[i][j]);
	if (j == 4)
	{
		System.out.print("\n\n");
	}
	else
	{
		System.out.print(" ");
	}
		}
	}
	}

	return 0;
	}
}

