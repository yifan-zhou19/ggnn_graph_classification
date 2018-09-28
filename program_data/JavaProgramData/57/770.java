package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int a;
		String num = new String(new char[4]);
		num = new Scanner(System.in).nextLine();
		n = Integer.parseInt(num);
		for (i = 0;i < n;i++)
		{
			String word = new String(new char[33]);
			word = new Scanner(System.in).nextLine();
			a = word.length();
			if (word.charAt(a - 1) == 103 && word.charAt(a - 2) == 110 && word.charAt(a - 3) == 105)
			{
				word = tangible.StringFunctions.changeCharacter(word, a - 3, '\0');
			}
			else if (word.charAt(a - 1) == 121 && word.charAt(a - 2) == 108)
			{
				word = tangible.StringFunctions.changeCharacter(word, a - 2, '\0');
			}
			else if (word.charAt(a - 1) == 114 && word.charAt(a - 2) == 101)
			{
				word = tangible.StringFunctions.changeCharacter(word, a - 2, '\0');
			}
			System.out.println(word);
		}
		return 0;
	}




}

