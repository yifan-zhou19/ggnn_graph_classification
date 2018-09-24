package <missing>;

public class GlobalMembers
{
	public static int[][] m = new int[1000][1000];
	public static int Main()
	{
	int i;
	int j;
	int n;
	int k = 0;
	int g;
	int l;
	int p;
	int o;
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
		m[i][j] = Integer.parseInt(tempVar2);
	}
	if (m[i][j] == 0)
	{
	if (m[i - 1][j] != 0 && m[i][j - 1] != 0)
	{
	p = i;
	o = j;
	}
		g = i;
		l = j;
	}
		}
	}
	System.out.printf("%d\n",(l - o - 1) * (g - p - 1));
	return 0;
	}

}

