package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n == 1)
		{
			System.out.print("End");
			return 0;
		}
		while (n != 2)
		{
			if (n % 2 != 0)
			{
				System.out.print(n);
				System.out.print('*');
				System.out.print(3);
				System.out.print('+');
				System.out.print(1);
				System.out.print('=');
				n = n * 3 + 1;
				System.out.print(n);
				System.out.print("\n");
			}
			else
			{
				System.out.print(n);
				System.out.print('/');
				System.out.print(2);
				System.out.print('=');
				n = n / 2;
				System.out.print(n);
				System.out.print("\n");
			}
		}
		System.out.print(2);
		System.out.print('/');
		System.out.print(2);
		System.out.print('=');
		System.out.print(1);
		System.out.print("\n");
		System.out.print("End");
		return 0;
	}

}

