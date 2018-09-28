package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[300]);
		a = new Scanner(System.in).nextLine();
		for (int k = 200;k > 0;k--)
		{
		for (int i = 0;i < a.length();i++)
		{
			if (a.charAt(i) == ' ')
			{
				if (a.charAt(i + 1) == ' ')
				{
				for (int j = i + 1;j < a.length() - 1;j++)
				{
					a = tangible.StringFunctions.changeCharacter(a, j, a.charAt(j + 1));
				}
				a = tangible.StringFunctions.changeCharacter(a, a.length() - 1, '\0');
				}

			}
		}
		}
		System.out.printf("%s",a);
	return 0;
	}
}

