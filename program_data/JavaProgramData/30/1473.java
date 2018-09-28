package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int m;
		int s;
		int b;
		int c;
		int d;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a = 1;
		s = 0;
		while (a <= n)
		{
			m = a - 7;
			b = a % 7;
			c = m % 10;
			d = a - 70;
			if (d < 0 || d >= 10)
			{
				if (b != 0 && c != 0)
				{
					s = s + a * a;
				}
			}
			a = a + 1;
		}
		System.out.print(s);
		System.out.print("\n");
		return 0;
	}

}

