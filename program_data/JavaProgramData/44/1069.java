package <missing>;

public class GlobalMembers
{
	public static int reverse(int num)
	{
		if (num == 0 || num == -0)
		{
			return 0;
		}

		int x = Math.abs(num);

		if (num < 0)
		{
			System.out.print("-");
		}

		while (x % 10 == 0)
		{
			x /= 10;
		}

		while (x != 0)
		{
			System.out.printf("%d", x % 10);
			x /= 10;
		}

		System.out.print("\n");
		return 1;
	}

	public static int Main()
	{
		int num;
		int i;
		for (i = 0;i < 6;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				num = Integer.parseInt(tempVar);
			}

			if (reverse(num) == 0)
			{
				System.out.print("0\n");
			}
		}

		return 0;
	}
}

