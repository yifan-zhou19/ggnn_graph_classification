package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

	int n;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}

	int[][] sz = new int[100][2];
	int[] panduan = new int[100];
	int i;
	int j;
	for (i = 0;i < n;i++)
	{
		for (j = 0;j < 2;j++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			(sz[i][j]) = Integer.parseInt(tempVar2);
		}

		}
	}

	for (i = 0;i < n;i++)
	{

		if ((sz[i][0] > 89 && sz[i][0] < 141) && (sz[i][1]>59 && sz[i][1] < 91))
		{
		panduan[i] = 1;
		}
		else
		{
			panduan[i] = 0;
		}
	}

	int[] cx = new int[100];
	int e = 0;
	for (i = 0;i < n;i++)
	{
		if (panduan[i] == 1)
		{
		cx[e]++;
		}
		else if (panduan[i] == 0)
		{
		e++;
		}
	}

	int k;
	int a;
	int t;
	for (k = 1;k < 100;k++)
	{
		for (t = 0;t < 100 - k;t++)
		{
			if (cx[t] < cx[t + 1])
			{
			a = cx[t + 1];
			cx[t + 1] = cx[t];
			cx[t] = a;
			}
		}
	}

	System.out.printf("%d",cx[0]);

	return 0;
	}
}

