package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int k1;
		int k2;
		String str1 = new String(new char[80]);
		String str2 = new String(new char[80]);
		str1 = new Scanner(System.in).nextLine();
		k1 = str1.length();
		str2 = new Scanner(System.in).nextLine();
		k2 = str2.length();
		for (i = 0;i < k1;i++)
		{
			if (str1.charAt(i) >= 'A' && str1.charAt(i) <= 'Z')
			{
				str1 = tangible.StringFunctions.changeCharacter(str1, i, str1.charAt(i) + 32);
			}
		}
		for (i = 0;i < k2;i++)
		{
			if (str2.charAt(i) >= 'A' && str2.charAt(i) <= 'Z')
			{
				str2 = tangible.StringFunctions.changeCharacter(str2, i, str2.charAt(i) + 32);
			}
		}
		i = 0;
		while ((str1.charAt(i) == str2.charAt(i)) && (str1.charAt(i) != '\0'))
		{
			i++;
		}
		if (str1.charAt(i) == '\0' && str2.charAt(i) == '\0')
		{
			System.out.print("=");
		}
		else if (str1.charAt(i) > str2.charAt(i))
		{
			System.out.print(">");
		}
		else
		{
			System.out.print("<");
		}
		return 0;
	}
}

