package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		String w = new String(new char[256]);
		String s = new String(new char[256]);
		String r = new String(new char[256]);
		int len1;
		int len2;
		int len3;
		int i;
		int j;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			w = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			r = tempVar3.charAt(0);
		}
		len1 = (int)s.length();
		len2 = (int)w.length();
		len3 = (int)r.length();
		for (i = 0;i < len2;i++)
		{
			if (w.charAt(i) == s.charAt(0))
			{
				for (j = 1;j < len1;j++)
				{
					if (s.charAt(j) != w.charAt(i + j))
					{
						break;
					}
				}
			}
			if (j == len1)
			{
				for (k = 0;k < len3;k++)
				{
					w = tangible.StringFunctions.changeCharacter(w, i + k, r.charAt(k));
				}
				break;
			}

		}
		System.out.printf("%s",w);


	}
}

