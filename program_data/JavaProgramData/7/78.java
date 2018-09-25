package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int t = 0;
		String str = new String(new char[260]);
		String sub = new String(new char[20]);
		String rep = new String(new char[20]);
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
		for (i = 0;i < str.length();i++)
		{
			if (str.charAt(i) == sub.charAt(0))
			{
				for (j = i + 1;j < i + sub.length();j++)
				{
					if (str.charAt(j) != sub.charAt(j - i))
					{
						t = 1;
					}
				}
				if (t == 0)
				{
					for (int k = i;k < i + sub.length();k++)
					{
						str = tangible.StringFunctions.changeCharacter(str, k, rep.charAt(k - i));
					}
					break;
				}
			}

		t = 0;
		}
		System.out.printf("%s",str);
		return 0;
	}
}

