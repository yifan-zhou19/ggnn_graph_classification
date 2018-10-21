package <missing>;

public class GlobalMembers
{
	public static void search(String s, int i)
	{
		int k;
		String s1 = new String(new char[501]);
		String s2 = new String(new char[501]);
		for (int j = 0; !s[j].equals('\0');j++)
		{
			for (k = j;k < j + i;k++)
			{
				s1 = tangible.StringFunctions.changeCharacter(s1, k - j, s[k]);
			}
			s1 = tangible.StringFunctions.changeCharacter(s1, k - j, '\0');
			for (k = 0;k < i;k++)
			{
				s2 = tangible.StringFunctions.changeCharacter(s2, k, s[j + i - 1 - k]);
			}
			s2 = tangible.StringFunctions.changeCharacter(s2, i, '\0');
			if (strcmp(s1,s2) == 0)
			{
				System.out.print(s1);
				System.out.print("\n");
			}
		}
	}
	public static int Main()
	{
		String s = new String(new char[501]);
		s = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int i;
		for (i = 2;s.charAt(i) != '\0';i++)
		{
			search(s, i);
		}

		return 0;
	}
}

