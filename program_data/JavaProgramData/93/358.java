package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int num; //?????
		num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (num % 3 == 0)
		{
			if (num % 7 != 0 && num % 5 != 0)
			{
			System.out.print('3');
			}
			else
			{
			System.out.print('3');
			System.out.print(' ');
			}
		}
		if (num % 5 == 0)
		{
			if (num % 7 != 0)
			{
			System.out.print('5');
			}
			else
			{
			System.out.print('5');
			System.out.print(' ');
			}
		}
		if (num % 7 == 0)
		{
		System.out.print('7');
		}
		if (num % 3 != 0 && num % 5 != 0 && num % 7 != 0)
		{
		System.out.print('n');
		}

		return 0;

	}
}

