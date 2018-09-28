package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[3000]);
		String b = new String(new char[10]);
		String s = str;
		String p;
		int l;
		s = new Scanner(System.in).nextLine();
		s += " ";
		while (s != null)
		{
			p = tangible.StringFunctions.strChr(s,' ');
			p = '\0';
			b = s;
			l = b.length();
			if (l != 0)
			{
				System.out.printf("%d",l);
			}
			s = p.Substring(1);
			if (s != null && l != 0)
			{
				System.out.print(",");
			}
		}
		return 0;
	}


}

