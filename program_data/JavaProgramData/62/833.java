package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int len;
		int i;
		int k = -1;
		String s = new String(new char[100]);
		String h = new String(new char[100]);
		s = new Scanner(System.in).nextLine();
		len = s.length();
		for (i = 0;i < len;i++)
		{
			if ((s.charAt(i) == s.charAt(i + 1) && s.charAt(i) != ' ') || s.charAt(i) != ' ' || (s.charAt(i) == ' ' && s.charAt(i + 1) != ' '))
			{
				k++;
				h = tangible.StringFunctions.changeCharacter(h, k, s.charAt(i));
			}
		}
		h = tangible.StringFunctions.changeCharacter(h, k + 1, '\0');
		System.out.println(h);
		return 0;
	}
}

