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
		int i;
		i = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (i / 10 == 0)
		{
			System.out.print(i);
			System.out.print("\n");
		}
		if (i / 100 == 0 && i / 10 != 0)
		{
				a = i / 10;
				b = i - a * 10;
		System.out.print(b);
		System.out.print(a);
		System.out.print("\n");
		}
		if (i / 1000 == 0 && i / 100 != 0)
		{
				a = i / 100;
				b = (i - a * 100) / 10;
				c = i - a * 100 - b * 10;
				System.out.print(c);
				System.out.print(b);
				System.out.print(a);
				System.out.print("\n");
		}
		if (i / 10000 == 0 && i / 1000 != 0)
		{
				a = i / 1000;
				b = (i - a * 1000) / 100;
				c = (i - a * 1000 - b * 100) / 10;
				d = i - a * 1000 - b * 100 - c * 10;
				System.out.print(d);
				System.out.print(c);
				System.out.print(b);
				System.out.print(a);
				System.out.print("\n");
		}
		if (i / 10000 != 0)
		{
		  a = i / 10000;
		  b = (i - a * 10000) / 1000;
		  c = (i - a * 10000 - b * 1000) / 100;
		  d = (i - a * 10000 - b * 1000 - c * 100) / 10;
		  e = i - a * 10000 - b * 1000 - c * 100 - d * 10;
		  System.out.print(e);
		  System.out.print(d);
		  System.out.print(c);
		  System.out.print(b);
		  System.out.print(a);
		  System.out.print("\n");
		}
				return 0;
	}
}

