package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		String str = new String(new char[255]);
		String from = new String(new char[255]);
		String to = new String(new char[255]);
		String s = str;
		String p;
		s = new Scanner(System.in).nextLine();
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			from = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			to = tempVar2.charAt(0);
		}
		s += " ";
		while (s != null)
		{
			p = tangible.StringFunctions.strChr(s,' ');
			p = '\0';
			System.out.print((strcmp(s,from) == 0)?to:s);
			s = p.Substring(1);
			if (s != null)
			{
				System.out.print(" ");
			}
		}
	}

}

