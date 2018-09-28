package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int num;
		int a;
		int b;
		int r;
		num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (a = 3;a <= num / 2;a += 2)
		{
			for (r = 2;r < a;r++)
			{
				if ((a % r) == 0)
				{
					r = a;
				}
			}
			if (r == a)
			{
				b = num - a;
				for (r = 2;r < b;r++)
				{
					if ((b % r) == 0)
					{
						r = b;
					}
				}
			}
			if (r == b)
			{
				System.out.print(a);
				System.out.print(' ');
				System.out.print(b);
				System.out.print('\n');
			}
		}
		return 0;
	}
}

