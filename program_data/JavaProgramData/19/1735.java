package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[100]);
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		int i = 0;
		int j = 0;
		int count = 0;
		cin.get(s,100);
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = ConsoleInput.readToWhiteSpace(true).charAt(0);
		for (i = 0;i <= s.length() - a.length();i++)
		{
			count = 0;
			for (j = i;j < i + a.length();j++)
			{
				if (s.charAt(j) == a.charAt(j - i))
				{
					count++;
				}
			}
			if (count == a.length() && ((s.charAt(i + a.length()) == ' ' || i + a.length() == s.length()) && (s.charAt(i - 1) == ' ' || i == 0)))
			{
				for (j = i;j < i + a.length();j++)
				{
					s = tangible.StringFunctions.changeCharacter(s, j, '/');
				}
			}
		}
		for (i = 0;i < s.length();i++)
		{
			if (s.charAt(i) != '/')
			{
				System.out.print(s.charAt(i));
			}
			else
			{
				for (j = 0;j < b.length();j++)
				{
					System.out.print(b.charAt(j));
				}
				do
				{
					i++;
				}while (s.charAt(i) == '/' && (i + 1 == s.length() || s.charAt(i + 1) == '/'));
			}
		}
		return 0;
	}

}

