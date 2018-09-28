package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int len;
		int i;
		int j;
		int a = 0;
		String str = new String(new char[256]);
		String sub = new String(new char[256]);
		String rep = new String(new char[256]);
		String word = new String(new char[256]);
		str = new Scanner(System.in).nextLine();
		sub = new Scanner(System.in).nextLine();
		rep = new Scanner(System.in).nextLine();
		len = sub.length();
		for (i = 0;str.charAt(i) != 0;i++)
		{
			if (str.charAt(i) == sub.charAt(0))
			{
				for (j = 0;j < len;j++)
				{
					word = tangible.StringFunctions.changeCharacter(word, j, str.charAt(i + j));
				}
				word = tangible.StringFunctions.changeCharacter(word, len, '\0');
				if (strcmp(word,sub) == 0)
				{
					word = rep;
					for (j = 0;j < i;j++)
					{
						System.out.printf("%c",str.charAt(j));
					}
					System.out.printf("%s",word);
					for (j = i + len;str.charAt(j) != 0;j++)
					{
						System.out.printf("%c",str.charAt(j));
					}
					a = 1;
					break;
				}
			}
		}
		if (a == 0)
		{
			System.out.printf("%s",str);
		}
		return 0;
	}
}

