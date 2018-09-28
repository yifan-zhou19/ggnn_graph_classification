package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[256]);
		String sub = new String(new char[256]);
		String re = new String(new char[256]);
		int t;
		int i;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead("\n");
		if (tempVar2 != null)
		{
			sub = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead("\n");
		if (tempVar3 != null)
		{
			re = tempVar3.charAt(0);
		}
		t = sub.length();
		for (i = 0;i < s.length() - t + 1;i++)
		{
			int x = 0;
			for (k = i;k < i + t;k++)
			{
				if (s.charAt(k) != sub.charAt(k - i))
				{
					x += 1;
				}
			}
			if (x == 0)
			{
				for (k = i;k < i + t;k++)
				{
					s = tangible.StringFunctions.changeCharacter(s, k, re.charAt(k - i));
				}
				break;
			}
		}
		System.out.printf("%s",s);
		return 0;
	}

}

