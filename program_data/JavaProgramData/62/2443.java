package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char a;
		char b;
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		System.out.print(a);
		while ((b = System.in.read()) && (b != '\n'))
		{
			if (b != ' ')
			{
				System.out.print(b);
			}
			if (b == ' ' && a != ' ')
			{
				System.out.print(b);
			}

			a = b;
		}
		return 0;
	}

}

