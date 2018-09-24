package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int j;
	int m;
	int n;
	int p;
	int q;
	int flagp;
	int flagq;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		m = Integer.parseInt(tempVar);
	}
	for (n = 6;n <= m;n = n + 2)
	{
	p = 1;
	do
	{
	p = p + 1;
	q = n - p;
	flagp = 1;
	for (j = 2;j <= (int)(Math.floor(Math.sqrt((double)(p))));j++)
	{
	if ((p % j) == 0)
	{
	flagp = 0;
	break;
	}
	}
	flagq = 1;
	for (j = 2;j <= (int)(Math.floor(Math.sqrt((double)(q))));j++)
	{
	if ((q % j) == 0)
	{
	flagq = 0;
	break;
	}
	}
	} while (flagp * flagq == 0);
	System.out.printf("%d=%d+%d\n",n,p,q);
	}
	}
}

