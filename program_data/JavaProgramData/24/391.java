package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[1000]);
		char[][] word = new char[50][20];
		int i;
		int j;
		int k = 0;
		int t = 0;
		int max = 0;
		int min = 0;
		s = new Scanner(System.in).nextLine();
		j = s.length();
		for (i = 0;i < j;i++)
		{
		if (!((s.charAt(i) >= 65 && s.charAt(i) <= 90) || (s.charAt(i) >= 96 && s.charAt(i) <= 122) || s.charAt(i) == 39 || s.charAt(i) == 32))
		{
			s = tangible.StringFunctions.changeCharacter(s, i, '\0');
		}
		}
		for (i = 0;s.charAt(i) != '\0';i++)
		{
			if (s.charAt(i) != ' ' && s.charAt(i) != '\0')
			{
			word[k][t++] = s.charAt(i);
			}
			else
			{
				word[k][t] = '\0';
				k++;
				t = 0;
			}
		}
		word[k][t] = '\0';
		k++;
		for (i = 0;i < k;i++)
		{
			if (String.valueOf(word[i]).length() > String.valueOf(word[max]).length())
			{
				max = i;
			}
			if (String.valueOf(word[i]).length() < String.valueOf(word[min]).length())
			{
				min = i;
			}
		}
		System.out.printf("%s\n%s",word[max],word[min]);
	}

}

