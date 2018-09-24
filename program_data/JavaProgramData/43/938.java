package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int a;
		int b;
		int c;
		int d;
		for (a = 3;a <= n / 2;a = a + 2)
		{
			for (c = 2;c <= Math.sqrt((double) a);c++)
			{
				if (a % c == 0)
				{
					break;
				}
			}
			for (d = 2;d <= Math.sqrt((double)n - a);d++)
			{
				if ((n - a) % d == 0)
				{
					break;
				}
			}
			if (c > Math.sqrt((double)a) && d > Math.sqrt((double)n - a))
			{
				System.out.print(a);
				System.out.print(" ");
				System.out.print(n - a);
				System.out.print("\n");
			}
		}
		return 0;
	}
}

