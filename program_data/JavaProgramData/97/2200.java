package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int m;
	int a;
	int b;
	int c;
	int d;
	int e;
	int f;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		m = Integer.parseInt(tempVar);
	}
	int i = 1;
	if (i <= m)
	{
	i++;
	a = m / 100;
	b = (m - 100 * a) / 50;
	c = (m - 100 * a - 50 * b) / 20;
	d = (m - 100 * a - 50 * b - 20 * c) / 10;
	e = (m - 100 * a - 50 * b - 20 * c - 10 * d) / 5;
	f = m - 100 * a - 50 * b - 20 * c - 10 * d - e * 5;
	System.out.printf("%d\n%d\n%d\n%d\n%d\n%d\n",a,b,c,d,e,f);
	}
	return 0;
	}
}

