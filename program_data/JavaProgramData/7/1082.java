package <missing>;

public class GlobalMembers
{
	public static int Issubstr(tangible.RefObject<String> s, tangible.RefObject<String> subs)
	{
		int i;
		int j;
		for (i = 0;i < s.argValue.length();i++)
		{
			for (j = 0;j < subs.argValue.length();j++)
			{
				if (subs.argValue.charAt(j) != s.argValue.charAt(i + j))
				{
					break;
				}
			}
			if (j == subs.argValue.length())
			{
				break;
			}
		}
		if (i < s.argValue.length())
		{
			return i;
		}
		return -1;
	}
	public static int Main()
	{
		String s = new String(new char[257]);
		String sub = new String(new char[257]);
		String replace = new String(new char[257]);
		int i;
		int j = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			sub = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			replace = tempVar3.charAt(0);
		}
	tangible.RefObject<String> tempRef_s = new tangible.RefObject<String>(s);
	tangible.RefObject<String> tempRef_sub = new tangible.RefObject<String>(sub);
		for (i = Issubstr(tempRef_s, tempRef_sub);i != -1 && j < replace.length();i++)
		{
			sub = tempRef_sub.argValue;
			s = tempRef_s.argValue;
			s = tangible.StringFunctions.changeCharacter(s, i, replace.charAt(j++));
		}
		sub = tempRef_sub.argValue;
		s = tempRef_s.argValue;
		if (i > s.length())
		{
			s = tangible.StringFunctions.changeCharacter(s, i, '\0');
		}
		System.out.printf("%s",s);
		return 0;
	}
}

