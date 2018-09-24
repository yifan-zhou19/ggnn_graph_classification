package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[100]);
		char t;
		int i;
		int count = 0;
		str = new Scanner(System.in).nextLine();
		for (i = 0; str.charAt(i) != '\0'; i++)
		{
			if (str.charAt(i) != ' ' || str.charAt(i - 1) != ' ')
			{
				count++;
			}
		}
		for (i = 0; i < count; i++)
		{
			if (str.charAt(i) == ' ' && str.charAt(i + 1) == ' ')
			{
				for (int j = i + 1; str.charAt(j + 1) != '\0'; j++)
				{
					t = str.charAt(j);
					str = tangible.StringFunctions.changeCharacter(str, j, str.charAt(j + 1));
					str = tangible.StringFunctions.changeCharacter(str, j + 1, t);
				}
				if (str.charAt(i + 1) == ' ')
				{
					i--;
				}
			}
		}
		for (i = 0; i < count; i++)
		{
			System.out.print(str.charAt(i));
		}
		System.out.print("\n");
		return 0;
	}
}

