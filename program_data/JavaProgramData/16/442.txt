package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[6]);
		String t = new String(new char[6]);
		int i;
		int x;
		s = new Scanner(System.in).nextLine();
		x = s.length();
		for (i = 0;i <= x - 1;i++)
		{
			t = tangible.StringFunctions.changeCharacter(t, x - 1 - i, s.charAt(i));
		}
		for (i = x;i <= 5;i++)
		{
			t = t.substring(0, i);
		}
		System.out.println(t);
	}

}

