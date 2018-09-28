package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[300]);
		String s = new String(new char[100]);
		String r = new String(new char[100]);
		int i;
		int j;
		int k;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str = tempVar.charAt(0);
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
		m = s.length();
		for (i = 0;str.charAt(i) != '\0';i++)
		{
			k = 0;
			for (j = 0;j < m;j++)
			{
				if (str.charAt(i + j) == s.charAt(j))
				{
					k++;
				}
			}
			if (k == m)
			{
				for (j = 0;j < m;j++)
				{
					str = tangible.StringFunctions.changeCharacter(str, i + j, r.charAt(j));
				}
				break;
			}
		}
		System.out.printf("%s",str);
		return 0;
	}
}

