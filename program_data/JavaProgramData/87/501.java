package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int a;
	int b;
	int c;
	int d;
	int e;
	int f;
	int m;
	int i;
	for (i = 0;i <= 100;i++)
	{
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		b = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		c = Integer.parseInt(tempVar3);
	}
	String tempVar4 = ConsoleInput.scanfRead();
	if (tempVar4 != null)
	{
		d = Integer.parseInt(tempVar4);
	}
	String tempVar5 = ConsoleInput.scanfRead();
	if (tempVar5 != null)
	{
		e = Integer.parseInt(tempVar5);
	}
	String tempVar6 = ConsoleInput.scanfRead();
	if (tempVar6 != null)
	{
		f = Integer.parseInt(tempVar6);
	}
	if (a == 0 && b == 0 && c == 0 && d == 0 && e == 0 && f == 0)
	{
		return 0;
	}
	else
	{
	d = d + 12;
	m = (d - a) * 60 * 60;
	if (e >= b)
	{
		m = m + ((e - b) * 60);
	}
	else
	{
		m = m - ((b - e) * 60);
	}
	if (f >= c)
	{
		m = m + f - c;
	}
	else
	{
		m = m + f - c;
	}
	System.out.printf("%d\n",m);
	}
	}
	return 0;
	}
}

