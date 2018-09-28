package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int m;
		int n;
		int len;
		String s = new String(new char[100]);
		String s1 = new String(new char[100]);
		s = new Scanner(System.in).nextLine();
		len = s.length();
		for (i = 0;i < len - 1;i++)
		{
			s1 = tangible.StringFunctions.changeCharacter(s1, i, s.charAt(i) + s.charAt(i + 1));
			System.out.printf("%c",s1.charAt(i));
		}
		System.out.printf("%c",s.charAt(0) + s.charAt(len - 1));
		return 0;
	}


}

