package <missing>;

public class GlobalMembers
{
	public static void jiao(int m)
	{
		while (m != 1)
		{
			if (m % 2 == 0)
			{
				System.out.print(m);
				System.out.print("/2=");
				m = m / 2;
				System.out.print(m);
				System.out.print("\n");
			}
			else
			{
				System.out.print(m);
				System.out.print("*3+1=");
				m = m * 3 + 1;
				System.out.print(m);
				System.out.print("\n");
			}
		}
		if (m == 1)
		{
			System.out.print("End");
			System.out.print("\n");
		}
	}
	public static int Main()
	{
		int m;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		jiao(m);
		return 0;
	}
}

