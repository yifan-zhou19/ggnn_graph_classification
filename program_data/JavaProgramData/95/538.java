package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int a;
		int b = 0;
		int c = 0;
		String str1 = new String(new char[80]);
		String str2 = new String(new char[80]);
		str1 = new Scanner(System.in).nextLine();
		System.out.print("\n");
		str2 = new Scanner(System.in).nextLine();
		a = str1.length();
		for (i = 0;i < a;i++)
		{
			if (str1.charAt(i) >= 'A' && str1.charAt(i) <= 'Z')
			{
				str1 = tangible.StringFunctions.changeCharacter(str1, i, str1.charAt(i) + 32);
			}
		}
		for (i = 0;i < a;i++)
		{
			if (str2.charAt(i) >= 'A' && str2.charAt(i) <= 'Z')
			{
				str2 = tangible.StringFunctions.changeCharacter(str2, i, str2.charAt(i) + 32);
			}
		}
		for (i = 0;i < a;i++)
		{
			if (str1.charAt(i) > str2.charAt(i))
			{
				b++;
				break;
			}
			else if (str1.charAt(i) < str2.charAt(i))
			{
				c++;
				break;
			}
			else
			{
				continue;
			}
		}
		if (b == 0 && c == 0)
		{
			System.out.print("=\n");
		}
		else if (b == 0 && c != 0)
		{
			System.out.print("<\n");
		}
		else
		{
			System.out.print(">\n");
		}
	}

}

