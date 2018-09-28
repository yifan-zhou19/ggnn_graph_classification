package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i = 1;
		int c;
		int sum = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (i <= n != 0 && i <= 10)
		{
			if ((i % 7) && ((i - 7) % 10))
			{
				sum += i * i;
			}
			i = i + 1;
		}
		while (i <= n)
		{
			c = i / 10;
			if ((i % 7) && ((i - 7) % 10) && (c % 7))
			{
				sum += i * i;
			}
			i = i + 1;
		}
			System.out.print(sum);
			System.out.print("\n");
		return 0;
	}
}

