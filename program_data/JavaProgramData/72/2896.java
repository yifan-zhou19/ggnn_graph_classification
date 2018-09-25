package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int m;
	int n;
	int i;
	int j;
	int temp1;
	int temp2;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		m = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		n = Integer.parseInt(tempVar2);
	}
	int[][] a = new int[30][30];
	for (i = 0;i < 30;i++)
	{
		for (j = 0;j < 30;j++)
		{
		a[i][j] = 0;
		}
	}
	for (i = 1;i <= m;i++)
	{
		for (j = 1;j <= n;j++)
		{
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			a[i][j] = Integer.parseInt(tempVar3);
		}
		}
	}
	for (i = 1;i <= m;i++)
	{
		for (j = 1;j <= n;j++)
		{
		if (a[i][j] >= a[i - 1][j] != 0 && a[i][j] >= a[i][j - 1] != 0 && a[i][j] >= a[i + 1][j] != 0 && a[i][j] >= a[i][j + 1])
		{
			temp1 = i - 1;
			temp2 = j - 1;
			System.out.printf("%d %d\n",temp1,temp2);
		}
		}
	}
	}
}

