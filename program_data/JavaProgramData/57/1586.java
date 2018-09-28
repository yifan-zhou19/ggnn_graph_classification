package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		String word = new String(new char[50]);
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
			j = word.length();
			if (word.charAt(j - 3) == 'i')
			{
				word = tangible.StringFunctions.changeCharacter(word, j - 3, '\0');
			}
			else
			{
				word = tangible.StringFunctions.changeCharacter(word, j - 2, '\0');
			}
			System.out.printf("%s\n",word);
		}
		return 0;
	}
}

