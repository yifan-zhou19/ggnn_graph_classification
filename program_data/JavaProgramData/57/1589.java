package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String word = new String(new char[20]);
		String newword = new String(new char[20]);
		int i;
		int j;
		int len;
		int n;
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
			len = word.length();
			if (word.charAt(len - 3) == 'i' && word.charAt(len - 2) == 'n' && word.charAt(len - 1) == 'g')
			{
			   for (j = 0;j < len - 3;j++)
			   {
				  newword = tangible.StringFunctions.changeCharacter(newword, j, word.charAt(j));
			   }
			   newword = tangible.StringFunctions.changeCharacter(newword, j, '\0');
			}
			else
			{
				 for (j = 0;j < len - 2;j++)
				 {
					newword = tangible.StringFunctions.changeCharacter(newword, j, word.charAt(j));
				 }
				 newword = tangible.StringFunctions.changeCharacter(newword, j, '\0');

			}
			System.out.printf("%s\n",newword);
		}
		return 0;
	}
}

