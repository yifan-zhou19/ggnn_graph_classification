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
	a = b = c = d = 0;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	while (n > 999)
	{
		n = n - 1000;
		a = a + 1;
	}
	while (n > 99)
	{
		n = n - 100;
		b++;
	}
	while (n > 9)
	{
		n = n - 10;
		c++;
	}
	if (n > 0)
	{
	while (n > 0)
	{
		n = n - 1;
		d++;
	}
	}
	else if (n = 0)
	{
		d = 0;
	}
	if (a == 0)
	{
		if (b == 0)
		{
			if (c == 0)
			{
				if (d == 0)
				{
					System.out.print(d);
				}
				else
				{
					System.out.print(d);
				}
			}
			else
			{
				System.out.print(d);
				System.out.print(c);
			}
		}
		else
		{
			System.out.print(d);
			System.out.print(c);
			System.out.print(b);
		}
	}
	else
	{
		System.out.print(d);
		System.out.print(c);
		System.out.print(b);
		System.out.print(a);
	}
		return 0;
	}
}

