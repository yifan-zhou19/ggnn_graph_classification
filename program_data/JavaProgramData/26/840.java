package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String sentence = new String(new char[101]);
		String result = new String(new char[101]);
		sentence = new Scanner(System.in).nextLine();
		int l;
		l = sentence.length();
		int i;
		int j = 0;
		for (i = 0;i < l;i++)
		{
			while (sentence.charAt(i) == ' ' && sentence.charAt(i + 1) == ' ')
			{
				i++;
			}
			result = tangible.StringFunctions.changeCharacter(result, j, sentence.charAt(i));
			j++;
			if (i == l - 1)
			{
			result = tangible.StringFunctions.changeCharacter(result, j, '\0');

			}
		}
		int n = result.length();
		for (i = 0;i < n;i++)
		{
		System.out.printf("%c",result.charAt(i));
		}

		return 0;
	}
}

