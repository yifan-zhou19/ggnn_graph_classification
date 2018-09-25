package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str1 = new String(new char[100]);
		String str2 = new String(new char[100]);
		int i;
		int k = 0;
		str1 = new Scanner(System.in).nextLine();
		str2 = new Scanner(System.in).nextLine();

		for (i = 0;str1.charAt(i) != '\0';i++)
		{
			str1 = tangible.StringFunctions.changeCharacter(str1, i, (str1.charAt(i) >= 'A' && str1.charAt(i) <= 'Z')?(str1.charAt(i) + 32):str1.charAt(i)); //?????????????[i]����
		}
		for (i = 0;str1.charAt(i) != '\0';i++)
		{
			str2 = tangible.StringFunctions.changeCharacter(str2, i, (str2.charAt(i) >= 'A' && str2.charAt(i) <= 'Z')?(str2.charAt(i) + 32):str2.charAt(i));
		}


		for (i = 0;str1.charAt(i) != '\0';i++)
		{
			if (str1.charAt(i) > str2.charAt(i))
			{
				System.out.print(">");
				k = 1;
				break;
			}
			else if (str1.charAt(i) < str2.charAt(i))
			{
				System.out.print("<");
				k = 1;
				break;
			}
		}

		if (k == 0)
		{
		System.out.print("=");
		}
	}
}

