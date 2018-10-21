package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
	a = 3;
	b = 2;
	c = 1;
	if (((b > a) + (c == a) == 0) && ((a > b) + (a > c) == 1) && ((c > b) + (b > a) == 2))
	{
		System.out.print('C');
		System.out.print('B');
		System.out.print('A');
	}
	a = 3;
	c = 2;
	b = 1;
	if (((b > a) + (c == a) == 0) && ((a > b) + (a > c) == 2) && ((c > b) + (b > a) == 1))
	{
		System.out.print('B');
		System.out.print('C');
		System.out.print('A');
	}
	a = 2;
	b = 3;
	c = 1;
	if (((b > a) + (c == a) == 1) && ((a > b) + (a > c) == 0) && ((c > b) + (b > a) == 2))
	{
		System.out.print('C');
		System.out.print('A');
		System.out.print('B');
	}
	a = 1;
	b = 3;
	c = 2;
	if (((b > a) + (c == a) == 2) && ((a > b) + (a > c) == 0) && ((c > b) + (b > a) == 1))
	{
		System.out.print('A');
		System.out.print('C');
		System.out.print('B');
	}
	c = 3;
	b = 2;
	a = 1;
	if (((b > a) + (c == a) == 2) && ((a > b) + (a > c) == 1) && ((c > b) + (b > a) == 0))
	{
		System.out.print('A');
		System.out.print('B');
		System.out.print('C');
	}
	c = 3;
	a = 2;
	b = 1;
	if (((b > a) + (c == a) == 1) && ((a > b) + (a > c) == 2) && ((c > b) + (b > a) == 0))
	{
		System.out.print('B');
		System.out.print('A');
		System.out.print('C');
	}
	return 0;
	}
}
