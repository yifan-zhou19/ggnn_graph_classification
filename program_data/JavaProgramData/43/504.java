package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int i;
		int n;
		int a;
		int b;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 3; i <= m / 2; i = i + 2)
		{
			a = 0;
			b = Math.sqrt(i);
			for (n = 2; n <= b ; n++)
			{
				if ((i % n) == 0)
				{
					a = a + 1;
					break;
				}
			}
			for (n = 2; n <= Math.sqrt(m - i) ; n++)
			{
				if (((m - i) % n) == 0)
				{
					a = a + 1;
					break;
				}
			}
			if (a == 0)
			{
				System.out.print(i);
				System.out.print(" ");
				System.out.print(m - i);
				System.out.print("\n");
			}
		}
		return 0;
	}
}

