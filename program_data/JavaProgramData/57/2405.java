package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int n;
		int t;
		final String word = "";
		final String temp = "";
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
				word = tangible.StringFunctions.changeCharacter(word, i, tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			t = String.valueOf(word.charAt(i)).length();
			if (word.charAt(i)[t - 1] == 'r' || word.charAt(i)[t - 1] == 'y')
			{
				temp = String.valueOf(word.charAt(i)).substring(0, t - 2);
				word = tangible.StringFunctions.changeCharacter(word, i, temp);
			}
			else
			{
				temp = String.valueOf(word.charAt(i)).substring(0, t - 3);
				word = tangible.StringFunctions.changeCharacter(word, i, temp);
			}
			for (t = 0;t < 20;t++)
			{
				temp = tangible.StringFunctions.changeCharacter(temp, t, '\0');
			}
			System.out.printf("%s\n",word.charAt(i));
		}
	}

}

