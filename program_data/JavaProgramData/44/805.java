package <missing>;

public class GlobalMembers
{
	public static void reverse(int num)
	{
		int a = 0;
		if (num == 0)
		{
			System.out.print(0);
			System.out.print("\n");
		}
		if (num < 0)
		{
			int b = 1;
			int c = 0;
			int biaoji = 0;
			System.out.print('-');
			num = (-1) * num;
			while (true)
			{
				a = (num / b) % 10;
				c = num / b;
				if (a > 0)
				{
					System.out.print(a);
					biaoji = 1;
					b = b * 10;
					break;
				}
				else
				{
					b = b * 10;
				}
			}
			while (biaoji != 0)
			{
				a = (num / b) % 10;
				c = num / b;
				if (a >= 0 && c >= 10)
				{
					System.out.print(a);
					b = b * 10;
				}
				else
				{
					break;
				}
			}
			if (c > 0)
			{
				System.out.print(c);
			}
			System.out.print("\n");
			num = (-1) * num;
		}
		if (num > 0)
		{
			int b = 1;
			int c = 0;
			int biaoji = 0;
			while (true)
			{
				a = (num / b) % 10;
				c = num / b;
				if (a > 0)
				{
					System.out.print(a);
					biaoji = 1;
					b = b * 10;
					break;
				}
				else
				{
					b = b * 10;
				}
			}
			while (biaoji != 0)
			{
				a = (num / b) % 10;
				c = num / b;
				if (a >= 0 && c >= 10)
				{
					System.out.print(a);
					b = b * 10;
				}
				else
				{
					break;
				}
			}
			if (c > 0)
			{
				System.out.print(c);
			}
			System.out.print("\n");
		}
	}
	public static int Main()
	{
		int c = 0;
		int n;
		for (c = 0;c < 6;c++)
		{
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			reverse(n);
		}

		return 0;
	}
}

