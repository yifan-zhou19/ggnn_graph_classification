package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		int[] a = new int[100];
		for (int i = 0; i < n; ++i)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		m %= n;
		int[] p = a;
		while (m != 0)
		{
			int t = a[n - 1];
			for (p = a + n - 1; p > a; p--)
			{
				p[0] = (p - 1);
			}
			p[0] = t;
			m--;
		}

		for (p = a; p < a + n - 1; p++)
		{
			System.out.print(p);
			System.out.print(' ');
		}
		p = a;
		p = a + n - 1;
		System.out.print(p);

		System.out.print("\n");
		return 0;
	}

}

