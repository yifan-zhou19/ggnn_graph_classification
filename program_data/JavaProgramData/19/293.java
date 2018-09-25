package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[1000]);
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		String word = new String(new char[100]);
		int i;
		int j = 0;
		int flag = 0;
		str = new Scanner(System.in).nextLine();
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		i = 0;
		while (str.charAt(i) != null)
		{
			if (str.charAt(i) == ' ')
			{
				if (flag != 0)
				{
					System.out.print(" ");
				}
				flag = 1;
				word = tangible.StringFunctions.changeCharacter(word, j, '\0');
				j = 0;
				if (strcmp(word,a) == 0)
				{
					System.out.printf("%s",b);
				}
				else
				{
					System.out.printf("%s",word);
				}
			}
			else
			{
				word = tangible.StringFunctions.changeCharacter(word, j, str.charAt(i));
				j++;
			}
			i++;
		}
		word = tangible.StringFunctions.changeCharacter(word, j, '\0');
		if (flag != 0)
		{
			System.out.print(" ");
		}
		if (strcmp(word,a) == 0)
		{
			System.out.printf("%s",b);
		}
		else
		{
			System.out.printf("%s",word);
		}

	}
}

