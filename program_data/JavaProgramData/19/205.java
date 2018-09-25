package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		int i;
		int n;

		String s = new String(new char[120]);
		String word = new String(new char[120]);
		String a = new String(new char[120]);
		String b = new String(new char[120]);

		s = new Scanner(System.in).nextLine();

		a = new Scanner(System.in).nextLine();


		b = new Scanner(System.in).nextLine();


		for (i = 0;s.charAt(i) != ' ' && s.charAt(i) != '\0';i++)
		{
			word = tangible.StringFunctions.changeCharacter(word, i, s.charAt(i));

		}
		word = tangible.StringFunctions.changeCharacter(word, i, '\0');
		if (strcmp(word,a) == 0)
		{

			System.out.printf("%s",b);
		}
		else
		{
			System.out.printf("%s",word);
		}
		n = i;
	while (s.charAt(i) != '\0')
	{
		i++;

		for (;s.charAt(i) != ' ' && s.charAt(i) != '\0';i++)
		{
			word = tangible.StringFunctions.changeCharacter(word, i - n - 1, s.charAt(i));


		}

		word = tangible.StringFunctions.changeCharacter(word, i - n - 1, '\0');
		if (strcmp(word,a) == 0)
		{

			System.out.printf(" %s",b);
		}
		else
		{
			System.out.printf(" %s",word);
		}


	n = i;
	}

	return 0;
	}

}

