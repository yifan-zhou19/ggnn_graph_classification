package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[14]);
		String substr = new String(new char[4]);
		while ((str = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0 && (substr = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0)
		{
			int i;
			int j;
			int k = 0;
			int len = str.length();
			char max = 1;
			for (i = 0;i < len;i++)
			{
				if (max < str.charAt(i))
				{
					max = str.charAt(i);
				}
			}
			for (j = 0;j < len;j++)
			{
				if (max == str.charAt(j))
				{
					break;
				}
			}
			for (i = len + 2;i > j + 3;i--)
			{
				str = tangible.StringFunctions.changeCharacter(str, i, str.charAt(i - 3));
			}
			str = tangible.StringFunctions.changeCharacter(str, len + 3, '\0');
			for (i = j + 1;i < j + 4;i++)
			{
				str = tangible.StringFunctions.changeCharacter(str, i, substr.charAt(k++));
			}
			System.out.print(str);
			System.out.print("\n");
		}
		return 0;
	}
}

