package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str1 = new String(new char[90]);
		String str2 = new String(new char[90]);
		int i;
		int m;
		int n;
		int s = 0;
		str1 = new Scanner(System.in).nextLine();
		str2 = new Scanner(System.in).nextLine();
		m = str1.length();
		n = str2.length();
		for (i = 0;i < m;i++)
		{
			if (str1.charAt(i) >= 'a')
			{
				str1 = tangible.StringFunctions.changeCharacter(str1, i, str1.charAt(i) - 'a'+'A');
			}
			if (str2.charAt(i) >= 'a')
			{
				str2 = tangible.StringFunctions.changeCharacter(str2, i, str2.charAt(i) - 'a'+'A');
			}
			if (str1.charAt(i) > str2.charAt(i))
			{
				System.out.print(">");
				s += 1;
				break;
			}
			if (str1.charAt(i) < str2.charAt(i))
			{
				System.out.print("<");
				s += 1;
				break;
			}
		}
		if (s == 0)
		{
			System.out.print("=");
		}
	}
}

