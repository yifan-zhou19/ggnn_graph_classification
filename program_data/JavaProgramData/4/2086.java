package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[][] n = new int[100][100];
	int i;
	int j;
	int a;
	int b;
	int x;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		b = Integer.parseInt(tempVar2);
	}
	for (i = 0;i < a;i++)
	{
	for (j = 0;j < b;j++)
	{
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		n[i][j] = Integer.parseInt(tempVar3);
	}
	}
	}
	for (int m = 0;m < b;m++)
	{
		int c = 0;
		for (i = m;i >= 0 && c < a;i--, c++)
		{
			System.out.printf("%d\n",n[c][i]);
		}
	}
	 int y;

	for (x = 1;x < a;x++)
	{
		 y = b - 1;
		for (j = x;j < a && y >= 0;j++, y--)
		{
		 System.out.printf("%d\n",n[j][y]);
		}
	}
	int z;
	String tempVar4 = ConsoleInput.scanfRead();
	if (tempVar4 != null)
	{
		z = Integer.parseInt(tempVar4);
	}
	return 0;
	}




}

