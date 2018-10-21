package <missing>;

public class GlobalMembers
{
	public static void scan(int x1, int y1, int[][] a)
	{
	 int i;
	 int j;
	 for (i = 0;i < x1;i++)
	 {
			for (j = 0;j < y1;j++)
			{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i][j] = Integer.parseInt(tempVar);
			}
			}
	 }


	}

	public static int multi(int i, int j, int s, int[][] a, int[][] b)
	{
	if (s == 0)
	{
	return a[i][0] * b[0][j];
	}
	if (s > 0)
	{
	return a[i][s] * b[s][j] + multi(i, j, s - 1, a, b);
	}
	}


	public static int Main()

	{
	int x1;
	int y1;
	int x2;
	int y2;
	int i;
	int j;
	int k;
	int s;
	int[][] a = new int[100][100];
	int[][] b = new int[100][100];
	int[][] c = new int[100][100];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		x1 = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		y1 = Integer.parseInt(tempVar2);
	}
	scan(x1, y1, a);
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		x2 = Integer.parseInt(tempVar3);
	}
	String tempVar4 = ConsoleInput.scanfRead();
	if (tempVar4 != null)
	{
		y2 = Integer.parseInt(tempVar4);
	}
	scan(x2, y2, b);
	s = x2 - 1;
	for (i = 0;i < x1;i++)
	{
			for (j = 0;j < y2;j++)
			{
						c[i][j] = multi(i, j, s, a, b);
			}
	}


	for (i = 0;i < x1;i++)
	{

			System.out.printf("%d",c[i][0]);
			for (j = 1;j < y2;j++)
			{
						System.out.printf(" %d",c[i][j]);
			}
			System.out.print("\n");
	}
	return 0;
	}
}

