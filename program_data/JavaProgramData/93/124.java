package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int b3 = 0;
		int b5 = 0;
		int b7 = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n % 3 == 0)
		{
		System.out.print(3);
		b3 = 1;
		}
		if (n % 5 == 0)
		{
		if (b3 != 0)
		{
		System.out.print(' ');
		}
		System.out.print(5);
		b5 = 1;
		}
		if (n % 7 == 0)
		{
		if (b3 != 0 || b5 != 0)
		{
		System.out.print(' ');
		}
		System.out.print(7);
		b7 = 1;
		}
		if (b3 == 0 && b5 == 0 && b7 == 0)
		{
		System.out.print('n');
		}

	}

}

