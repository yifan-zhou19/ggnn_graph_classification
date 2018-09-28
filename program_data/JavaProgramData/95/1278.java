package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String string1 = new String(new char[1000]);
		String string2 = new String(new char[1000]);
		string1 = new Scanner(System.in).nextLine();
		string2 = new Scanner(System.in).nextLine();
		int i;
		int n1;
		int n2;
		n1 = string1.length();
		n2 = string2.length();
		for (i = 0;i < n1;i++)
		{
						 if (string1.charAt(i) >= 65 && string1.charAt(i) <= 90)
						 {
														   string1 = tangible.StringFunctions.changeCharacter(string1, i, string1.charAt(i) + 32);
						 }

						 if (string2.charAt(i) >= 65 && string2.charAt(i) <= 90)
						 {
														   string2 = tangible.StringFunctions.changeCharacter(string2, i, string2.charAt(i) + 32);
						 }
		}
		if (strcmp(string1,string2) == 0)
		{
									  System.out.print("=");
		}
		if (strcmp(string1,string2) > 0)
		{
									 System.out.print(">");
		}
		if (strcmp(string1,string2) < 0)
		{
									 System.out.print("<");

		}
		return 0;
	}

}

