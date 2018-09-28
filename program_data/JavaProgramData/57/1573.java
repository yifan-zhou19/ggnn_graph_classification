package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int len;
		String letter = new String(new char[200]);
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
				letter = tempVar2.charAt(0);
			}
			len = letter.length();
			if (letter.charAt(len - 2) == 'e' && letter.charAt(len - 1) == 'r')
			{
				letter = tangible.StringFunctions.changeCharacter(letter, len - 2, '\0');
				letter = tangible.StringFunctions.changeCharacter(letter, len - 1, '\0');
			}
			if (letter.charAt(len - 2) == 'l' && letter.charAt(len - 1) == 'y')
			{
				letter = tangible.StringFunctions.changeCharacter(letter, len - 2, '\0');
				letter = tangible.StringFunctions.changeCharacter(letter, len - 1, '\0');
			}
				if (letter.charAt(len - 3) == 'i' && letter.charAt(len - 2) == 'n' && letter.charAt(len - 1) == 'g')

				{
					letter = tangible.StringFunctions.changeCharacter(letter, len - 3, '\0');
					letter = tangible.StringFunctions.changeCharacter(letter, len - 2, '\0');
					letter = tangible.StringFunctions.changeCharacter(letter, len - 1, '\0');
				}

					System.out.printf("%s\n",letter);

				for (int t = 0;t < len;t++)
				{
					letter = tangible.StringFunctions.changeCharacter(letter, t, ' ');
				}

		}
		return 0;
	}
}

