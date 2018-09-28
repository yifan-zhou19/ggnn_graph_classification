package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[][] y = new int[6][10000];
	int i;
	int h;
	int m;
	int s;
	int sumk;
	int[] sum = new int[10000];
	int l;
	l = 0;
	for (l = 0;l < 10000;l++)
	{
	for (i = 0;i < 6;i++)
	{
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		(y[i][l]) = Integer.parseInt(tempVar);
	}

	}
	if (y[0][l] == 0)
	{
		break;
	}
	}

	for (i = 0;i < l;i++)
	{
	y[3][i] = y[3][i] + 12;
	h = y[3][i] - y[0][i];
	m = y[4][i] - y[1][i];
	sumk = h * 60 + m;
	s = y[5][i] - y[2][i];
	sum[i] = sumk * 60 + s;

	}
	for (i = 0;i < l;i++)
	{
		System.out.printf("%d\n",sum[i]);
	}
	return 0;
	}

}

