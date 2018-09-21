package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n = 0;
		int i;
		int l;
		char t;
		String word = new String(new char[101]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		word = new Scanner(System.in).nextLine();
		l = word.length();
		word = tangible.StringFunctions.changeCharacter(word, l, '\0');
		for (i = 0;i < l;i++)
		{
			if (word.charAt(i) == ' ')
			{
				word = tangible.StringFunctions.changeCharacter(word, i, '\0');
			}
		}
		p = word.Substring(l) - 1;
		while (p != word)
		{
			if (*p == '\0')
			{
				System.out.printf("%s ",p + 1);
			}
			p--;
		}
		System.out.printf("%s\n",p);
	}
}

