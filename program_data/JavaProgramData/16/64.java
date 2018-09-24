package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int l;
		String s = new String(new char[4]);
		String r = new String(new char[4]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		l = s.length();
		for (i = 0;i < l;i++)
		{
		  r = tangible.StringFunctions.changeCharacter(r, i, s.charAt(l - 1 - i));
		}
		for (i = 0;i < l;i++)
		{
		System.out.printf("%c",r.charAt(i));
		}
		System.in.read();
		System.in.read();
	}
}

