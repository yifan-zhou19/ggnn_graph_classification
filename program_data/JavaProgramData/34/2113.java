package <missing>;

public class GlobalMembers
{
	public static int rec(int a)
	{
		int b;
		if ((a % 2) == 1)
		{
			b = a * 3 + 1;
			System.out.print(a);
			System.out.print("*3+1=");
			System.out.print(b);
			System.out.print("\n");
			return b;
		}
		else
		{
			b = a / 2;
			System.out.print(a);
			System.out.print("/2=");
			System.out.print(b);
			System.out.print("\n");
			return b;
		}
	}
	public static int rec2(int(a))
	{
		if (a > 1)
		{
			a = rec(a);
			rec2(a);
		}
		else
		{
			System.out.print("End");
			System.out.print("\n");
		}
		return 0;
	}
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		rec2(n);
		return 0;
	}
}

