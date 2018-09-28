package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final String str = "";
		final String a = "";
		int i;
		int m = 0;
		int n = 0;
		str = new Scanner(System.in).nextLine();
		for (i = 0;str.charAt(i) != '\0';i++)
		{
			if (str.charAt(i) != ' ')
			{
				a = tangible.StringFunctions.changeCharacter(a, i - n, str.charAt(i));
				m = 0;
			}
			else if (str.charAt(i) == ' ' && m == 0)
			{
				a = tangible.StringFunctions.changeCharacter(a, i - n, str.charAt(i));
				m = 1;
			}
			else if (str.charAt(i) == ' ' && m == 1)
			{
			n++;
			}
		}
		System.out.println(a);
		return 0;
	}

}

