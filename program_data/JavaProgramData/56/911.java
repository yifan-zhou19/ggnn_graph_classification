package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int n;
	int i;
	int a;
	int b;
	int c;
	int d;
	int e;
	int s;
	int f;
	int g;
	int h;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	a = n / 10000;
	b = (n - 10000 * a) / 1000;
	c = (n - 10000 * a - 1000 * b) / 100;
	d = (n - 10000 * a - 1000 * b - 100 * c) / 10;
	e = n - 10000 * a - 1000 * b - 100 * c - 10 * d;
	f = n / 1000;
	g = n / 100;
	h = n / 10;
	if (h == 0)
	{
	s = n;
	}
	else if (g == 0)
	{
	s = 10 * e + d;
	}
	else if (f == 0)
	{
	s = 100 * e+10 * d + c;
	}
	else if (a == 0)
	{
	s = 1000 * e+100 * d + 10 * c + b;
	}
	else
	{
	s = 10000 * e+1000 * d + 100 * c + 10 * b + a;
	}

	System.out.printf("%d",s);
	}
}

