package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[15]);
		String substr = new String(new char[4]);
		while ((str = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0 && (substr = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0)
		{
			int i;
			int position;
			int length;
			char max = str.charAt(0);
			length = str.length();
			for (i = 1;i < length; i++)
			{
				if (str.charAt(i) > max)
				{
					max = str.charAt(i);
					position = i;
				}
			}
			for (i = length - 1; i >= position + 1; i--)
			{
				str = tangible.StringFunctions.changeCharacter(str, i + 3, str.charAt(i));
			}
			for (i = position + 1; i < position + 4; i++)
			{
				str = tangible.StringFunctions.changeCharacter(str, i, substr.charAt(i - position - 1));
			}
			str = tangible.StringFunctions.changeCharacter(str, length + 3, '\0');
			System.out.print(str);
			System.out.print("\n");
		}
		return 0;
	}



}

