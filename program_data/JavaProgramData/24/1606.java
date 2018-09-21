package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[453]);

		char[][] words = new char[100][101];

		int i;
		int k;
		int n;

		// ???????
		s = new Scanner(System.in).nextLine();


		// ?s???????????words?
		n = 0;
		k = 0;
		for (i = 0; s.charAt(i) != 0; i++)
		{
			if (s.charAt(i) == ' ' || s.charAt(i) == ',')
			{
				s = tangible.StringFunctions.changeCharacter(s, i, '\0');
				words[n] = (s.Substring(k));
				n++;
				k = i + 1;
			}
		}
		words[n] = (s.Substring(k));
		n++;


		// ????words??????
		int maxlen = 0;
		int minlen = 0;
		for (i = 0; i < n; i++)
		{
			if (words[i][0] != '\0')
			{
		   if (String.valueOf(words[maxlen]).length() < String.valueOf(words[i]).length())
		   {
		   maxlen = i;
		   }

		   if (String.valueOf(words[minlen]).length() > String.valueOf(words[i]).length())
		   {
		   minlen = i;
		   }
			}
		}
		System.out.printf("%s\n%s\n",words[maxlen],words[minlen]);

		return 0;
	}


}

