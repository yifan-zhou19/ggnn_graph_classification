package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		final String str1 = "\0";
		final String str2 = "\0";
		int i;
		int j;
		int k = 0;
		str1 = new Scanner(System.in).nextLine();
		for (i = 0,k = 0,j = 1;str1.charAt(j) != '\0';i++,j++,k++)
		{
			str2 = tangible.StringFunctions.changeCharacter(str2, k, str1.charAt(i) + str1.charAt(j));
		}
		str2 = tangible.StringFunctions.changeCharacter(str2, k, str1.charAt(i) + str1.charAt(0));
		for (i = 0;str2.charAt(i) != '\0';i++)
		{
			System.out.printf("%c",str2.charAt(i));
		}
	}



}

