package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[6]);
		String b = new String(new char[6]);
		int d;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		d = a.length();
		for (i = 0;i < d;i++)
		{
			a.charAt(i);
			b = tangible.StringFunctions.changeCharacter(b, d - i - 1, a.charAt(i));
		}
		b = tangible.StringFunctions.changeCharacter(b, d, '\0');
			System.out.printf("%s",b);
		return 0;
	}
}

