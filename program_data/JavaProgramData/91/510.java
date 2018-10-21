package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[100]);
		s = new Scanner(System.in).nextLine();
		String s1 = new String(new char[100]);
		int i;
		int len;
		len = s.length();
		for (i = 0;i < len;i++)
		{
			if (i < len - 1)
			{
				s1 = tangible.StringFunctions.changeCharacter(s1, i, s.charAt(i) + s.charAt(i + 1));
			}
			else
			{
				s1 = tangible.StringFunctions.changeCharacter(s1, i, s.charAt(i) + s.charAt(0));
			}
		}
		for (i = 0;i < len;i++)
		{
			System.out.printf("%c",s1.charAt(i));
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			len = Integer.parseInt(tempVar);
		}
		return 0;
	}
}

