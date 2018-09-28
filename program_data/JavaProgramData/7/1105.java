package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[256]);
		String w = new String(new char[256]);
		String r = new String(new char[256]);
		int l1;
		int l2;
		int i;
		int j;
		int count;
		int k = 0;
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
		l1 = s.length();
		l2 = w.length();
		for (i = 0;i < l2 - l1 + 1;i++)
		{
			if (w.charAt(i) == s.charAt(0))
			{
				count = 1;
				for (j = i + 1;j < i + l1;j++)
				{
					if (w.charAt(j) != s.charAt(j - i))
					{
						break;
					}
					else
					{
						count++;
					}
				}
				if (count == l1)
				{
					k = 1;
					break;
				}
			}
		}
		if (k == 1)
		{
		for (j = i;j < i + l1;j++)
		{
			w = tangible.StringFunctions.changeCharacter(w, j, r.charAt(j - i));
		}
		}
		System.out.printf("%s\n",w);
	}
}

