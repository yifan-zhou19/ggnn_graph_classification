package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[1001]);
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int i;
		int j;
		int k;
		int f = 1;
		int f2 = 0;
		for (i = 0;i < a.length();i++)
		{
			if (a.charAt(i) == 'a')
			{
				a = tangible.StringFunctions.changeCharacter(a, i, 'A');
			}
			if (a.charAt(i) == 'b')
			{
				a = tangible.StringFunctions.changeCharacter(a, i, 'B');
			}
			if (a.charAt(i) == 'c')
			{
				a = tangible.StringFunctions.changeCharacter(a, i, 'C');
			}
			if (a.charAt(i) == 'd')
			{
				a = tangible.StringFunctions.changeCharacter(a, i, 'D');
			}
		}
		for (i = 1;i < a.length();i++)
		{
			if (a.charAt(i) == a.charAt(i - 1))
			{
				f++;
			f2++;
			}
			else
			{
				System.out.print("(");
				System.out.print(a.charAt(i - 1));
				System.out.print(",");
				System.out.print(f);
				System.out.print(")");
				f = 1;
				f2 = 0;
			}
		}

		System.out.print("(");
		System.out.print(a.charAt(a.length() - 1));
		System.out.print(",");
		System.out.print(f);
		System.out.print(")");
		return 0;
	}

}

