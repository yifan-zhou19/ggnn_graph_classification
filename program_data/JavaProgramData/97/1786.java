package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int a;
	int b;
	int c;
	int d;
	int e;
	int f;
	int x;
	int y;
	int z;
	int i;
	int q;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	a = n / 100;
	x = n % 100;
	b = x / 50;
	y = n % 50;
	c = y / 20;
	z = n - 100 * a - 50 * b - 20 * c;
	d = z / 10;
	i = n % 10;
	e = i / 5;
	q = n % 5;
	f = q;
	System.out.printf("%d\n%d\n%d\n%d\n%d\n%d\n",a,b,c,d,e,f);
	return 0;
	}
}

