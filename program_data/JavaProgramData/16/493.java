package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[20]);
		int l;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		l = s.length();
		for (i = l - 1; i >= 0; i--)
		{
			System.out.printf("%c", s.charAt(i));
		}
		return 0;
	}

}

