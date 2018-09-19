package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a = 0;
		int i = 5;
		int m = 0;
		int b;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		do
		{
			System.out.print(n % 10);
			n = n / 10;
		}while (n != 0);
		return 0;
	}

}

