package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String word = new String(new char[1000]);
		int i;
		for (i = 0; i < n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				word = tempVar2.charAt(0);
			}
			int len = word.length();
			switch (word.charAt(len - 1))
			{
				case 'r':
					if (word.charAt(len - 2) == 'e')
					{
						word = tangible.StringFunctions.changeCharacter(word, len - 2, '\0');
					}
					break;
				case 'y':
					if (word.charAt(len - 2) == 'l')
					{
						word = tangible.StringFunctions.changeCharacter(word, len - 2, '\0');
					}
					break;
				case 'g':
					if (word.charAt(len - 2) == 'n' && word.charAt(len - 3) == 'i')
					{
						word = tangible.StringFunctions.changeCharacter(word, len - 3, '\0');
					}
					break;
			}
			System.out.printf("%s\n",word);
		}

		return 0;
	}

}

