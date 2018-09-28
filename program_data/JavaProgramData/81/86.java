package <missing>;

public class GlobalMembers
{
	public static int h(int n, int m)
	{
	int x;
	if ((m >= 0 && m <= 4) && (n >= 0 && n <= 4))
	{
	x = 1;
	}
	else
	{
	x = 0;
	}
	return x;
	}
	public static int Main()
	{
	int[][] s = new int[5][5];
	int i;
	int m;
	int n;
	int c;
	int y;
	int z;
	int a;
	for (i = 0;i <= 4;i++)
	{
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		s[i][0] = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		s[i][1] = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		s[i][2] = Integer.parseInt(tempVar3);
	}
	String tempVar4 = ConsoleInput.scanfRead(" ");
	if (tempVar4 != null)
	{
		s[i][3] = Integer.parseInt(tempVar4);
	}
	String tempVar5 = ConsoleInput.scanfRead(" ");
	if (tempVar5 != null)
	{
		s[i][4] = Integer.parseInt(tempVar5);
	}
	}
	String tempVar6 = ConsoleInput.scanfRead();
	if (tempVar6 != null)
	{
		n = Integer.parseInt(tempVar6);
	}
	String tempVar7 = ConsoleInput.scanfRead(" ");
	if (tempVar7 != null)
	{
		m = Integer.parseInt(tempVar7);
	}
	c = h(n, m);
	if (c == 1)
	{
	for (y = 0;y <= 4;y++)
	{
	z = s[n][y];
	s[n][y] = s[m][y];
	s[m][y] = z;
	}
	for (a = 0;a <= 4;a++)
	{
	System.out.printf("%d %d %d %d %d\n",s[a][0],s[a][1],s[a][2],s[a][3],s[a][4]);
	}
	}
	else
	{
	System.out.print("error");
	}
	return 0;
	}

}

