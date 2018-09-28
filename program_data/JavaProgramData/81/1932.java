package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int haha = new int(int a,int b,int s[5][5]);
	int[][] t = new int[5][5];
	int m;
	int n;
	int i;
	int j;
	int c;
	for (i = 0;i < 5;i++)
	{
	for (j = 0;j < 5;j++)
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t[i][j] = Integer.parseInt(tempVar);
		}
	}
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		m = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		n = Integer.parseInt(tempVar3);
	}
	c = haha(m, n, t);
	if (c == 0)
	{
	System.out.print("error");
	}
	else
	{
	for (i = 0;i < 5;i++)
	{
		for (j = 0;j < 4;j++)
		{
		System.out.printf("%d ",t[i][j]);
		}
	System.out.printf("%d",t[i][4]);
	System.out.print("\n");
	}
	}
	return 0;
	}
	public static int haha(int a, int b, int[][] s)
	{
	int[] k = new int[5];
	int i;
	if (a < 0 || a>4 || b < 0 || b>4)
	{
	return 0;
	}
	else
	{
		for (i = 0;i < 5;i++)
		{
		k[i] = s[a][i];
	s[a][i] = s[b][i];
	s[b][i] = k[i];
		}
	return 1;
	}
	}
}

