package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s1 = new String(new char[101]);
		String s2 = new String(new char[101]);
		int i;
		int count = 0;
		char c;
		s1 = new Scanner(System.in).nextLine();
		for (i = 0;(c = s1.charAt(i) != '\0');i++)
		{
			count++;
		}
		for (i = 0;i < count - 1;i++)
		{
			s2 = tangible.StringFunctions.changeCharacter(s2, i, s1.charAt(i) + s1.charAt(i + 1));
		}
		s2 = tangible.StringFunctions.changeCharacter(s2, count - 1, s1.charAt(count - 1) + s1.charAt(0));
		for (i = 0;i < count;i++)
		{
		System.out.printf("%c", s2.charAt(i));
		}
	}


}

