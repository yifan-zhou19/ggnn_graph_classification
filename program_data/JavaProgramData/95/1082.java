package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str1 = new String(new char[80]);
		String str2 = new String(new char[80]);
		int a;
		int i;
		int k = 0;
		str1 = new Scanner(System.in).nextLine();
		str2 = new Scanner(System.in).nextLine();
		a = str1.length();
		for (i = 0;i < a;i++)
		{
			if (str1.charAt(i) >= 'a' && str1.charAt(i) <= 'z')
			{
				str1 = tangible.StringFunctions.changeCharacter(str1, i, str1.charAt(i) - 32);
			}
			if (str2.charAt(i) >= 'a' && str2.charAt(i) <= 'z')
			{
				str2 = tangible.StringFunctions.changeCharacter(str2, i, str2.charAt(i) - 32);
			}
			if (str1.charAt(i) == str2.charAt(i))
			{
				k++;
				continue;
			}
			else if (str1.charAt(i) > str2.charAt(i))
			{
				System.out.print(">\n");
			}
			else
			{
				System.out.print("<\n");
			}
			break;
		}
		if (k == a)
		{
			System.out.print("=\n");
		}
		return 0;
	}
}

