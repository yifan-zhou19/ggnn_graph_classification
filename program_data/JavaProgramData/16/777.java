package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n < 10)
		{
			System.out.print(n);
		}
		else if (10 <= n != 0 && n < 100)
		{
			System.out.print(n % 10);
			System.out.print(n / 10);
		}
		else if (n >= 100 && n <= 999)
		{
			System.out.print(n - (n / 10) * 10);
			System.out.print(n / 10 - (n / 100) * 10);
			System.out.print(n / 100);
		}
		else if (n >= 1000 && n <= 9999)
		{
			System.out.print(n - (n / 10) * 10);
			System.out.print(n / 10 - (n / 100) * 10);
			System.out.print(n / 100 - (n / 1000) * 10);
			System.out.print(n / 1000);
		}
		else if (n == 10000)
		{
			System.out.print(00001);
		}
		return 0;
	}

}

