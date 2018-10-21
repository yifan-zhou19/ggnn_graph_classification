package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		a = new Scanner(System.in).nextLine();
		int len = a.length();
		int i;
		int j;
		for (i = 0;i < len;i++)
		{
			if (a.charAt(i) == ' ')
			{
				for (j = 1;j < (len - 1 - i);j++)
				{
					if (a.charAt(i + j) == ' ')
					{
						a = tangible.StringFunctions.changeCharacter(a, i + j, '#');
					}
					else
					{
						break;
					}
				}
			}
		}
		for (i = 0;i < len;i++)
		{
			if (a.charAt(i) != '#')
			{
				System.out.printf("%c",a.charAt(i));
			}
		}
		return 0;

	}
}

