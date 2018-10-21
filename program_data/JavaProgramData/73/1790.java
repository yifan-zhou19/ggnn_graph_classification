package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int[][] a = new int[5][5];
	int i;
	int j;
	int k;
	int l = 0;
	int t = 0;
	int[] p = new int[5];
	p = a;
	for (i = 0;i < 5;i++)
	{
	for (j = 0;j < 5;j++)
	{
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		(p[i] + j) = tempVar;
	}
	}
	}
	for (i = 0;i < 5;i++)
	{
		for (j = 0;j < 5;j++)
		{
		t = 0;
	for (k = 0;k < 5;k++)
	{
		if (*(p[i] + j) < *(p[i] + k))
		{
	t--;
		}
	}
	for (k = 0;k < 5;k++)
	{
		if (*(p[i] + j) > *(p[k] + j))
		{
	t--;
		}
	}
	if (t == 0)
	{
		System.out.printf("%d %d %d",i + 1,j + 1,a[i][j]);
	l--;
	}
		}
	}
	if (l == 0)
	{
	System.out.print("not found");
	}
	}


}

