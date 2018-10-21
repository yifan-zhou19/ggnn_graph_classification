package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int j;
	int s;
	int[][] a = new int[10000][6];

	for (i = 0;i < 10000;i++)
	{
	for (j = 0;j < 6;j++)
	{
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a[i][j] = Integer.parseInt(tempVar);
	}
	}
	}
	for (i = 0;i < 10000;i++)
	{
	s = (a[i][3] + 12) * 3600 + a[i][4] * 60 + a[i][5] - a[i][0] * 3600 - a[i][1] * 60 - a[i][2];
	if (a[i][0] != 0)
	{
		System.out.printf("%d\n",s);
	}
	else
	{
		break;
	}
	}
	return 0;
	}



}

