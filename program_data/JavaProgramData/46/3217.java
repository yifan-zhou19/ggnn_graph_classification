package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[][] m1 = new int[100][100];
	int i;
	int j;
	int k;
	int a;
	int b;
	int c = 0;
	int d;
	int e;
	int x = -1;
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
	e = a;
	d = b;
	for (i = 0;i < a;i++)
	{
	  for (j = 0;j < b - 1;j++)
	  {
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			m1[i][j] = Integer.parseInt(tempVar3);
		}
	  }
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			m1[i][b - 1] = Integer.parseInt(tempVar4);
		}
	}
	for (k = 1;k < 100000;k++)
	{
	x = x + 1;
	for (j = x;j < b - x;j++)
	{
	System.out.printf("%d\n",m1[x][j]);
	c += 1;
	}
	if (c == d * e)
	{
		break;
	}
	for (i = x + 1;i < a - x;i++)
	{
	System.out.printf("%d\n",m1[i][b - x - 1]);
	c += 1;
	}
	if (c == d * e)
	{
		break;
	}
	for (j = 2 + x;j < b + 1 - x;j++)
	{
	System.out.printf("%d\n",m1[a - 1 - x][b - j]);
	c += 1;
	}
	if (c == d * e)
	{
		break;
	}
	for (i = 2 + x;i < a - x;i++)
	{
	System.out.printf("%d\n",m1[a - i][x]);
	c += 1;
	}
	if (c == e * d)
	{
		break;
	}
	}
	return 0;
	}

}

