package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		int a;
		String word = new String(new char[20]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				word = tempVar2.charAt(0);
			}
			a = word.length();
			if (word.charAt(a - 1) == 'r')
			{
				word = tangible.StringFunctions.changeCharacter(word, a - 1, '\0');
					word = tangible.StringFunctions.changeCharacter(word, a - 2, '\0');
			}
			if (word.charAt(a - 1) == 'y')
			{
				word = tangible.StringFunctions.changeCharacter(word, a - 1, '\0');
					word = tangible.StringFunctions.changeCharacter(word, a - 2, '\0');
			}
			if (word.charAt(a - 1) == 'g')
			{
				word = tangible.StringFunctions.changeCharacter(word, a - 1, '\0');
					word = tangible.StringFunctions.changeCharacter(word, a - 2, '\0');
					word = tangible.StringFunctions.changeCharacter(word, a - 3, '\0');
			}
		 System.out.printf("%s\n",word);
		}

	}

}

