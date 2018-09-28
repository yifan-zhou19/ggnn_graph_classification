package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int a = 0;
	int b = 0;
	int c = 0;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	if (n % 3 == 0)
	{
		a = 1;
		System.out.print(3);
	}
	if (n % 5 == 0)
	{
		b = 1;
		if (a != 0)
		{
			System.out.print(" ");
		}
		System.out.print(5);
	}
	if (n % 7 == 0)
	{
		c = 1;
		if (a + b != 0)
		{
			System.out.print(" ");
		}
		System.out.print(7);
	}
	if (a + b + c == 0)
	{
		System.out.print("n");
	}
	System.out.print("\n");
	return 0;
	}
}

