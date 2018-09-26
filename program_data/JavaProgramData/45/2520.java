package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a = 0;
		int i = 0;
		int j = 0;
		int k = 0;
		int l1 = 0;
		int l2 = 0;
		int script = 0;
		int temp = 0;
		String s = new String(new char[LEN]);
		String w = new String(new char[LEN]);
		String e = new String(new char[LEN + 1]);
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
		l1 = s.length();
		l2 = w.length();
		temp = l2 - l1 + 1;
		for (j = 0;j < temp;j++)
		{
			for (i = 0;i < l1;i++)
			{
				e = tangible.StringFunctions.changeCharacter(e, i, w.charAt(i + j));
			}
			for (k = 0;k < l1;k++)
			{
				if (s.charAt(k) == e.charAt(k))
				{
				  a = j;
				  script = 1;
				}
				else
				{
				  script = 0;
				  break;
				}
			}
			if (script == 1)
			{
				System.out.printf("%d",a);
			   break;
			}
		}
	return 0;
	}
}

