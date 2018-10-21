package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		String str1 = new String(new char[81]);
		String str2 = new String(new char[81]);
		str1 = new Scanner(System.in).nextLine();
		str2 = new Scanner(System.in).nextLine();
		int i;
		int n = 0;
		for (i = 0;i <= 81 && str1.charAt(i) != '\0' && str2.charAt(i) != '\0';i++)
		{
			if (str1.charAt(i) < 97)
			{
				str1 = tangible.StringFunctions.changeCharacter(str1, i, str1.charAt(i) + 32);
			}
			if (str2.charAt(i) < 97)
			{
				str2 = tangible.StringFunctions.changeCharacter(str2, i, str2.charAt(i) + 32);
			}
			if (str1.charAt(i) < str2.charAt(i))
			{
				System.out.print("<");
				n = 1;
				break;
			}
			if (str1.charAt(i) > str2.charAt(i))
			{
				System.out.print(">");
				n = 1;
				break;
			}
		}
		if (n == 0)
		{
			System.out.print("=");
		}
	}


}

