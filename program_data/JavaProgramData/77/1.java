package <missing>;

public class GlobalMembers
{
	public static int pos;

	public static void match(char lch)
	{
		int spos = pos;
		char ch;
		pos++;
		String tempVar = ConsoleInput.scanfRead(null, 1);
		if (tempVar != null)
		{
			ch = tempVar.charAt(0);
		}
		while (ch == lch)
		{
			match(ch);
			pos++;
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				ch = tempVar2.charAt(0);
			}
		}
		System.out.printf("%d %d\n", spos, pos);
	}

	public static int Main()
	{
		char ch;
		pos = 0;
		String tempVar = ConsoleInput.scanfRead(null, 1);
		if (tempVar != null)
		{
			ch = tempVar.charAt(0);
		}
		match(ch);
		return 0;
	}
}

