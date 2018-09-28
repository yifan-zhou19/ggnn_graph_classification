package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String word = new String(new char[33]);
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
			 if (word.charAt(word.length() - 2) == 'e' && word.charAt(word.length() - 1) == 'r')
			 {
					  word = tangible.StringFunctions.changeCharacter(word, word.length() - 2, '\0');
					  System.out.printf("%s\n",word);
			 }
			 if (word.charAt(word.length() - 2) == 'l' && word.charAt(word.length() - 1) == 'y')
			 {
					  word = tangible.StringFunctions.changeCharacter(word, word.length() - 2, '\0');
					  System.out.printf("%s\n",word);
			 }
			 if (word.charAt(word.length() - 3) == 'i' && word.charAt(word.length() - 2) == 'n' && word.charAt(word.length() - 1) == 'g')
			 {
					  word = tangible.StringFunctions.changeCharacter(word, word.length() - 3, '\0');
					  System.out.printf("%s\n",word);
			 }
		}
	return 0;
	}
}

