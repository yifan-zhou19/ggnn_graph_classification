package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s1 = new String(new char[255]);
		String s2 = new String(new char[255]);
		int i;
		int t;
		s1 = new Scanner(System.in).nextLine();
		s2 = new Scanner(System.in).nextLine();
		for (i = 0;s1.charAt(i) && s2.charAt(i);i++)
		{
			if (s1.charAt(i) >= 'a' && s1.charAt(i) <= 'z')
			{
				s1 = tangible.StringFunctions.changeCharacter(s1, i, s1.charAt(i) - 'a'+'A');
			}
			if (s2.charAt(i) >= 'a' && s2.charAt(i) <= 'z')
			{
				s2 = tangible.StringFunctions.changeCharacter(s2, i, s2.charAt(i) - 'a'+'A');
			}
			if (s1.charAt(i) != s2.charAt(i))
			{
				System.out.print((s1.charAt(i) > s2.charAt(i))?">":"<");
				break;
			}
		}
		t = strcmp(s1,s2);
		if (t == 0)
		{
			System.out.print("=");
		}
	}


}

