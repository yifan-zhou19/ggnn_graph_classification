package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s1 = new String(new char[5]);
		String s2 = new String(new char[5]);
		int i;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s1 = tempVar.charAt(0);
		}
		t = s1.length();
		for (i = 0;i < t;i++)
		{
			s2 = tangible.StringFunctions.changeCharacter(s2, i, s1.charAt(t - i - 1));
		System.out.printf("%c",s2.charAt(i));
		}
	}

}

