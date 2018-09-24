package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[50]);
		String w = new String(new char[50]);
		String temp = new String(new char[50]);
		int lenS;
		int lenW;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			w = tempVar2.charAt(0);
		}
		lenS = s.length();
		lenW = w.length();
		for (i = 0;i < lenW;i++)
		{
			if (w.charAt(i) == s.charAt(0))
			{
				for (j = i;j < i + lenS;j++)
				{
				temp = tangible.StringFunctions.changeCharacter(temp, j - i, w.charAt(j));
				}
				if (strcmp(s,temp) == 0)
				{
					System.out.printf("%d",i);
					break;
				}
			}
		}
	}
}

