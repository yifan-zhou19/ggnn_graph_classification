package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		int c;
		int i;
		int m;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (; n > 0; n--)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			a = 1, b = 1;
			if (m <= 2)
			{
				System.out.print(1);
				continue;
			}
			for (i = 3; i <= m; i++)
			{
				c = a + b;
				a = b;
				b = c;
			}
			System.out.print(c);
			System.out.print("\n");
		}
		return 0;
	}

}

