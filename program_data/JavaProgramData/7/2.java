package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String sub = new String(new char[257]);
		String s1 = new String(new char[257]);
		String s2 = new String(new char[257]);
		int i;
		int j;
		int k;
		int str1;
		int str2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			sub = tempVar.charAt(0);
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
		str1 = sub.length();
		str2 = s1.length();
		for (i = 0;i < str1;i++)
		{
			if (sub.charAt(i) == s1.charAt(0))
			{
				for (j = 0;j < str2;j++)
				{
					if (sub.charAt(i + j) != s1.charAt(j))
					{
						break;
					}
				}
				if (j == str2)
				{
					for (j = 0;j < str2;j++)
					{
						sub = tangible.StringFunctions.changeCharacter(sub, i + j, s2.charAt(j));
					}
					break;
				}
			}
		}
		System.out.printf("%s\n", sub);
		return 0;
	}
}

