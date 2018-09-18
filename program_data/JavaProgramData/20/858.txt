package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[11]);
		String substr = new String(new char[4]);
		String a = new String(new char[13]);
		int i;
		while ((str = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0 && (substr = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0)
		{
			char max = str.charAt(0);
			for (int i = 0;i < 10;i++)
			{
				if (str.charAt(i) > max)
				{
					max = str.charAt(i);
				}
			}
			int m = 0;
			for (i = 0;i < 10;i++)
			{
				if (str.charAt(i) == max)
				{
					m = i;
					break;
				}
			}
			for (i = 0;i <= m;i++)
			{
				a = tangible.StringFunctions.changeCharacter(a, i, str.charAt(i));
			}
			for (i = 0;i < 3;i++)
			{
				a = tangible.StringFunctions.changeCharacter(a, m + 1 + i, substr.charAt(i));
			}
			for (i = m + 1;i < str.length();i++)
			{
				a = tangible.StringFunctions.changeCharacter(a, i + 3, str.charAt(i));
			}
			a = tangible.StringFunctions.changeCharacter(a, str.length() + 3, '\0');
			for (i = 0;i < a.length();i++)
			{
				System.out.print(a.charAt(i));
			}
			System.out.print("\n");
		}
		return 0;
	}


}

