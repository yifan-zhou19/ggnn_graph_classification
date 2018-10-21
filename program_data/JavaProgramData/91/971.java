package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s1 = new String(new char[100]);
		String s2 = new String(new char[100]);
		s1 = new Scanner(System.in).nextLine();
		int i;
		int l = s1.length();
		for (i = 0;i <= l - 1;i++)
		{
			s2 = tangible.StringFunctions.changeCharacter(s2, i, s1.charAt(i) + s1.charAt((i + 1) % l));
		}
		s2 = s2.substring(0, l);
		System.out.println(s2);
	}
}

