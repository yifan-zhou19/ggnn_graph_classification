package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1;;i++)
		{
			b = a % 10;
			System.out.print(b);
			c = a / 10;
			if (c == 0)
			{
				break;
			}
			a = c;
		}
	}

}

