package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[999]);
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		int i = 0;
		int j = 0;
		int k;
		int add;
		final String word = "";
		s = new Scanner(System.in).nextLine();
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		for (k = 0;s.charAt(k) != '\0';k++)
		{
			if (s.charAt(k) == ' ')
			{
				i++;
				j = 0;
			}
			else
			{
				word.charAt(i)[j] = s.charAt(k);
				j++;
			}

		}
		add = i;
		for (i = 0;i < add + 1;i++)
		{
			if (strcmp(word.charAt(i),a) == 0)
			{
				word = tangible.StringFunctions.changeCharacter(word, i, b);
			}
		}
		for (i = 0;i < add;i++)
		{
			System.out.printf("%s ",word.charAt(i));
		}
		System.out.println(word.charAt(i));
		return 0;
	}
}

