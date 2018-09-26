package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[100]);
		String w = new String(new char[100]);
		String fangzhi = new String(new char[100]);
		int ls;
		int lw;
		int i;
		int j;
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
		ls = s.length();
		lw = w.length();
		for (i = 0;i < lw;i++)
		{
			if (w.charAt(i) == s.charAt(0))
			{
				for (j = i;j < ls + i;j++)
				{
					fangzhi = tangible.StringFunctions.changeCharacter(fangzhi, j - i, w.charAt(j));
				}
				fangzhi = tangible.StringFunctions.changeCharacter(fangzhi, ls, '\0');
			}
			if (strcmp(fangzhi,s) == 0)
			{
				System.out.printf("%d\n",i);
				break;
			}
		}
	}

}

