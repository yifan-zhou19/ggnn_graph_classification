package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int s;
		int p;
		int i;
		int j;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (s = 3; s <= m / 2;s = s + 2)
		{
			p = m - s;
			for (i = 2; i <= (int) Math.sqrt(s); i = i + 1)
			{
					if (s % i == 0)
					{
				break;
					}
			}
			for (j = 2; j <= (int) Math.sqrt(p); j = j + 1)
			{
					if (p % j == 0)
					{
				break;
					}
			}
			if (j == (int) Math.sqrt(p) + 1 && i == (int) Math.sqrt(s) + 1)
			{
				System.out.print(s);
				System.out.print(" ");
				System.out.print(p);
				System.out.print("\n");
			}
		}
		return 0;
	}
}

