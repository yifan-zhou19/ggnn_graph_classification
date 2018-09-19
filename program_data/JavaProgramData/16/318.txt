package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a = 0;
		int b = 0;
		int c = 0;
		int i = 1;
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		do
		{
			c = a % 10;
			a = (a - c) / 10;
			System.out.print(c);
		} while (a != 0);

		System.out.print("\n");


		return 0;
	}
}

