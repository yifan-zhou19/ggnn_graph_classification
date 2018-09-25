package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int j;
	int c;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	int count = 0;
	int[][] f = new int[1000][1000];
	for (i = 0;i < n;i++)
	{
	for (j = 0;j < n;j++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		f[i][j] = Integer.parseInt(tempVar2);
	}
	if (f[i][j] == 0)
	{
		count = count + 1;
	}
	}
	scanf("\n");
	}
	c = (((count + 4) / 4) - 2) * (((count + 4) / 4) - 2);
	System.out.printf("%d",c);
	return 0;
	}

}

