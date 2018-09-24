package <missing>;

public class GlobalMembers
{
	public static double i = 0;
	public static int reverse(int n)
	{
		if (n < 10)
		{
			return n;
		}
		int t;
		t = reverse(n / 10);
		i++;
		return (n % 10) * Math.pow(10.0,i) + t;
	}
	public static int Main()
	{
		int n;
		while ((n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			if (n == 0)
			{
				System.out.print("0");
				System.out.print("\n");
				continue;
			}
			if (n < 0)
			{
				System.out.print("-");
				n = -n;
			}

			i = 0;

			System.out.print(reverse(n));
			System.out.print("\n");
		}

		return 0;
	}
}

