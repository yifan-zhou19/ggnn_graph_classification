package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[51]);
		String w = new String(new char[51]);
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
		int i;
		int k;
		int t = -1;
		for (i = 0;i <= (int)(w.length() - s.length());i++)
		{
			if (w.charAt(i) == s.charAt(0))
			{
				for (k = 0;k < (int)s.length();k++)
				{
					if (w.charAt(i + k) == s.charAt(k))
					{
						t = i;
					}
					else
					{
						t = -1;
						break;
					}
				}
			}
			if (t != -1)
			{
				break;
			}
		}
		if (t != -1)
		{
			System.out.printf("%d",t);
		}
		return 0;
	}


}

