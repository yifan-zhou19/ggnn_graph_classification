package <missing>;

public class GlobalMembers
{
	public static String a = new String(new char[81]);
	public static void do_a()
	{
		if (a.charAt(0) == '\n')
		{
			for (int i = 0; i < a.length() ; i++)
			{
				a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i + 1));

			}
		}
		if (a.charAt(a.length() - 1) == '\n')
		{
			a = tangible.StringFunctions.changeCharacter(a, a.length() - 1, '\0');
		}
	}
	public static int Main()
	{
		int b;
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int t = 0;
		for (int i = 0; i < b;i++)
		{
			cin.getline(a,90, ' ');
			do_a();
			t += a.length();

			if (t >= 81 || t == a.length())
			{
				System.out.print("\n");
				System.out.print(a);
				t = a.length() + 1;
			}
			else
			{
				System.out.print(" ");
				System.out.print(a);
				t += 1;
			}
		}
	}
}

