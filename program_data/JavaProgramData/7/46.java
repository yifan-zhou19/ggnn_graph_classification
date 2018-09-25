package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[256]);
		String sub = new String(new char[256]);
		String re = new String(new char[256]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			sub = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			re = tempVar3.charAt(0);
		}
		int l1;
		int l2;
		l1 = str.length();
		l2 = sub.length();
		int i;
		int j;
		int m;
		for (i = 0;i < l1;i++)
		{
			m = 1;
			for (j = 0;j < l2;j++)
			{
				if (str.charAt(i + j) != sub.charAt(j))
				{
					m = 2;
				}
			}
			if (m == 1)
			{
				for (j = 0;j < l2;j++)
				{
					str = tangible.StringFunctions.changeCharacter(str, i + j, re.charAt(j));
				}
				break;
			}
		}
		System.out.printf("%s\n",str);
		return 0;
	}
}

