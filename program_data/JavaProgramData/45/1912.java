package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[50]);
		String w = new String(new char[50]);
		String p = new String(new char[50]);
		int i;
		int j;
		int flag = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			w = tempVar2.charAt(0);
		}
		for (i = 0;i < w.length();i++)
		{
			for (j = 0;j < s.length();j++)
			{
				p = tangible.StringFunctions.changeCharacter(p, j, w.charAt(i + j));
			}
			flag = 1;
			for (j = 0;j < s.length();j++)
			{
				if (p.charAt(j) != s.charAt(j))
				{
					flag = 0;
				}
			}
			if (flag != 0)
			{
				System.out.printf("%d",i);
				break;
			}
		}
	}


}

