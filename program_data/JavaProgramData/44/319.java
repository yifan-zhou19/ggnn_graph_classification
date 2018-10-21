package <missing>;

public class GlobalMembers
{
	public static int reverse(int number)
	{
		int result = 0;
		int left = number;
		int posOrNot = 1;
		if (number < 0)
		{
			posOrNot = 0;
			left = Math.abs(number);
		}

		while (left > 0)
		{
			result = result * 10 + left % 10;
			left = left / 10;
		}

		if (posOrNot == 0)
		{
			result = -result;
		}

		return result;
	}

	public static int Main()
	{
		int i = 0;
		int number = 0;
		for (i = 0; i < 6; i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				number = Integer.parseInt(tempVar);
			}
			System.out.printf("%d\n", reverse(number));
		}
		return 0;
	}

}

