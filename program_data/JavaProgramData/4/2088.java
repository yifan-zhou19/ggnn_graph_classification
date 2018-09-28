package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int a;
	int b;
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
	int[][] n = new int[1000][1000];
	int i;
	int j;
	for (i = 0;i < a;i++)
	{
	for (j = 0;j < b;j++)
	{
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		n[i][j] = Integer.parseInt(tempVar3);
	}
	}
	}
	for (int t = 0;t < b;t++)
	{
	for (j = t, i = 0;i < a && j >= 0;i++, j--)
	{
	System.out.printf("%d\n",n[i][j]);
	}
	}
	for (int p = 1;p < a;p++)
	{
	for (i = p, j = b - 1;i < a && j >= 0;i++, j--)
	{
	System.out.printf("%d\n",n[i][j]);
	}
	}
	return 0;
	}

}

