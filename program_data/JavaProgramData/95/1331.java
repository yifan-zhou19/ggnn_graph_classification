package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String str1 = new String(new char[80]);
	String str2 = new String(new char[80]);
	int i;
	int m = 0;
	str1 = new Scanner(System.in).nextLine();
	str2 = new Scanner(System.in).nextLine();
	for (i = 0;str1.charAt(i) != '\0' && str2.charAt(i) != '\0';i++)
	{
	if (str1.charAt(i) >= 65 && str1.charAt(i) <= 90)
	{
		str1 = tangible.StringFunctions.changeCharacter(str1, i, str1.charAt(i) + 32);
	}
	if (str2.charAt(i) >= 65 && str2.charAt(i) <= 90)
	{
		str2 = tangible.StringFunctions.changeCharacter(str2, i, str2.charAt(i) + 32);
	}
	if (str1.charAt(i) > str2.charAt(i))
	{
		System.out.print(">\n");
		m = m + 1;
		break;
	}
	else if (str1.charAt(i) < str2.charAt(i))
	{
		System.out.print("<\n");
		m = m + 1;
		break;
	}


	}
	if (m == 0)
	{
		if (str1.charAt(i) == '\0' && str2.charAt(i) == '\0')
		{
		System.out.print("=");
		}
		else if (str1.charAt(i) != '\0')
		{
			System.out.print(">");
		}
		else
		{
			System.out.print("<");
		}


	}
	return 0;
	}
}

