package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int x1;
	int y1;
	int x2;
	int y2;
	int[][] a = new int[101][101];
	int[][] b = new int[101][101];
	int[][] c = new int[101][101];
	int i;
	int j;
	int p;
	int q;
	int circ;
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
	for (i = 0;i < x1;i++)
	{
	for (j = 0;j < y1;j++)
	{
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		(a[i][j]) = Integer.parseInt(tempVar3);
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
	for (p = 0;p < x2;p++)
	{
	for (q = 0;q < y2;q++)
	{
	String tempVar6 = ConsoleInput.scanfRead();
	if (tempVar6 != null)
	{
		(b[p][q]) = Integer.parseInt(tempVar6);
	}
	}
	}
	for (i = 0;i < x1;i++)
	{
	for (q = 0;q < y2;q++)
	{
	for (circ = 0;circ < y1;circ++)
	{
	c[i][q] += a[i][circ] * b[circ][q];
	}
	System.out.printf("%d",c[i][q]);
	if (q < y2 - 1)
	{
	System.out.print(" ");
	}
	else
	{
	System.out.print("\n");
	}
	}
	}
	return 0;
	}
}

