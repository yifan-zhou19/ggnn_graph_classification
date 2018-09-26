package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[257]);
		String ss = new String(new char[257]);
		String r = new String(new char[257]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			ss = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			r = tempVar3.charAt(0);
		}
		String left = new String(new char[257]);
		int i;
		int t;
		int k;
		int j;
		int ls = s.length();
		int lss = ss.length();

		for (i = 0;i < ls;i++)
		{
			t = 0;
			for (j = 0;j < lss;j++)
			{
				if (ss.charAt(j) == s.charAt(i + j))
				{
					t++;
				}
			}
			if (t == lss)
			{
				for (k = 0;k < ls - i - lss;k++)
				{
					left = tangible.StringFunctions.changeCharacter(left, k, s.charAt(k + i + t));
				}
				left = tangible.StringFunctions.changeCharacter(left, k, '\0');
				s = tangible.StringFunctions.changeCharacter(s, i, '\0');
				break;
			}
		}
		System.out.printf("%s",s);
		if (t == lss)
		{
		System.out.printf("%s",r);
		System.out.printf("%s",left);
		}
		return 0;
	}
}

