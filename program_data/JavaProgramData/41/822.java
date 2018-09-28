package <missing>;

public class GlobalMembers
{
	public static int a;
	public static int b;
	public static int c;
	public static int d;
	public static int e;
	public static int _a()
	{
		return (a < 3) ^ (e == 1);
	}
	public static int _b()
	{
		return (b < 3) ^ (b == 2);
	}
	public static int _c()
	{
		return (c < 3) ^ (a == 5);
	}
	public static int _d()
	{
		return (d < 3) ^ (c != 1);
	}
	public static int _e()
	{
		return (e < 3) ^ (d == 1);
	}
	public static int chk()
	{
	if ((a + b + c + d + e != 15) || (a * b * c * d * e != 120))
	{
		return 1;
	}
	return _a() + _b() + _c() + _d() + _e();
	}
	public static int Main()
	{
	for (a = 1;a < 6;a++)
	{
	for (b = 1;b < 6;b++)
	{
	for (c = 1;c < 6;c++)
	{
	for (d = 1;d < 6;d++)
	{
	for (e = 1;e < 6;(e == 1)?e = 4:e++)
	{
	if (chk() == 0)
	{
		System.out.print(a);
		System.out.print(' ');
		System.out.print(b);
		System.out.print(' ');
		System.out.print(c);
		System.out.print(' ');
		System.out.print(d);
		System.out.print(' ');
		System.out.print(e);
	}
	}
	}
	}
	}
	}
	return 0;
	}
}
