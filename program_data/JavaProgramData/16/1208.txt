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
		int x;
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a = x % 10; //????????a
		b = (x - a) % 100 / 10; //????????b
		c = (x - a - 10 * b) % 1000 / 100; //????????c
		d = (x - a - 10 * b - 100 * c) % 10000 / 1000; //????????d
		e = (x - a - 10 * b - 100 * c - 1000 * d) % 100000 / 10000; //????????e
		if (e == 1) //????????1
		{
			System.out.print(1);
		}
		else if (d != 0) //???????abcd
		{
		   System.out.print(a);
		   System.out.print(b);
		   System.out.print(c);
		   System.out.print(d);
		}
		else if (d == 0 && c != 0) //???????abc
		{
		   System.out.print(a);
		   System.out.print(b);
		   System.out.print(c);
		}
		else if (d == 0 && c == 0 && b != 0) //???????ab
		{
		   System.out.print(a);
		   System.out.print(b);
		}
		else if (d == 0 && c == 0 && b == 0) //???????a
		{
			System.out.print(a);
		}
		return 0;
	}

}

