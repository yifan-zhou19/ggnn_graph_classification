package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		b = 0;
		while (a != 0)
		{
			b = b * 10 + a % 10;
			a = a / 10;
		}
		System.out.print(b);
		System.out.print("\n");
		return 0;
	}

}

