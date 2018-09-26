package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str1 = new String(new char[1000]);
		String str2 = new String(new char[1000]);
		int i;
		int j;
		int k;
		str1 = new Scanner(System.in).nextLine();
		str2 = new Scanner(System.in).nextLine();
		for (i = 0;i < 1000;i++)
		{
				if (str1.charAt(i) > 64 && str1.charAt(i) < 91) //????????
				{
					str1 = tangible.StringFunctions.changeCharacter(str1, i, str1.charAt(i) + 32);
				}
				if (str2.charAt(i) > 64 && str2.charAt(i) < 91)
				{
					str2 = tangible.StringFunctions.changeCharacter(str2, i, str2.charAt(i) + 32);
				}
		}
		for (i = 0;i < 1000;i++)
		{
		if (str1.charAt(i) == '\0' && str2.charAt(i) == '\0')
		{
			System.out.print("=");
			break;
		}
		if (str1.charAt(i) > str2.charAt(i))
		{
			System.out.print(">");
			break;
		}
		if (str1.charAt(i) < str2.charAt(i))
		{
			System.out.print("<");
			break;
		}
		}
	}


}

