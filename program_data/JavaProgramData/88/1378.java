package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j = 0;
		String c = new String(new char[30]);
		String str = new String(new char[30]);
		c = new Scanner(System.in).nextLine();
		for (i = 0;c.charAt(i - 1) != '\0';i++)
		{
			if (c.charAt(i) <= '9' && c.charAt(i) >= '0')
			{
				str = tangible.StringFunctions.changeCharacter(str, j, c.charAt(i),j++);
			}
			else
			{
				if (j != 0)
				{
				str = tangible.StringFunctions.changeCharacter(str, j, '\0',System.out.printf("%s\n",str),j = 0);
				}
			}
		}
			return 0;
	}


}

