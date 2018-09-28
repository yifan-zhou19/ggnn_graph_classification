package <missing>;

public class GlobalMembers
{
	public static int calculate(int a)
	{
		if (a == 1)
		{
		return 0;
		}
		else if (a % 2 == 1)
		{
		return 3 * a + 1;
		}
		else
		{
		return a / 2;
		}
	}

	public static int Main()
	{
		int n;
		int m = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n != 1)
		{
			m = calculate(n);
			if (n % 2 == 1)
			{
				System.out.print(n);
				System.out.print("*3+1=");
				System.out.print(m);
				System.out.print("\n");
			}
			else
			{
				System.out.print(n);
				System.out.print("/2=");
				System.out.print(m);
				System.out.print("\n");
			}
			n = m;
		}
		System.out.print("End");
		System.out.print("\n");
		return 0;
	}
}

