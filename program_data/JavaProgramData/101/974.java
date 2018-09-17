package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a; //?a b c?????????? x y z????????????
		int b;
		int c;
		int x;
		int y;
		int z;
		a = 3;
		b = 2;
		c = 1;
		x = ((b > a) + (c == a));
		y = ((a > b) + (a > c));
		z = ((c > b) + (b > a));
		if (x < y && y < z)
		{
			System.out.print("C");
			System.out.print("B");
			System.out.print("A");
			return 0;
		}
		a = 3;
		b = 1;
		c = 2;
		x = ((b > a) + (c == a));
		y = ((a > b) + (a > c));
		z = ((c > b) + (b > a));
		if (x < z && z < y)
		{
			System.out.print("B");
			System.out.print("C");
			System.out.print("A");
			return 0;
		}
		a = 2;
		b = 3;
		c = 1;
		x = ((b > a) + (c == a));
		y = ((a > b) + (a > c));
		z = ((c > b) + (b > a));
		if (y < x && x < z)
		{
			System.out.print("C");
			System.out.print("A");
			System.out.print("B");
			return 0;
		}
		a = 2;
		b = 1;
		c = 3;
		x = ((b > a) + (c == a));
		y = ((a > b) + (a > c));
		z = ((c > b) + (b > a));
		if (z < x && x < y)
		{
			System.out.print("B");
			System.out.print("A");
			System.out.print("C");
			return 0;
		}
		a = 1;
		b = 2;
		c = 3;
		x = ((b > a) + (c == a));
		y = ((a > b) + (a > c));
		z = ((c > b) + (b > a));
		if (z < y && y < x)
		{
			System.out.print("A");
			System.out.print("B");
			System.out.print("C");
			return 0;
		}
		a = 1;
		b = 3;
		c = 2;
		x = ((b > a) + (c == a));
		y = ((a > b) + (a > c));
		z = ((c > b) + (b > a));
		if (y < z && z < x)
		{
			System.out.print("A");
			System.out.print("C");
			System.out.print("B");
			return 0;
		}
	}
}
