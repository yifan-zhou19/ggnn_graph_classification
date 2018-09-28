package <missing>;

public class GlobalMembers
{
	public static int clear(int num)
	{
		while (num % 10 == 0)
		{
			num = num / 10;
		}
		return num;
	}

	public static int reverse(int num)
	{
		if (num != 0)
		{
			System.out.print((num % 10));
			reverse(num / 10);
		}
		return 0;

	}
	public static int Main()
	{
		for (int i = 0;i < 6;i++)
		{
			int num;
			num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (num < 0)
			{
				System.out.print('-');
				num = Math.abs(num);
			}
			if (num == 0)
			{
				System.out.print('0');
			}
			else
			{
			   num = clear(num);
			   reverse(num);

			}
			if (i != 6)
			{
				System.out.print("\n");
			}

		}
	}
}

