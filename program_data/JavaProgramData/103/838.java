package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final String a = "";
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		char b = a.charAt(0);
		int i = 0;
		int count = 0;
		while (true)
		{
			if (a.charAt(i) == b || a.charAt(i) == b - 32 || a.charAt(i) == b + 32)
			{
				count++;
				i++;
			}
			else if (a.charAt(i) != b && a.charAt(i) != b - 32 && a.charAt(i) != b + 32)
			{
				if (a.charAt(i - 1) < 97)
				{
					char c = a.charAt(i - 1);
					System.out.print("(");
					System.out.print(c);
					System.out.print(",");
					System.out.print(count);
					System.out.print(")");
				}
				else if (a.charAt(i - 1) >= 97)
				{
					char d = a.charAt(i - 1) - 32;
					System.out.print("(");
					System.out.print(d);
					System.out.print(",");
					System.out.print(count);
					System.out.print(")");
				}
				count = 0;
				b = a.charAt(i);
			}
			if (a.charAt(i) == '\0')
			{
				if (a.charAt(i - 1) < 97)
				{
					char e = a.charAt(i - 1);
					System.out.print("(");
					System.out.print(e);
					System.out.print(",");
					System.out.print(count);
					System.out.print(")");
				}
				else if (a.charAt(i - 1) >= 97)
				{
					char f = a.charAt(i - 1) - 32;
					System.out.print("(");
					System.out.print(f);
					System.out.print(",");
					System.out.print(count);
					System.out.print(")");
				}
				break;
			}
		}
	}

}

