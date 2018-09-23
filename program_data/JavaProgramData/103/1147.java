package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[1020]);
		int len;
		int i;
		int j = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		len = s.length();
		for (i = 0;i < len;i++)
		{
			if (s.charAt(i) <= 'z' && s.charAt(i) >= 'a')
			{
				s = tangible.StringFunctions.changeCharacter(s, i, s.charAt(i) - 'a'+'A');
			}
		}
		while (j != len)
		{
			int le = 1;
			for (i = j + 1;s.charAt(i) == s.charAt(j);i++)
			{
				le++,j++;
			}
			System.out.printf("(%c,%d)",s.charAt(j),le);
			j++;
		}
	}

}

