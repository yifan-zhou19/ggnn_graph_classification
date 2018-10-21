package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int[][] a = new int[1000][1000];
	int i;
	int j;
	int m = 0;
	int[][] b = new int[1000][2];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i < n;i++)
	{
	for (j = 0;j < n;j++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[i][j] = Integer.parseInt(tempVar2);
		}
		if (a[i][j] == 0)
		{
			b[m][0] = i;
			b[m][1] = j;
			m++;
		}
	}
	}
	System.out.printf("%d",(b[m - 1][0] - b[0][0] - 1) * (b[m - 1][1] - b[0][1] - 1));
	return 0;
	}
}

