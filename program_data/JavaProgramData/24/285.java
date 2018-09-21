package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 0;
		int j;
		String str = new String(new char[500]);
		String a = new String(new char[100]);
		String min = new String(new char[100]);
		String max = new String(new char[100]);

		str = new Scanner(System.in).nextLine();
		for (i = 0;str.charAt(i) != ' ';i++)
		{
			a = tangible.StringFunctions.changeCharacter(a, i, str.charAt(i));
		}
		a = tangible.StringFunctions.changeCharacter(a, i, '\0');

		max = a;
		min = a;
		i++;

		for (; str.charAt(i);i++)
		{
			for (j = 0;str.charAt(i) != ' ' && str.charAt(i) != '\0';i++, j++)
			{
				a = tangible.StringFunctions.changeCharacter(a, j, str.charAt(i));
			}
			a = tangible.StringFunctions.changeCharacter(a, j, '\0');
			if (max.length() < a.length())
			{
				max = a;
			}
			if (min.length() > a.length())
			{
				min = a;
			}
			if (str.charAt(i) == '\0')
			{
				break;
			}
		}
		System.out.printf("%s\n", max);
		System.out.printf("%s\n", min);
		return 0;
	}

}

