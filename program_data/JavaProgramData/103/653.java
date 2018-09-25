package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[1000]);
		str = new Scanner(System.in).nextLine();
		int i;
		for (i = 0;i < str.length();i++)
		{
			if (str.charAt(i) < 'a')
			{
			str = tangible.StringFunctions.changeCharacter(str, i, Character.toLowerCase(str.charAt(i)));
			}
		}
		int a = 1;
		for (i = 0;i < str.length();i++)
		{
			if (str.charAt(i) != str.charAt(i + 1))
			{
			System.out.printf("(%c,%d)",str.charAt(i) - 'a'+'A',a);
			a = 1;
			}
			else
			{
				a++;
			}
		}

	}
}

