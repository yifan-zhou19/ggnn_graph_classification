package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String word = new String(new char[32]);
		int n;
		int length;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				word = tempVar2.charAt(0);
			}
			length = word.length();
			if (strcmp(word.Substring(length) - 2,"er") == 0 || strcmp(word.Substring(length) - 2,"ly") == 0)
			{
			word = tangible.StringFunctions.changeCharacter(word, length - 2, '\0');
			}
			else if (strcmp(word.Substring(length) - 3,"ing") == 0)
			{
			word = tangible.StringFunctions.changeCharacter(word, length - 3, '\0');
			}
			System.out.printf("%s\n",word);
		}
	}
}

