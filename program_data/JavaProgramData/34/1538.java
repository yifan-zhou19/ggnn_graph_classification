package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int p;
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		if (n == 1)
		{
			System.out.print("End");
		}
		if (n != 1)
		{
			while (true)
			{
			if (n % 2 == 1)
			{
				m = n * 3 + 1;
			System.out.print(n);
			System.out.print("*3");
			System.out.print("+1");
			System.out.print("=");
			System.out.print(m);
			System.out.print("\n");
			n = m;
			}
			else
			{
				p = n / 2;
			System.out.print(n);
			System.out.print("/2");
			System.out.print("=");
			System.out.print(p);
			System.out.print("\n");
			n = p;
			}
			if (n == 1)
			{
				break;
			}
			}
		System.out.print("End");
		}

	return 0;
	}

}

