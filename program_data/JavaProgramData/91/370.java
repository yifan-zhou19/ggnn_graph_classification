package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char c;
		String str = new String(new char[100]);
		String s1 = new String(new char[100]);
		int i;
		int num = 0;
		str = new Scanner(System.in).nextLine();
		for (i = 0;str.charAt(i) != '\0';i++)
		{
			num++;
		}
		for (i = 0;i < num - 1;i++)
		{
			s1 = tangible.StringFunctions.changeCharacter(s1, i, str.charAt(i + 1) + str.charAt(i));
		}
		s1 = tangible.StringFunctions.changeCharacter(s1, num - 1, str.charAt(num - 1) + str.charAt(0));
		s1 = tangible.StringFunctions.changeCharacter(s1, num, '\0');
		System.out.println(s1);
		return 0;
	}
}

