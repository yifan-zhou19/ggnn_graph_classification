package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[][] t = new int[50001][2];
	int[] r = new int[10001];
	int n;
	int k;
	int i;
	int j;
	int x;
	int y;
	int sum = 1;
	for (i = 0;i < 10001;i++)
	{
		r[i] = 0;
	}
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i < n;i++)
	{
		for (j = 0;j < 2;j++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			t[i][j] = Integer.parseInt(tempVar2);
		}
		}
		for (k = t[i][0];k < t[i][1];k++)
		{
			r[k] = 1;
		}
	}
	for (i = 0;i < 10001;i++)
	{
		if (r[i] == 1)
		{
		   x = i;
		   break;
		}
	}
	for (i = 10000;i > 0;i--)
	{
		if (r[i] == 1)
		{
		   y = i;
		   break;
		}
	}
	for (i = x;i < y;i++)
	{
		   sum = sum * r[i];
	}
	if (sum == 1)
	{
	System.out.printf("%d %d",x,y + 1);
	}
	else
	{
	System.out.print("no");
	}
	return 0;
	}

}

