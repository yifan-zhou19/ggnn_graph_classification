package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s1 = new String(new char[101]);
		String s2 = new String(new char[101]);
		String instead1 = new String(new char[101]);
		String instead2 = new String(new char[101]);
		String temp = new String(new char[101]);
		s1 = new Scanner(System.in).nextLine();
		instead1 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		instead2 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int i;
		int j;
		int count = 0;
		int countS2 = 0;
		for (i = 0;i < s1.length() + 1;i++)
		{
			if (s1.charAt(i) != ' ' && s1.charAt(i) != '\0')
			{
				temp = tangible.StringFunctions.changeCharacter(temp, count++, s1.charAt(i));
			}
			else
			{
				temp = tangible.StringFunctions.changeCharacter(temp, count, '\0');
				if (!strcmp(temp,instead1))
				{
					for (j = 0;j < instead2.length();j++)
					{
						s2 = tangible.StringFunctions.changeCharacter(s2, countS2++, instead2.charAt(j));
					}
				}
				else
				{
					for (j = i - count;j < i - count + temp.length();j++)
					{
						s2 = tangible.StringFunctions.changeCharacter(s2, countS2++, s1.charAt(j));
					}
				}
				count = 0;
			}
			if (s1.charAt(i) == ' ')
			{
				s2 = tangible.StringFunctions.changeCharacter(s2, countS2++, s1.charAt(i));
			}
		}
		s2 = tangible.StringFunctions.changeCharacter(s2, countS2, '\0');
		System.out.print(s2);
		System.out.print("\n");
		return 0;
	}
}

