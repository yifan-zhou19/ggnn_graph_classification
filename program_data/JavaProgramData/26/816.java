package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[200]);
		int i;
		for (i = 0;i < 200;i++)
		{
			str = tangible.StringFunctions.changeCharacter(str, i, 'a');
		}
		str = new Scanner(System.in).nextLine();
		for (i = 0;i < str.length();i++)
		{
			if (str.charAt(i) != ' ')
			{
				System.out.print(str.charAt(i));
			}
			else
			{
				if (str.charAt(i + 1) != ' ')
				{
					System.out.print(str.charAt(i));
				}
			}
		}
		System.out.print("\n");
		return 0;
	}
}

