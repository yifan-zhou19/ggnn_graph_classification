package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		do
		{
			System.out.print((n % 10));
			n /= 10;
		}while (n > 0);
			return 0;
	}

}

