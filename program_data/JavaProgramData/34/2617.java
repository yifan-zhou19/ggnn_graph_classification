package <missing>;

public class GlobalMembers
{
	public static void jg(int n)
	{
		int m;
		if (n != 1)
		{
			if (n % 2 == 1)
			{
				m = 3 * n + 1;
			System.out.print(n);
			System.out.print("*");
			System.out.print(3);
			System.out.print("+1=");
			System.out.print(m);
			System.out.print("\n");
			n = m;
			jg(n);
			}
			else
			{
				m = n / 2;
				System.out.print(n);
				System.out.print("/2=");
				System.out.print(m);
				System.out.print("\n");
				n = m;
				jg(n);
			}
		}
		else
		{
			System.out.print("End");
			System.out.print("\n");
		}
	}


	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		jg(n);
		return 0;
	}
}

