package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str1 = new String(new char[1000]);
		str1 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		String str2 = new String(new char[1000]);
		str2 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int len1 = str1.length();
		int len2 = str2.length();
		int i;
		int j;
		for (i = 0;i < len1 - 1;i++)
		{
			for (j = 0;j < len1 - 1 - i;j++)
			{
				if (str1.charAt(j) > str1.charAt(j + 1))
				{
					char tmp = str1.charAt(j);
					str1 = tangible.StringFunctions.changeCharacter(str1, j, str1.charAt(j + 1));
					str1 = tangible.StringFunctions.changeCharacter(str1, j + 1, tmp);
				}
			}
		}


			for (i = 0;i < len2 - 1;i++)
			{
			for (j = 0;j < len2 - 1 - i;j++)
			{
				if (str2.charAt(j) > str2.charAt(j + 1))
				{
					char tmp = str2.charAt(j);
					str2 = tangible.StringFunctions.changeCharacter(str2, j, str2.charAt(j + 1));
					str2 = tangible.StringFunctions.changeCharacter(str2, j + 1, tmp);
				}
			}
			}
			//puts(str1);
			//puts(str2);
			if (strcmp(str1,str2) == 0)
			{
				System.out.print("YES");
				System.out.print("\n");
			}
			else
			{
				System.out.print("NO");
				System.out.print("\n");
			}
	return 0;
	}
}

