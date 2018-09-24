package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str1 = new String(new char[100]);
		String str2 = new String(new char[100]);
		char temp;
		int i;
		int j;
		str1 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		str2 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		if (str1.length() == str2.length())
		{
			for (i = 0; i < str1.length() - 1; i++)
			{
				for (j = i + 1; j < str1.length(); j++)
				{
					if (str1.charAt(i) > str1.charAt(j))
					{
						temp = str1.charAt(i);
						str1 = tangible.StringFunctions.changeCharacter(str1, i, str1.charAt(j));
						str1 = tangible.StringFunctions.changeCharacter(str1, j, temp);
					}
				}
			}
			for (i = 0; i < str2.length() - 1; i++)
			{
				for (j = i + 1; j < str2.length(); j++)
				{
					if (str2.charAt(i) > str2.charAt(j))
					{
						temp = str2.charAt(i);
						str2 = tangible.StringFunctions.changeCharacter(str2, i, str2.charAt(j));
						str2 = tangible.StringFunctions.changeCharacter(str2, j, temp);
					}
				}
			}
			if (strcmp(str1, str2) == 0)
			{
				System.out.print("YES");
				System.out.print("\n");
			}
			else
			{
				System.out.print("NO");
				System.out.print("\n");
			}
		}
		else
		{
			System.out.print("NO");
			System.out.print("\n");
		}
			return 0;
	}
}

