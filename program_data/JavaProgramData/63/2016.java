package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[][] a = new int[100][100];
	int[][] b = new int[100][100];
	int[][] c = new int[100][100];
	int x1;
	int y1;
	int x2;
	int y2;
	int j1;
	int j2;
	int j3;
	int j4;
	int i1;
	int i2;
	int i3;
	int i4;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
	memset(c,0,(Integer.SIZE / Byte.SIZE));
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
	for (j1 = 0;j1 <= x1 - 1;j1++)
	{
	for (j2 = 0;j2 <= y1 - 1;j2++)
	{
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		a[j1][j2] = Integer.parseInt(tempVar3);
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
	for (j3 = 0;j3 <= x2 - 1;j3++)
	{
	for (j4 = 0;j4 <= y2 - 1;j4++)
	{
	String tempVar6 = ConsoleInput.scanfRead();
	if (tempVar6 != null)
	{
		b[j3][j4] = Integer.parseInt(tempVar6);
	}
	}
	}
	for (i1 = 0;i1 < x1;i1++)
	{
	for (i2 = 0;i2 < y2;i2++)
	{
	for (i3 = 0;i3 < y1;i3++)
	{
	c[i1][i2] = c[i1][i2] + a[i1][i3] * b[i3][i2];
	}
	if (i2 == y2 - 1)
	{
	System.out.printf("%d\n",c[i1][i2]);
	}
	else
	{
	System.out.printf("%d ",c[i1][i2]);
	}
	}
	}
	}
}

