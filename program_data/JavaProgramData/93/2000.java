package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int three = int x;
		int five = int x;
		int seven = int x;
		int print = new int(int a,int b,int c);
		int a;
		int b;
		int c;
		int x;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		a = three(x);
		b = five(x);
		c = seven(x);
		print(a, b, c);
		return 0;
	}
	public static int three(int x)
	{
		int d;
		d = (x % 3 == 0)?1:0;
		return d;
	}
	public static int five(int x)
	{
		int d;
		d = (x % 5 == 0)?1:0;
		return d;
	}
	public static int seven(int x)
	{
		int d;
		d = (x % 7 == 0)?1:0;
		return d;
	}
	public static int print(int a,int b,int c)
	{
		if (a == 1)
		{
			System.out.print("3");
			if (b == 1 || c == 1)
			{
				System.out.print(" ");
			}
		}
		if (b == 1)
		{
			System.out.print("5");
			if (c == 1)
			{
				System.out.print(" ");
			}
		}
		if (c == 1)
		{
			System.out.print("7");
		}
		if (a == 0 && b == 0 && c == 0)
		{
			System.out.print("n");
		}
		return 0;
	}
}

