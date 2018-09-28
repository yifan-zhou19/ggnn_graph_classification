package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String word = new String(new char[33]);
		String suffix = new String(new char[4]);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < n; ++i)
		{
			word = ConsoleInput.readToWhiteSpace(true).charAt(0);
			int len = word.length();
			if (word.charAt(len - 1) == 'r' && word.charAt(len - 2) == 'e')
			{
				word = tangible.StringFunctions.changeCharacter(word, len - 2, '\0');
				System.out.print(word);
				System.out.print("\n");
			}
			else if (word.charAt(len - 1) == 'y' && word.charAt(len - 2) == 'l')
			{
				word = tangible.StringFunctions.changeCharacter(word, len - 2, '\0');
				System.out.print(word);
				System.out.print("\n");
			}
			else if (word.charAt(len - 1) == 'g' && word.charAt(len - 2) == 'n' && word.charAt(len - 3) == 'i')
			{
				word = tangible.StringFunctions.changeCharacter(word, len - 3, '\0');
				System.out.print(word);
				System.out.print("\n");
			}
			else
			{
				System.out.print(word);
				System.out.print("\n");
			}
		}
		return 0;
	}
}

