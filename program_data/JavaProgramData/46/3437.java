package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[][] sz = new int[155][155];

	int i;
	int j;
	int p;
	int q;
	int c = 0;
	int a;
	int b;
	int col;
	int row;

	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		row = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		col = Integer.parseInt(tempVar2);
	}
	for (i = 0;i < row;i++)
	{
		for (j = 0;j < col;j++)
		{
		 String tempVar3 = ConsoleInput.scanfRead();
		 if (tempVar3 != null)
		 {
			 (sz[i][j]) = Integer.parseInt(tempVar3);
		 }
		}
	}
	p = 0,q = 0,a = col,b = row;
	while (true)
	{
	for (i = p,j = p;j <= p + a - 1;j++)
	{
	if (c >= col * row)
	{
	break;
	}
	System.out.printf("%d\n",sz[i][j]);
	c++;

	}
	for (j = p + a - 1,i = q + 1;i <= q + b - 2;i++)
	{
	if (c >= col * row)
	{
	break;
	}
	System.out.printf("%d\n",sz[i][j]);
	c++;

	}
	for (i = q + b - 1,j = p + a - 1;j >= p;j--)
	{
	if (c >= col * row)
	{
	break;
	}
	System.out.printf("%d\n",sz[i][j]);
	c++;

	}
	for (j = p,i = q + b - 2;i >= q + 1;i--)
	{
	if (c >= col * row)
	{
	break;
	}
	System.out.printf("%d\n",sz[i][j]);
	c++;

	}

	a -= 2,b -= 2;
	p++,q++;
	if (c >= col * row)
	{
	break;
	}
	}

	return 0;
	}

}

