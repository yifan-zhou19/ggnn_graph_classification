package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int k = 1;
		final String str = "";
		str = new Scanner(System.in).nextLine();
		for (i = 0;i <= 1000;i++)
		{
			if (str.charAt(i) == '\0')
			{
				break;
			}
			if (str.charAt(i) != '\0')
			{
				if (str.charAt(i) >= 97 && str.charAt(i) <= 122)
				{
					str = tangible.StringFunctions.changeCharacter(str, i, str.charAt(i) - 32);
				}
				if (str.charAt(i + 1) >= 97 && str.charAt(i + 1) <= 122)
				{
					str = tangible.StringFunctions.changeCharacter(str, i + 1, str.charAt(i + 1) - 32);
				}
				if (str.charAt(i) == str.charAt(i + 1))
				{
					k++;
				}
				if (str.charAt(i) != str.charAt(i + 1))
				{
					System.out.printf("(%c,%d)",str.charAt(i),k);
					k = 1;
				}
			}
		}
	}
}

