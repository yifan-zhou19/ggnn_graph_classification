package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[5]);
		char t;
		int i;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		n = s.length();
		for (i = 0;i < n / 2;i++)
		{
			t = s.charAt(n - i - 1);
			s = tangible.StringFunctions.changeCharacter(s, n - i - 1, s.charAt(i));
			s = tangible.StringFunctions.changeCharacter(s, i, t);
		}
		for (i = 0;i < n;i++)
		{
		System.out.printf("%c",s.charAt(i));
		}
	}
}

