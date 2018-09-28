package <missing>;

public class GlobalMembers
{
	public static String s1 = new String(new char[10000]);
	public static String s2 = new String(new char[10000]);
	public static String s = new String(new char[10000]);
	public static int Len(tangible.RefObject<String> s)
	{
		int i;
		for (i = 0;s.argValue.charAt(i);i++)
		{
			;
		}
		return i;
	}
	public static int Match(tangible.RefObject<String> s1, tangible.RefObject<String> s2)
	{
		int i;
		int l = Len(s2);
		for (i = 0;i < l;i++)
		{
			if (s1.argValue.charAt(i) != s2.argValue.charAt(i))
			{
				return 0;
			}
		}
		return 1;
	}
	public static int Find(tangible.RefObject<String> s, tangible.RefObject<String> s1)
	{
		int i;
		int l = Len(s);
		for (i = 0;i < l;i++)
		{
			if (Match(s.argValue.Substring(i), s1) != 0)
			{
				return i;
			}
		}
		return l;
	}
	public static int Main()
	{
		int l;
		int i;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s1 = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			s2 = tempVar3.charAt(0);
		}
	tangible.RefObject<String> tempRef_s = new tangible.RefObject<String>(s);
		l = Len(tempRef_s);
		s = tempRef_s.argValue;
	tangible.RefObject<String> tempRef_s2 = new tangible.RefObject<String>(s);
	tangible.RefObject<String> tempRef_s1 = new tangible.RefObject<String>(s1);
		t = Find(tempRef_s2, tempRef_s1);
		s1 = tempRef_s1.argValue;
		s = tempRef_s2.argValue;
		if (t == l)
		{
			System.out.printf("%s\n",s);
		}
		else
		{
			for (i = 0;i < t;i++)
			{
				System.out.printf("%1c",s.charAt(i));
			}
			System.out.printf("%s",s2);
		tangible.RefObject<String> tempRef_s12 = new tangible.RefObject<String>(s1);
			for (i = Len(tempRef_s12) + t;i < l;i++)
			{
				s1 = tempRef_s12.argValue;
				System.out.printf("%1c",s.charAt(i));
			}
			s1 = tempRef_s12.argValue;
			System.out.print("\n");
		}
		return 0;
	}


}

