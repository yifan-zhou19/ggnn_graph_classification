package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int a;
		int b;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (a = 3; a <= m / 2; a = a + 2)
		{
			int i;
			for (i = 3; i <= a; i = i + 2)
			{
				if (a % i == 0)
				{
					break;
				}
			}
			if (i == a)
			{
				b = m - a;
			}
			else
			{
				continue;
			}
			int k;
			for (k = 3; k <= b; k = k + 2)
			{
				if (b % k == 0)
				{
					break;
				}
			}
			if (k == b)
			{
				System.out.print(a);
				System.out.print(" ");
				System.out.print(b);
				System.out.print("\n");
			}
		}
		return 0;
	}

}

