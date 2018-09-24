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
		int[] p = a;
		for (;p <= a + n - 1;p++)
		{
			p[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (p = a + n - 1;p >= a;p--)
		{
			p[m] = p;
		}
		for (p = a + n;p <= a + n + m - 1;p++)
		{
			*(p - n) = p[0];
		}
		p = a;
		System.out.print(p++);
		for (;p <= a + n - 1;p++)
		{
			System.out.print(" ");
			System.out.print(p);
		}
	}
}

