package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int l1;
		int l2;
		int j = 251;
		int up = 0;
		int m;
		String a = new String(new char[251]);
		String a2 = new String(new char[252]);
		String b = new String(new char[251]);
		String b2 = new String(new char[252]);
		String result = new String(new char[252]);
		m = 0;
		up = 0;
			a = ConsoleInput.readToWhiteSpace(true).charAt(0);
			b = ConsoleInput.readToWhiteSpace(true).charAt(0);
			l1 = a.length();
			l2 = b.length();
			for (i = 0; i < 251; i++)
			{
				a2 = tangible.StringFunctions.changeCharacter(a2, i, '0');
				b2 = tangible.StringFunctions.changeCharacter(b2, i, '0');
				result = tangible.StringFunctions.changeCharacter(result, i, '0');
			}
			j = 250;
			for (i = l1 - 1; i >= 0; i--)
			{
				a2 = tangible.StringFunctions.changeCharacter(a2, j, a.charAt(i));
				j--;
			}
			j = 250;
			for (i = l2 - 1; i >= 0; i--)
			{
				b2 = tangible.StringFunctions.changeCharacter(b2, j, b.charAt(i));
				j--;
			}
			b2 = tangible.StringFunctions.changeCharacter(b2, 251, '\0');
			a2 = tangible.StringFunctions.changeCharacter(a2, 251, '\0');
			result = tangible.StringFunctions.changeCharacter(result, 251, '\0');
			for (i = 250; i >= 0; i--)
			{
				m = (up + ((a2.charAt(i) - '0') + (b2.charAt(i) - '0'))) % 10;
				result = tangible.StringFunctions.changeCharacter(result, i, m + '0');
				up = (up + (a2.charAt(i) - '0') + (b2.charAt(i) - '0')) / 10;
			}
			for (i = 0; i < 250; i++)
			{
				if (result.charAt(i) != '0')
				{
					break;
				}
			}
			System.out.print(result.Substring(i));
			System.out.print("\n");
		return 0;
	}
}

