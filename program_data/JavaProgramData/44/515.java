package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		void f(int x);
		int n;
		int i;
		for (i = 0;i < 6;i++)
		{
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (n > 0) //?n?????
			{
				while (n % 10 == 0)
				{
					n = n / 10;
				}
				f(n);
				System.out.print("\n");
			}
			if (n < 0)
			{
				n = -n;
				while (n % 10 == 0)
				{
					n = n / 10;
				}
				System.out.print('-');
				f(n);
				System.out.print("\n");
			}
			if (n == 0)
			{
				System.out.print('0');
				System.out.print("\n");
			}
		}
		return 0;
	}
	public static void f(int x) //??????
	{
		System.out.print(x % 10);
		if ((x / 10) > 0)
		{
			x = x / 10;
			f(x);
		}
	}
}

