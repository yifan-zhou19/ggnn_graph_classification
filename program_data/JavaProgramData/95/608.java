package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		String str1 = new String(new char[80]);
		String str2 = new String(new char[80]);
		str1 = new Scanner(System.in).nextLine();
		str2 = new Scanner(System.in).nextLine();
		for (i = 0;i < 79;i++)
		{
			if ((str1.charAt(i) >= 'A') && (str1.charAt(i) <= 'Z'))
			{
				str1 = tangible.StringFunctions.changeCharacter(str1, i, str1.charAt(i) + 32);
			}
			if ((str2.charAt(i) >= 'A') && (str2.charAt(i) <= 'Z'))
			{
				str2 = tangible.StringFunctions.changeCharacter(str2, i, str2.charAt(i) + 32);
			}
			if ((str1.charAt(i) == '\0') && (str2.charAt(i) == '\0'))
			{
				break;
			}
		}
			if (strcmp(str1,str2) > 0)
			{
				System.out.print(">\n");
			}
			else if (strcmp(str1,str2) < 0)
			{
				System.out.print("<\n");
			}
			else
			{
				System.out.print("=\n");
			}
			return 0;
	}


}

