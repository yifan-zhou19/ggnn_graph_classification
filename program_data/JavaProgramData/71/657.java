package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int a;
		int b;
		int c;
		int x = 0;
		int sum = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			c = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (b > c)
			{
				x = b;
				b = c;
				c = x;
			}
			if ((a % 400 == 0) || (a % 100 != 0 && a % 4 == 0))
			{
				for (; b < c; b++)
				{
					if (b == 2)
					{
						sum = sum + 29;
					}
					else if (b == 4 || b == 6 || b == 9 || b == 11)
					{
						sum = sum + 30;
					}
						 else
						 {
							 sum = sum + 31;
						 }
				}
			}
			else
			{
				for (; b < c; b++)
				{
					if (b == 2)
					{
						sum = sum + 28;
					}
					else if (b == 4 || b == 6 || b == 9 || b == 11)
					{
						sum = sum + 30;
					}
						 else
						 {
							 sum = sum + 31;
						 }
				}

			}
			if (sum % 7 == 0)
			{
				System.out.print("YES");
				System.out.print("\n");
			}
			else
			{
				System.out.print("NO");
				System.out.print("\n");
			}
			sum = 0;
			x = 0;
			a = 0;
			b = 0;
			c = 0;
		}
		return 0;
	}

}

