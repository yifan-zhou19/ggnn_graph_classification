package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int l;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String word = new String(new char[max + 1]);
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				word = tempVar2.charAt(0);
			}
			l = word.length();
			if (strcmp(word.charAt(l - 1), "r") == 0)
			{
				word = tangible.StringFunctions.changeCharacter(word, l - 2, word.charAt(l - 2) - 'e'+'\0');
			}
			else if (strcmp(word.charAt(l - 1), "y") == 0)
			{
				word = tangible.StringFunctions.changeCharacter(word, l - 2, word.charAt(l - 2) - 'l'+'\0');
			}
			else if (strcmp(word.charAt(l - 1), "g") == 0)
			{
				word = tangible.StringFunctions.changeCharacter(word, l - 3, word.charAt(l - 3) - 'i'+'\0');
			}
			System.out.printf("%s\n",word);
		}
		return 0;
	}

}

