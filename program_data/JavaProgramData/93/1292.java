package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] num = {0, 0, 0};
		int count;

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		if (n % 3 == 0)
		{
		num[0] = 1;
		}

		if (n % 5 == 0)
		{
		num[1] = 1;
		}

		if (n % 7 == 0)
		{
		num[2] = 1;
		}

		count = num[0] + num[1] + num[2];

		if (num[0] == 1)
		{
		if (count != 1)
		{
		System.out.print(3);
		System.out.print(" ");
		}
		else
		{
		System.out.print(3);
		}

		count = count - 1;

		}

		if (num[1] == 1)
		{
			if (count != 1)
			{
			System.out.print(5);
			System.out.print(" ");
			}
			else
			{
			System.out.print(5);
			}
		}

		if (num[2] == 1)
		{
		System.out.print(7);
		}

		if (num[0] == 0 && num[1] == 0 && num[2] == 0)
		{
		System.out.print('n');
		}

		return 0;
	}

}

