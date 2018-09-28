package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String word = new String(new char[100]);
		int n;
		int len;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (n-- != 0)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				word = tempVar2.charAt(0);
			}
			len = word.length();
			if (word.charAt(len - 1) == 'r' || word.charAt(len - 1) == 'y')
			{
					word = tangible.StringFunctions.changeCharacter(word, len - 2, '\0');
			}
			else if (word.charAt(len - 1) == 'g')
			{
				word = tangible.StringFunctions.changeCharacter(word, len - 3, '\0');
			}
		System.out.printf("%s\n",word);
		}
		return 0;
	}


}

