package <missing>;

public class GlobalMembers
{
	public static void process(int m)
	{
		int m_change;
		if (m == 1)
		{
			System.out.print("End");
			System.out.print("\n");
			return;
		}
		else
		{
			if (m % 2 == 1)
			{
				m_change = m * 3 + 1;
				System.out.print(m);
				System.out.print("*");
				System.out.print(3);
				System.out.print("+");
				System.out.print(1);
				System.out.print("=");
				System.out.print(m_change);
				System.out.print("\n");
				process(m_change);
			}
			else
			{
				m_change = m / 2;
				System.out.print(m);
				System.out.print("/");
				System.out.print(2);
				System.out.print("=");
				System.out.print(m_change);
				System.out.print("\n");
				process(m_change);
			}
		}
	}
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		process(n);

		return 0;
	}
}

