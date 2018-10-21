package <missing>;

public class GlobalMembers
{
	public static void tran(int n,int sum)
	{
		if (n < 0)
		{
			System.out.print('-');
			n = -n;
		}
		if (n == 0)
		{
			if (sum == 0)
			{
				System.out.print(0);
			}
			System.out.print("\n");
			return;
		}
		sum += n % 10;
		if (sum > 0)
		{
			System.out.print(n % 10);
		}
		n /= 10;
		tran(n, sum);
	}
	public static int Main()
	{
		int n;
		while ((n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			tran(n, 0);
		}
		return 0;
	}
}

