package <missing>;

public class GlobalMembers
{
	public static void s(int n)
	{
		int a;
		int b;
		if (n % 2 == 1)
		{
			a = 3 * n + 1;
			System.out.print(n);
			System.out.print("*3+1=");
			System.out.print(a);
			System.out.print("\n");
		}
		if (n % 2 == 0)
		{
			b = n / 2;
			System.out.print(n);
			System.out.print("/2=");
			System.out.print(b);
			System.out.print("\n");
		}
	} //s????????
	public static int t(int n)
	{
		if (n % 2 == 0)
		{
			return n / 2;
		}
		if (n % 2 == 1)
		{
			return 3 * n + 1;
		}
	} //t??????n?
	public static int Main()
	{
		int i;
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n != 1)
		{
			s(n);
			n = t(n);
		}
			  System.out.print("End");
			  System.out.print("\n");
		return 0;
	}

}

