package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (k % 3 == 0)
		{
			System.out.print(3);
			if (k % 5 == 0)
			{
				System.out.print(' ');
				System.out.print(5);
				if (k % 7 == 0)
				{
					System.out.print(' ');
					System.out.print(7);
				}
			}
			else
			{
				if (k % 7 == 0)
				{
					System.out.print(' ');
					System.out.print(7);
				}
			}
		}
		else
		{
			if (k % 5 == 0)
			{
				System.out.print(5);
				if (k % 7 == 0)
				{
					System.out.print(' ');
					System.out.print(7);
				}
			}
			else
			{
				if (k % 7 == 0)
				{
					System.out.print(7);
				}
			}
		}
		if (k % 3 != 0 && k % 5 != 0 && k % 7 != 0)
		{
			System.out.print('n');
		}
		return 0;
	}
}

