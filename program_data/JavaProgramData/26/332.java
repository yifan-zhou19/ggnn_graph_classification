package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str1 = new String(new char[100]);
		String str2 = new String(new char[100]);
		int i;
		int len;
		int j = 0;
		str1 = new Scanner(System.in).nextLine();
		len = str1.length();
		for (i = 0;i < len;i++)
		{
			if (str1.charAt(i) != ' ')
			{
				str2 = tangible.StringFunctions.changeCharacter(str2, j, str1.charAt(i));
				j++;
			}
			else
			{
				if (str1.charAt(i + 1) != ' ')
				{
					str2 = tangible.StringFunctions.changeCharacter(str2, j, str1.charAt(i));
					j++;
				}
			}
		}
		str2 = tangible.StringFunctions.changeCharacter(str2, j, '\0');
		System.out.printf("%s",str2);
	}
}

