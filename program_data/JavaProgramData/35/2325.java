package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int h;
	int l;
	int i;
	int j;
	int q = 0;
	int[][] sz = new int[10][10];
	int[] max = new int[10];
	int[] lie = new int[10];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		h = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(",");
	if (tempVar2 != null)
	{
		l = Integer.parseInt(tempVar2);
	}
	for (i = 0;i < h;i++)
	{
	for (j = 0;j < l;j++)
	{
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		sz[i][j] = Integer.parseInt(tempVar3);
	}
	}
	}
	for (i = 0;i < h;i++)
	{
	max[i] = sz[i][0];
	}
	for (i = 0;i < h;i++)
	{
	for (j = 0;j < l;j++)
	{
	if (sz[i][j] >= sz[i][0])
	{
	max[i] = sz[i][j];
	lie[i] = j;
	}
	}
	}

	for (i = 0;i < h;i++)
	{
	for (j = 0;j < h;j++)
	{
	if (max[i] > sz[j][lie[i]])
	{
	break;
	}
	if (j == h - 1)
	{
	System.out.printf("%d+%d",i,lie[i]);
	q = 1;
	}
	}
	}
	if (q == 0)
	{
	System.out.print("No");
	}
	return 0;
	}
}

