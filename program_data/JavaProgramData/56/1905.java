package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	char a;
	char b;
	char c;
	char d;
	char e;
	a = System.in.read();
	b = System.in.read();
	c = System.in.read();
	d = System.in.read();
	e = System.in.read();
	if (e >= '0' && e <= '9')
	{
		System.out.print(e);
		System.out.print(d);
		System.out.print(c);
		System.out.print(b);
		System.out.print(a);
	}
	else if (!(e >= '0' && e <= '9'))
	{
		if (d >= '0' && d <= '9')
		{
			System.out.print(d);
			System.out.print(c);
			System.out.print(b);
			System.out.print(a);
		}
		else if (!(d >= '0' && d <= '9'))
		{
			if (c >= '0' && c <= '9')
			{
				System.out.print(c);
				System.out.print(b);
				System.out.print(a);
			}
			else if (!(c >= '0' && c <= '9'))
			{
				if (b >= '0' && b <= '9')
				{
					System.out.print(b);
					System.out.print(a);
				}
				else if (!(b >= '0' && b <= '9'))
				{
					System.out.print(a);
				}
			}
		}
	}
	}
}
