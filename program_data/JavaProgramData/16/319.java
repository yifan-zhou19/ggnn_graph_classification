package <missing>;

public class GlobalMembers
{
	/* title:?????? *
	 * author:???*
	 * time:2011.9.28*/




	public static int Main()
	{
		int n;
		int a;
		int b;
		int c;
		int d;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a = n / 1000;
		b = (n % 1000) / 100;
		c = (n % 100) / 10;
		d = n % 10;
		if (a != 0)
		{
			System.out.print(d);
			System.out.print(c);
			System.out.print(b);
			System.out.print(a);
			System.out.print("\n");
		}
		else if (b != 0)
		{
			System.out.print(d);
			System.out.print(c);
			System.out.print(b);
			System.out.print("\n");
		}
		else if (c != 0)
		{
			System.out.print(d);
			System.out.print(c);
			System.out.print("\n");
		}
		else
		{
			System.out.print(d);
			System.out.print("\n");
		}
		return 0;
	}

}

