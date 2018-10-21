package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char a;
		char b;
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = a;
		System.out.print(a);
		while (cin.get(a))
		{
			if (a != ' ' || (a == ' ' && b != ' '))
			{
				System.out.print(a);
				b = a;
			}
		}
		return 0;
	}
}

