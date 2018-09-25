package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String ch = new String(new char[110]);
		String temp = new String(new char[110]);
		String c = new String(new char[110]);
		int i;
		int figure;
		while (gets(ch))
		{
			figure = 0;
			for (i = 0;ch.charAt(i) != '\0';i++)
			{
				temp = tangible.StringFunctions.changeCharacter(temp, i, ' ');
			switch (ch.charAt(i))
			{
	case '(':
		c = tangible.StringFunctions.changeCharacter(c, figure++, i);
		temp = tangible.StringFunctions.changeCharacter(temp, i, '$');
		break;
	case ')':
		if (figure != 0)
		{
			figure--;
			temp = tangible.StringFunctions.changeCharacter(temp, c.charAt(figure), ' ');
		}
			 else
			 {
				 temp = tangible.StringFunctions.changeCharacter(temp, i, '?');
			 }
			 break;
			}
			}
			temp = tangible.StringFunctions.changeCharacter(temp, i, '\0');
			System.out.printf("%s\n%s\n",ch,temp);
		}
		return 0;
	}
}

