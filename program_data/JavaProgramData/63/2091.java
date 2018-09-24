package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int z;
	int xa;
	int ya;
	int x;
	int y;
	int xb;
	int yb;

	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		xa = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		ya = Integer.parseInt(tempVar2);
	}
	int[][] a = new int[100][100];


	for (x = 0;x < xa;x++)
	{
		  for (y = 0;y < ya - 1;y++)
		  {
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[x][y] = Integer.parseInt(tempVar3);
				}
		  }
		  String tempVar4 = ConsoleInput.scanfRead();
		  if (tempVar4 != null)
		  {
			  a[x][ya - 1] = Integer.parseInt(tempVar4);
		  }
	}

	String tempVar5 = ConsoleInput.scanfRead();
	if (tempVar5 != null)
	{
		xb = Integer.parseInt(tempVar5);
	}
	String tempVar6 = ConsoleInput.scanfRead(" ");
	if (tempVar6 != null)
	{
		yb = Integer.parseInt(tempVar6);
	}
	int[][] b = new int[100][100];


	for (x = 0;x < xb;x++)
	{
		  for (y = 0;y < yb - 1;y++)
		  {
				String tempVar7 = ConsoleInput.scanfRead();
				if (tempVar7 != null)
				{
					b[x][y] = Integer.parseInt(tempVar7);
				}
		  }
		  String tempVar8 = ConsoleInput.scanfRead();
		  if (tempVar8 != null)
		  {
			  b[x][yb - 1] = Integer.parseInt(tempVar8);
		  }
	}

	int[][] c = new int[100][100];
	for (x = 0;x < xa - 1;x++)
	{
		  for (y = 0;y < yb - 1;y++)
		  {
				c[x][y] = 0;
				for (z = 0;z < ya;z++)
				{
					  c[x][y] = c[x][y] + a[x][z] * b[z][y];
				}
				System.out.printf("%d ",c[x][y]);
		  }
		  c[x][yb - 1] = 0;
		  for (z = 0;z < ya;z++)
		  {
				c[x][yb - 1] = c[x][yb - 1] + a[x][z] * b[z][y];
		  }
		  System.out.printf("%d\n",c[x][yb - 1]);
	}

		  for (y = 0;y < yb - 1;y++)
		  {
				c[xa - 1][y] = 0;
				for (z = 0;z < ya;z++)
				{
					  c[xa - 1][y] = c[xa - 1][y] + a[xa - 1][z] * b[z][y];
				}
				System.out.printf("%d ",c[xa - 1][y]);
		  }
		  c[xa - 1][yb - 1] = 0;
		  for (z = 0;z < ya;z++)
		  {
				c[xa - 1][yb - 1] = c[xa - 1][yb - 1] + a[xa - 1][z] * b[z][y];
		  }
				System.out.printf("%d",c[xa - 1][yb - 1]);

	}

}

