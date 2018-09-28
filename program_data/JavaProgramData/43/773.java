package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		int j;
		int k;
		int a = 0;
		int b = 0;
		int c;
		int d;
		for (i = 3;i <= m - 1;i = i + 2)
		{
			for (j = m - i - 1;j >= 2;j--)
			{
				c = (m - i) % j;
				if (c == 0)
				{
				b = b + 1;
				}
				if (c != 0)
				{
				b = b + 0;
				}
			}
			for (k = 2;k < i;k++)
			{
				d = i % k;
				if (d == 0)
				{
				a = a + 1;
				}
				if (d != 0)
				{
				a = a + 0;
				}
			}
			if (a == 0 && b == 0 && i <= (m - i))
			{
			System.out.print(i);
			System.out.print(" ");
			System.out.print(m - i);
			System.out.print("\n");
			}
			a = 0;
			b = 0;
		}
	return 0;
	}
}

