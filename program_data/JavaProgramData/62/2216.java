package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String ch = new String(new char[101]);
		ch = new Scanner(System.in).nextLine();
		for (int i = 0;i < ch.length() - 1;i++)
		{
			if (ch.charAt(i) == ' ' && ch.charAt(i + 1) == ' ')
			{
				for (int j = i;j < ch.length();j++)
				{
					ch = tangible.StringFunctions.changeCharacter(ch, j, ch.charAt(j + 1));

				}
				i = i - 1;
			}
		}
		System.out.print(ch);
		System.out.print("\n");
		return 0;
	}
}

