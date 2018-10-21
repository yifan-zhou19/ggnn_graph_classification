package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str1 = new String(new char[1000]);
		String str2 = new String(new char[1000]);
		str1 = new Scanner(System.in).nextLine();
		str2 = new Scanner(System.in).nextLine();
		for (int i = 0; i < str1.length(); i++)
		{
			if ((str1.charAt(i) <= 'Z') && (str1.charAt(i) >= 'A'))
			{
				str1 = tangible.StringFunctions.changeCharacter(str1, i, str1.charAt(i) - ('A' - 'a'));
			}
		}
		for (int i = 0; i < str2.length(); i++)
		{
			if ((str2.charAt(i) <= 'Z') && (str2.charAt(i) >= 'A'))
			{
				str2 = tangible.StringFunctions.changeCharacter(str2, i, str2.charAt(i) - ('A' - 'a'));
			}
		}

		//cout << str1 << endl << str2 << endl;
		int i = strcmp(str1,str2);
		//cout << i << endl;
		if (i == 0)
		{
			System.out.print('=');
		}
		else
		{
			if (i > 0)
			{
				System.out.print('>');
			}
			else
			{
				System.out.print('<');
			}
		}
	}
}

