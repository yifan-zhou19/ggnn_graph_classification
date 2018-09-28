package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[500]);
		String su = new String(new char[500]);
		String re = new String(new char[500]);
		int len1;
		int len2;
		int i;
		int j;
		int k;
		int l;
		int m = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			su = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			re = tempVar3.charAt(0);
		}
		len1 = s.length();
		len2 = su.length();
		for (i = 0;i < len1 - len2 + 1;i++)
		{
			k = 0;
			for (j = 0;j < len2;j++)
			{
				if (s.charAt(i + j) != su.charAt(j))
				{
				break;
				}
				else
				{
				k++;
				}
			}
			if (k == len2)
			{
				m++;
				for (l = 0;l < len2;l++)
				{
				s = tangible.StringFunctions.changeCharacter(s, i + l, re.charAt(l));
				}
			}
			if (m == 1)
			{
				break;
			}
		}
		System.out.printf("%s",s);


		return 0;
	}
}

