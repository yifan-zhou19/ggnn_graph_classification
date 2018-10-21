package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (true)
		{
			while (a > b)
			{
				a = a / 2;
			}
			while (b > a)
			{
				b = b / 2;
			}
			if (a == b)
			{
				break;
			}
		}
		System.out.print(a);
		System.out.print("\n");
	}

}

