package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int a;
	int c;
	int i;
	int j;
	int k = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		c = Integer.parseInt(tempVar2);
	}
	int[][] b = new int[100][100];
	for (i = 0;i < 100;i++)
	{
	for (j = 0;j < 100;j++)
	{
		b[i][j] = 0;
	}
	}
	for (i = 1;i <= a;i++)
	{
	for (j = 1;j <= c;j++)
	{
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b[i][j] = Integer.parseInt(tempVar3);
		}
	}
	}
	for (i = 1;i <= a;i++)
	{
	for (j = 1;j <= c;j++)
	{
	if (b[i][j] >= (b[i][j - 1]) && b[i][j] >= (b[i - 1][j]) && b[i][j] >= (b[i][j + 1]) && b[i][j] >= (b[i + 1][j]))
	{
	System.out.printf("%d %d\n",i - 1,j - 1);
	}
	}
	}
	return 0;
	}

}

