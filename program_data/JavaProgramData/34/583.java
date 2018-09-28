package <missing>;

public class GlobalMembers
{
	public static void ji(int m)
	{
		System.out.print(m);
		System.out.print("*3+1=");
		System.out.print(m * 3 + 1);
		System.out.print("\n");
	}
	public static void ou(int m)
	{
		System.out.print(m);
		System.out.print("/2=");
		System.out.print(m / 2);
		System.out.print("\n");
	}
	public static void f(int m)
	{
		if (m == 1)
		{
			;
		}
		else
		{
		if (m % 2 == 0)
		{
				ou(m);
				f(m / 2);
		}
		else
		{
				ji(m);
				f(m * 3 + 1);
		}
		}
	}
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		f(n);
		System.out.print("End");
		System.out.print("\n");
		return 0;
	}
}

