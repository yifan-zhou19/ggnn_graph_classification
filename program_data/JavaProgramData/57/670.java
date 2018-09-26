package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String word = new String(new char[32]);
		char n;
		char i;
		char j;
		char k;
		char len;
		String temp = new String(new char[32]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = tempVar.charAt(0);
		}
		for (i = 1;i <= n;i++)
		{
			word = new Scanner(System.in).nextLine();
			len = word.length();
			for (j = len - 2;j <= len;j++)
			{
				temp = tangible.StringFunctions.changeCharacter(temp, j - len + 2, word.charAt(j));
			}
			if (strcmp(temp,"er") == 0 || strcmp(temp,"ly") == 0)
			{
				word = tangible.StringFunctions.changeCharacter(word, len - 2, '\0');
				System.out.printf("%s\n",word);
			}
			for (j = len - 3;j <= len;j++)
			{
				temp = tangible.StringFunctions.changeCharacter(temp, j - len + 3, word.charAt(j));
			}
			if (strcmp(temp,"ing") == 0)
			{
				word = tangible.StringFunctions.changeCharacter(word, len - 3, '\0');
				System.out.printf("%s\n",word);
			}
		}
		return 0;
	}
}

