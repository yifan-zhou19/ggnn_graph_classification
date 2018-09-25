package <missing>;

public class GlobalMembers
{
	/*1200012866 ???*/
	public static int Main()
	{
		String a = new String(new char[1010]);
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		for (int i = 0;i < a.length();i++) //???????
		{
			if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z')
			{
				a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) + 'A'-'a');
			}
		}
		int len = 0;
		char before = '\0';
		for (int i = 0;i < a.length();i++)
		{
			if (a.charAt(i) == before) //?????
			{
				len++;
			}
			else
			{ //?????????
				if (before != '\0')
				{
					System.out.print('(');
					System.out.print(before);
					System.out.print(',');
					System.out.print(len);
					System.out.print(')');
				}
				before = a.charAt(i);
				len = 1;
			}
		}
		System.out.print('(');
		System.out.print(before);
		System.out.print(',');
		System.out.print(len);
		System.out.print(')');
		System.out.print("\n");

		return 0;
	}
}

