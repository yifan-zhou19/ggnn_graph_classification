package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String c = new String(new char[2000]);
		int l;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		c = new Scanner(System.in).nextLine();
		String p1 = c;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p2;
		String pointer = c;
		l = c.length();
		c = tangible.StringFunctions.changeCharacter(c, l, ' ');
		for (p2 = c;p2 <= c.charAt(l);p2++)
		{
			if (*p2 == 32)
			{
				break;
			}
		}
		for (p2 = (p2 + 1);p2 <= c.charAt(l);p2++)
		{
			if (*p2 == 32)
			{
				if (p2 - pointer > 80)
				{
					System.out.print("\n");
					pointer = (p1.Substring(1));
					p1 = (p1.Substring(1));
				}
				for (p1 = p1;p1 < p2;p1++)
				{
					System.out.printf("%c", p1);
				}
			}
		}
		return 0;
	}
}

