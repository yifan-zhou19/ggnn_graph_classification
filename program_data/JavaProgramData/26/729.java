package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int i;
		int j;
		int k;
		String str = new String(new char[101]);
		str = new Scanner(System.in).nextLine();
		for (i = 0;str.charAt(i) != '\0';i++)
		{
			if (str.charAt(i) == ' ')
			{
				if (str.charAt(i + 1) == ' ')
				{
					for (j = i + 1;;j++)
					{
						if (str.charAt(j) != ' ')
						{
							i = j;
							break;
						}
						str = tangible.StringFunctions.changeCharacter(str, j, '0');
					}
				}
			}
		}
		for (k = 0;str.charAt(k) != '\0';k++)
		{
			if (str.charAt(k) == '0')
			{
				continue;
			}
			else
			{
				System.out.printf("%c",str.charAt(k));
			}
		}
	}
}

