package <missing>;

public class GlobalMembers
{
	public static int Main() //???
	{ //?????
		int m; //????
		int a;
		int b;
		int i;
		int k;
		int y = 1;
		int x = 1;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (a = 3;a <= m / 2;a = a + 2)
		{
			x = 1;
			y = 1;
			for (i = 3;i <= a - 1;i = i + 2)
			{
				if (a % i == 0)
				{
					x = 0;
					break;
				}
			}
			if (x == 1)
			{
				for (k = 3;k <= m - a - 1;k = k + 2)
				{
						if ((m - a) % k == 0)
						{
							y = 0;
							break;
						}
				}
				if (y == 1)
				{
				System.out.print(a);
				System.out.print(" ");
				System.out.print(m - a);
				System.out.print("\n");
				}
			}
		}
		return 0;
	}
}

