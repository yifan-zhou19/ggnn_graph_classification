package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int[][] a = new int[5][5];
	int i;
	int j;
	int m;
	int k;
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
	if (m >= 0 && n < 5 && m < 5 && n >= 0)
	{
	for (i = 0;i < 5;i++)
	{
		k = a[m][i];
		a[m][i] = a[n][i];
		a[n][i] = k;
	}
	for (i = 0;i < 5;i++)
	{
		for (j = 0;j < 5;j++)
		{
	if (j <= 3)
	{
	System.out.printf("%d ",a[i][j]);
	}
	else
	{
		System.out.printf("%d\n",a[i][j]);
	}
		}
	}
	return 1;
	}
	else
	{
		System.out.print("error");
	}


	return 0;
	}

}

