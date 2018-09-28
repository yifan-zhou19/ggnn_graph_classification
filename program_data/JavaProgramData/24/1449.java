package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[1000]);
		char[][] word = new char[100][20];
		s = new Scanner(System.in).nextLine();
		int l;
		int i;
		int k = 0;
		int n = 0;
		l = s.length();
		for (i = 0;i < l;i++)
		{
			if (s.charAt(i) == ' ')
			{
				s = tangible.StringFunctions.changeCharacter(s, i, '\0');
				word[n] = s.Substring(k);
				n++;
				k = i + 1;
			}
		}
		word[n] = s.Substring(k);
		int max = 0;
		int min = 0;
		for (i = 0;i <= n;i++)
		{
			if (String.valueOf(word[max]).length() < String.valueOf(word[i]).length())
			{
				max = i;
			}
			if (String.valueOf(word[min]).length() > String.valueOf(word[i]).length())
			{
				min = i;
			}
		}
		System.out.println(word[max]);
		System.out.println(word[min]);
		return 0;
	}

}

