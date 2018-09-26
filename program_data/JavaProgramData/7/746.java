package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int flag = 1;
		int i;
		int n;
		int m;
		int j;
		String str = new String(new char[256]);
		String sub = new String(new char[256]);
		String rep = new String(new char[256]);
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
			rep = tempVar3.charAt(0);
		}
		n = str.length();
		m = sub.length();
		for (i = 0;i < n;i++)
		{
			if (str.charAt(i) == sub.charAt(0))
			{
				flag = 1;
				for (j = 0;j < m;j++)
				{
					if (str.charAt(i + j) != sub.charAt(j))
					{
						flag = 0;
						break;
					}
				}
				if (flag == 1)
				{
					for (j = 0;j < m;j++)
					{
						str = tangible.StringFunctions.changeCharacter(str, i + j, rep.charAt(j));
					}
					break;
				}
			}
		}
		System.out.printf("%s",str);
		return 0;
	}

}

