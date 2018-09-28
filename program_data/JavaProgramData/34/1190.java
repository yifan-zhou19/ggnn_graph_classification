package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		void f(int);
		int m;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		f(m);
		return 0;
	}
	public static void f(int m)
	{
		if (m == 1)
		{
			System.out.print("End");
		}
		else if (m % 2 == 0)
		{
			System.out.print(m);
			System.out.print("/2=");
			m = m / 2;
			System.out.print(m);
			System.out.print("\n");
			f(m);
		}
		else
		{
			System.out.print(m);
			System.out.print("*3+1=");
			m = 3 * m + 1;
			System.out.print(m);
			System.out.print("\n");
			f(m);
		}
	}
}

