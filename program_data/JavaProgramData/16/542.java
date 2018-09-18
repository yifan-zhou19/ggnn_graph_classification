package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int t;
		int s;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n == 0)
		{
			System.out.print("0");
		}
		else
		{
			for (int i = 10; i <= 100000; i *= 10)
			{
				t = n % i;
				s = t * 10 / i;
				if (s <= 9 && n != 0)
				{
					System.out.print(s);
					n -= t;
				}
				else
				{
					break;
				}
			}
		}
		System.out.print("\n");
		return 0;
	}
}

