package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int a;
		int b;
		int c;
		a = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			b = i / 10;
			c = i - (10 * b);
			if (i % 7 == 0 || b == 7 || c == 7)
			{
				continue;
			}
			a = a + (i * i);
		}
		System.out.print(a);
		System.out.print("\n");
		System.in.read();
		System.in.read();
		return 0;
	}

}

