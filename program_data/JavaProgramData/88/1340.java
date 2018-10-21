package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		while (!cin.eof())
		{
			while (!cin.eof() && !Character.isDigit(cin.peek())) // not digit
			{
				System.in.read(); // ignore
			}
			if ((a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0) // digit, not eof
			{
				System.out.print(a);
				System.out.print("\n");
			}
		}
		return 0;
	}

}

