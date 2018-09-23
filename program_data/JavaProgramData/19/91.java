package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str1 = new String(new char[1000]);
		String str2 = new String(new char[100]);
		String str3 = new String(new char[100]);
		String str4 = new String(new char[100]);
		final String str5 = " ";
		final String str = "";
		int i;
		int k = 0;
		str1 = new Scanner(System.in).nextLine();
		str2 = new Scanner(System.in).nextLine();
		str3 = new Scanner(System.in).nextLine();
		for (i = 0;str1.charAt(i) != '\0';i++)
		{
			if (str1.charAt(i) != ' ')
			{
				str4 = tangible.StringFunctions.changeCharacter(str4, k, str1.charAt(i));
				k = k + 1;
			}
			else
			{
				str4 = tangible.StringFunctions.changeCharacter(str4, k, '\0');
				k = 0;
				if (strcmp(str4,str2) == 0)
				{
					str += str3;
				}
				else
				{
					str += str4;
				}
				str += str5;
			}
		}
		str4 = tangible.StringFunctions.changeCharacter(str4, k, '\0');
		if (strcmp(str4,str2) == 0)
		{
					str += str3;
		}
				else
				{
					str += str4;
				}
			System.out.printf("%s",str);
	}



}

