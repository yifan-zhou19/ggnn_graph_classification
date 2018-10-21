package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int len;
		int i;
		int j;
		final String line1 = "";
		final String line2 = "";
		line1 = new Scanner(System.in).nextLine();
		len = line1.length();
		for (i = 0;line1.charAt(i) == ' ';i++)
		{
			;
		}
		line2 = tangible.StringFunctions.changeCharacter(line2, 0, line1.charAt(i));
		i++;
		for (j = 0;i < len;i++)
		{
			if (line1.charAt(i) == ' ' && line2.charAt(j) == ' ')
			{
				continue;
			}
			else
			{
				j++;
				line2 = tangible.StringFunctions.changeCharacter(line2, j, line1.charAt(i));
			}
		}
		len = line2.length();
		if (line2.charAt(len - 1) == ' ')
		{
			line2 = tangible.StringFunctions.changeCharacter(line2, len - 1, '\0');
		}
		System.out.printf("%s",line2);
	}

}

