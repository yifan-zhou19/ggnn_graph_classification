package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[][] a = new int[1000][1000];
	int[][] b = new int[1000][1000];
	int[][] c = new int[1000][1000];
	int x1;
	int y1;
	int x2;
	int y2;
	int i;
	int j;
	int h;
	for (i = 0;i < 1000;i++)
	{
		for (j = 0;j < 1000;j++)
		{
			c[i][j] = 0;
		}
	}
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		x1 = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		y1 = Integer.parseInt(tempVar2);
	}
	for (i = 0;i <= x1 - 1;i++)
	{
		for (j = 0;j <= y1 - 1;j++)
		{
			  String tempVar3 = ConsoleInput.scanfRead();
			  if (tempVar3 != null)
			  {
				  a[i][j] = Integer.parseInt(tempVar3);
			  }
		}
	}
	String tempVar4 = ConsoleInput.scanfRead();
	if (tempVar4 != null)
	{
		x2 = Integer.parseInt(tempVar4);
	}
	String tempVar5 = ConsoleInput.scanfRead(" ");
	if (tempVar5 != null)
	{
		y2 = Integer.parseInt(tempVar5);
	}
	for (i = 0;i <= x2 - 1;i++)
	{
		for (j = 0;j <= y2 - 1;j++)
		{
			  String tempVar6 = ConsoleInput.scanfRead();
			  if (tempVar6 != null)
			  {
				  b[i][j] = Integer.parseInt(tempVar6);
			  }
		}
	}


	for (i = 0;i <= x1 - 1;i++)
	{
		for (j = 0;j <= y2 - 1;j++)
		{
			if (j == y2 - 1)
			{
			for (h = 0;h <= x2 - 1;h++)
			{
			c[i][j] = c[i][j] + a[i][h] * b[h][j];
			}
			System.out.printf("%d\n",c[i][j]);
			}
			else
			{
			for (h = 0;h <= x2 - 1;h++)
			{
			c[i][j] = c[i][j] + a[i][h] * b[h][j];
			}
			System.out.printf("%d ",c[i][j]);
			}
		}
	}
	}
}

