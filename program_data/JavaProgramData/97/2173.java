package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int x;
	int y;
	int z;
	int r;
	int s;
	int t;
	int a;
	int m;
	int n;
	int p;
	int q;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = Integer.parseInt(tempVar);
	}
	if (a > 0 && a < 1000)
	{
	x = a / 100;
	m = a % 100;
	y = m / 50;
	n = m % 50;
	z = n / 20;
	p = n % 20;
	r = p / 10;
	q = p % 10;
	s = q / 5;
	t = q % 5;
	System.out.printf("%d\n",x);
	System.out.printf("%d\n",y);
	System.out.printf("%d\n",z);
	System.out.printf("%d\n",r);
	System.out.printf("%d\n",s);
	System.out.printf("%d",t);
	}
	return 0;
	}

}

