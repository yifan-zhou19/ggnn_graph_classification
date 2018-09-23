package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int[][] sz = new int[1000][1000];
	int x1;
	int y1;
	int x2;
	int y2;
	int k;
	int i;
	int s; //shengming
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (k = 0;k < n;k++)
	{
	for (i = 0;i < n;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		(sz[k][i]) = Integer.parseInt(tempVar2);
	}
	}
	} //??n*n??
	for (k = 0;k < n;k++)
	{
	for (i = 0;i < n;i++)
	{
	if (sz[k][i] == 0)
	{
		x1 = i;
		y1 = k;
		break;
	}
	}
	} //???????
	for (k = n - 1;k >= 0;k--)
	{
	for (i = n - 1;i >= 0;i--)
	{
	if (sz[k][i] == 0)
	{
		x2 = i;
		y2 = k;
		break;
	} //???????
	}
	}
	s = (Math.abs(x2 - x1) - 1) * (Math.abs(y2 - y1) - 1); //??255???
	System.out.printf("%d",s);
	return 0;
	}
}

