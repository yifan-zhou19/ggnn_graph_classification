package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		int l = a.length();
		int m = 0;
		int i;
		for (i = 0;i < l;i++)
		{
			b = tangible.StringFunctions.changeCharacter(b, i, (10 * m + a.charAt(i) - '0') / 13 + '0');
			m = (10 * m + a.charAt(i) - '0') % 13;
		}
		b = tangible.StringFunctions.changeCharacter(b, i, '\0');
		b = b.Substring(1);
		if (b.charAt(0) == '\0' || b.charAt(0) == '0' && b.charAt(1) == '\0')
		{
			System.out.printf("0\n%d",m);
		}
		else if (b.charAt(0) == '0')
		{
			b = b.Substring(1);
			System.out.printf("%s\n%d",b,m);
		}
		else
		{
			System.out.printf("%s\n%d",b,m);
		}

	}
}

