package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (j = 0;j < n;j++)
		{
	int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	int y;
	int m;
	int d;
	int i;
	int c = 0;
	int q = 0;
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		y = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		m = Integer.parseInt(tempVar3);
	}
	String tempVar4 = ConsoleInput.scanfRead();
	if (tempVar4 != null)
	{
		d = Integer.parseInt(tempVar4);
	}
	if ((y % 4 == 0) && (y % 100 != 0) || (y % 400 == 0))
	{
	days[2]++;
	}
	for (i = 1; i < m; i++)
	{
	c += days[i];
	}
	for (i = 1; i < d; i++)
	{
	q += days[i];
	}
	if (c > q)
	{
	c = c - q;
	}
	else
	{
	c = q - c;
	}
	if (c % 7 == 0)
	{
	System.out.print("YES\n");
	}
	else
	{
	System.out.print("NO\n");
	}
		}
	}

}

