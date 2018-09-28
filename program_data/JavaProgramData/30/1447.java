package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0;
		int i = 0;
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i = i + 1)
		{
			a = a + i * i;
		}
		for (i = 7;i <= n;i = i + 7)
		{
			b = b + i * i;
		}
		for (i = 70;i <= n != 0 && i < 80;i = i + 1)
		{
			c = c + i * i;
		}
		for (i = 17;i <= n;i = i + 10)
		{
			d = d + i * i;
		}
		a = a - b - c - d;
		if (n >= 77)
		{
			a = a + 70 * 70 + 77 * 77 * 2;
		}
		else if (n >= 70)
		{
			a = a + 70 * 70;
		}
		System.out.print(a);
		System.out.print("\n");
		return 0;
	}
}

