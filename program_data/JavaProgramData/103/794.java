package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int count = 1;
		String a = new String(new char[1005]);
		char x;
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		for (i = 0; i < a.length(); i++)
		{
			if (a.charAt(i) > 96 && a.charAt(i) < 123)
			{
				a.charAt(i) -= 32;
			}
		}
		for (i = 0; i < a.length();)
		{
			x = a.charAt(i);
			for (j = i + 1; j < a.length(); j++)
			{
				if (x != a.charAt(j))
				{
					System.out.print("(");
					System.out.print(a.charAt(i));
					System.out.print(",");
					System.out.print(j - i);
					System.out.print(")");
					break;
				}
			}
			if (j == a.length())
			{
				System.out.print("(");
				System.out.print(a.charAt(i));
				System.out.print(",");
				System.out.print(j - i);
				System.out.print(")");
			}
			i = j;
		}

		return 0;
	}
}

