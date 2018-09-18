package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (;;)
		{
			System.out.printf("%d",n % 10);
			if (n < 10)
			{
				break;
			}
			n = n / 10;
		}
		return 0;
	}
}

